package greenthumb;

import java.util.List;
import java.util.Scanner;

/** GreenThumb - Smart Plant Care Manager (console application). */
public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final Garden garden = new Garden();
    private static final Database db = new Database();
    private static ReminderThread reminder;
    private static Thread reminderThread;

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   GreenThumb - Smart Plant Care Manager");
        System.out.println("==========================================");
        boolean dbReady = db.connect();
        System.out.println(dbReady ? "Database connected (SQLite)."
                : "Database driver not found -> Save/Load disabled (see README).");

        boolean exit = false;
        while (!exit) {
            printMenu();
            String choice = ask("Enter choice: ");
            try {
                switch (choice) {
                    case "1": addPlant(); break;
                    case "2": viewAll(); break;
                    case "3": waterPlant(); break;
                    case "4": showThirsty(); break;
                    case "5": skipDay(); break;
                    case "6": toggleAutoReminder(); break;
                    case "7": report(); break;
                    case "8": showTip(); break;
                    case "9": removePlant(); break;
                    case "10": saveToDb(dbReady); break;
                    case "11": loadFromDb(dbReady); break;
                    case "0": exit = true; break;
                    default: System.out.println("Invalid choice, try again.");
                }
            } catch (PlantCareException e) {
                System.out.println("Problem: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Something went wrong: " + e.getMessage());
            }
        }
        stopReminder();
        db.close();
        System.out.println("Bye! Your plants say thank you.");
    }

    private static void printMenu() {
        System.out.println("\n----- Garden Day " + garden.getDay() + " -----");
        System.out.println(" 1. Add plant          2. View all plants");
        System.out.println(" 3. Water a plant      4. Show thirsty plants");
        System.out.println(" 5. Skip one day       6. Start/Stop auto reminder (thread)");
        System.out.println(" 7. Garden report      8. Care tip");
        System.out.println(" 9. Remove plant      10. Save to database");
        System.out.println("11. Load from database 0. Exit");
    }

    private static String ask(String msg) {
        System.out.print(msg);
        if (!sc.hasNextLine()) return "0";                    // end of input -> exit
        return sc.nextLine().trim();
    }

    private static void addPlant() throws PlantCareException {
        String type = ask("Type (succulent / flower / herb): ");
        String name = ask("Give your plant a name: ");
        if (name.isEmpty()) throw new PlantCareException("Name cannot be empty.");
        garden.addPlant(Garden.createPlant(type, name));
        System.out.println("Added " + name + "! Total plants created so far: " + Plant.getTotalPlants());
    }

    private static void viewAll() {
        List<Plant> all = garden.getAll();
        if (all.isEmpty()) { System.out.println("Garden is empty. Add a plant first."); return; }
        all.forEach(System.out::println);                     // lambda / method reference
    }

    private static void waterPlant() throws PlantCareException {
        Plant p = needPlant();
        int ml;
        try {
            ml = Integer.parseInt(ask("Water in ml (needs about " + p.getWaterNeedMl() + "): "));
        } catch (NumberFormatException e) {
            throw new PlantCareException("Please enter a number.");
        }
        p.water(ml);
        System.out.println(p.getName() + " enjoyed the water. Health is now " + p.getHealth() + "%.");
    }

    private static void showThirsty() {
        List<Plant> thirsty = garden.filter(p -> p.needsWater());
        if (thirsty.isEmpty()) System.out.println("No thirsty plants. Great job!");
        else thirsty.forEach(System.out::println);
    }

    private static void skipDay() {
        List<String> news = garden.advanceDay();
        System.out.println("One day passed. Now it is Day " + garden.getDay() + ".");
        news.forEach(System.out::println);
    }

    private static void toggleAutoReminder() {
        if (reminderThread != null && reminderThread.isAlive()) {
            stopReminder();
            System.out.println("Auto reminder stopped.");
        } else {
            reminder = new ReminderThread(garden, 5);          // 5 real seconds = 1 garden day
            reminderThread = new Thread(reminder, "ReminderThread");
            reminderThread.setDaemon(true);
            reminderThread.start();
            System.out.println("Auto reminder started: 5 seconds = 1 garden day.");
        }
    }

    private static void stopReminder() {
        if (reminder != null) reminder.stopReminder();
        if (reminderThread != null) reminderThread.interrupt();
    }

    private static void report() {
        List<Plant> sorted = garden.sortedByHealth();
        if (sorted.isEmpty()) { System.out.println("No plants to report."); return; }
        System.out.println("--- Garden Report (healthiest first) ---");
        sorted.forEach(System.out::println);
        double avg = sorted.stream().mapToInt(Plant::getHealth).average().orElse(0);
        System.out.printf("Plants: %d | Thirsty: %d | Average health: %.1f%%%n",
                sorted.size(), garden.filter(Plant::needsWater).size(), avg);
    }

    private static void showTip() throws PlantCareException {
        Plant p = needPlant();
        System.out.println("Tip for " + p.getName() + ": " + p.getCareTip());
    }

    private static void removePlant() throws PlantCareException {
        String name = ask("Plant name to remove: ");
        if (garden.remove(name)) System.out.println(name + " removed.");
        else throw new PlantCareException("No plant named '" + name + "'.");
    }

    private static void saveToDb(boolean ready) throws Exception {
        if (!ready) { System.out.println("Database not available."); return; }
        System.out.println(db.saveAll(garden.getAll()) + " plant(s) saved to database.");
    }

    private static void loadFromDb(boolean ready) throws Exception {
        if (!ready) { System.out.println("Database not available."); return; }
        List<Plant> loaded = db.loadAll();
        garden.replaceAll(loaded);
        System.out.println(loaded.size() + " plant(s) loaded from database.");
    }

    private static Plant needPlant() throws PlantCareException {
        Plant p = garden.find(ask("Plant name: "));
        if (p == null) throw new PlantCareException("Plant not found.");
        return p;
    }
}
