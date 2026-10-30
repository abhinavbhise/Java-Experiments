package greenthumb;

/** Abstract parent class of every plant. Implements the Waterable interface. */
public abstract class Plant implements Waterable {

    private static int totalPlants = 0;          // static member shared by all plants

    protected String name;
    protected int waterIntervalDays;
    protected int waterNeedMl;
    protected int health = 100;                  // 0 - 100
    protected int daysSinceWatered = 0;

    // Constructor overloading
    public Plant(String name) {
        this(name, 3, 100);
    }

    public Plant(String name, int waterIntervalDays, int waterNeedMl) {
        this.name = name;
        this.waterIntervalDays = waterIntervalDays;
        this.waterNeedMl = waterNeedMl;
        totalPlants++;
    }

    // Abstract methods: every child must define them
    public abstract String getType();
    public abstract String getCareTip();

    @Override
    public void water(int ml) throws PlantCareException {
        if (ml <= 0) {
            throw new PlantCareException("Water amount must be more than 0 ml.");
        }
        if (ml > waterNeedMl * 2) {
            health = Math.max(0, health - 20);
            throw new PlantCareException("Overwatering! " + name + " lost 20 health. "
                    + "It only needs about " + waterNeedMl + " ml.");
        }
        daysSinceWatered = 0;
        health = Math.min(100, health + 10);
    }

    /** Called once for every day that passes. */
    public void nextDay() {
        daysSinceWatered++;
        if (daysSinceWatered > waterIntervalDays) {
            health = Math.max(0, health - 10);
        }
    }

    public boolean needsWater()  { return daysSinceWatered >= waterIntervalDays; }
    public boolean isAlive()     { return health > 0; }

    public String getName()          { return name; }
    public int getHealth()           { return health; }
    public int getDaysSinceWatered() { return daysSinceWatered; }
    public void setHealth(int h)     { this.health = h; }
    public void setDaysSinceWatered(int d) { this.daysSinceWatered = d; }
    @Override public int getWaterNeedMl()       { return waterNeedMl; }
    @Override public int getWaterIntervalDays() { return waterIntervalDays; }
    public static int getTotalPlants() { return totalPlants; }

    private String mood() {
        if (health >= 80) return "Happy";
        if (health >= 50) return "Okay";
        if (health >= 25) return "Sad";
        return "Dying";
    }

    @Override
    public String toString() {
        return String.format("%-10s [%-9s] Health: %3d%%  Mood: %-6s Last watered: %d day(s) ago%s",
                name, getType(), health, mood(), daysSinceWatered,
                needsWater() ? "  <-- THIRSTY!" : "");
    }
}
