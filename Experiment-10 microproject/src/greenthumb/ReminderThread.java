package greenthumb;

import java.util.List;

/** Background thread: every few seconds one "garden day" passes and alerts are printed. */
public class ReminderThread implements Runnable {

    private final Garden garden;
    private final int secondsPerDay;
    private volatile boolean running = true;

    public ReminderThread(Garden garden, int secondsPerDay) {
        this.garden = garden;
        this.secondsPerDay = secondsPerDay;
    }

    public void stopReminder() { running = false; }

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(secondsPerDay * 1000L);
            } catch (InterruptedException e) {
                break;                                   // woken up to stop
            }
            if (!running) break;
            List<String> news = garden.advanceDay();
            System.out.println("\n[Auto Reminder] --- Day " + garden.getDay() + " ---");
            if (news.isEmpty()) System.out.println("[Auto Reminder] All plants are fine.");
            for (String n : news) System.out.println("[Auto Reminder] " + n);
        }
    }
}
