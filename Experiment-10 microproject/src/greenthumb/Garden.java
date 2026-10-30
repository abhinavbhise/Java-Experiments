package greenthumb;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/** Holds all plants (ArrayList) and works as the "brain" of the project. */
public class Garden {

    private final List<Plant> plants = new ArrayList<>();
    private int day = 1;

    // synchronized -> safe when the reminder thread and the menu use the garden together
    public synchronized void addPlant(Plant p) throws PlantCareException {
        if (find(p.getName()) != null) {
            throw new PlantCareException("A plant named '" + p.getName() + "' already exists.");
        }
        plants.add(p);
    }

    public synchronized Plant find(String name) {
        for (Plant p : plants) {
            if (p.getName().equalsIgnoreCase(name)) return p;
        }
        return null;
    }

    public synchronized boolean remove(String name) {
        Plant p = find(name);
        return p != null && plants.remove(p);
    }

    public synchronized List<Plant> getAll() { return new ArrayList<>(plants); }
    public synchronized int getDay()         { return day; }
    public synchronized void setDay(int d)   { day = d; }

    /** Lambda + Predicate: filter plants by any rule. */
    public synchronized List<Plant> filter(Predicate<Plant> rule) {
        return plants.stream().filter(rule).collect(Collectors.toList());
    }

    /** Lambda + Comparator: healthiest plant first. */
    public synchronized List<Plant> sortedByHealth() {
        return plants.stream()
                .sorted(Comparator.comparingInt(Plant::getHealth).reversed())
                .collect(Collectors.toList());
    }

    /** One day passes. Returns news messages for the user. */
    public synchronized List<String> advanceDay() {
        day++;
        List<String> news = new ArrayList<>();
        Iterator<Plant> it = plants.iterator();           // Iterator used to remove safely
        while (it.hasNext()) {
            Plant p = it.next();
            p.nextDay();
            if (!p.isAlive()) {
                news.add("RIP: " + p.getName() + " has withered away.");
                it.remove();
            } else if (p.needsWater()) {
                news.add(p.getName() + " is thirsty! Needs " + p.getWaterNeedMl() + " ml.");
            }
        }
        return news;
    }

    public synchronized void replaceAll(List<Plant> loaded) {
        plants.clear();
        plants.addAll(loaded);
    }

    /** Factory method: makes the right child object from a type name. */
    public static Plant createPlant(String type, String name) throws PlantCareException {
        switch (type.toLowerCase()) {
            case "succulent": return new Succulent(name);
            case "flower":    return new Flower(name);
            case "herb":      return new Herb(name);
            default: throw new PlantCareException("Unknown plant type: " + type);
        }
    }
}
