package greenthumb;

/** Child class 2: thirsty and delicate. */
public class Flower extends Plant {
    public Flower(String name) { super(name, 2, 200); }
    @Override public String getType() { return "Flower"; }
    @Override public String getCareTip() { return "Needs water every 2 days and morning sunlight."; }
}
