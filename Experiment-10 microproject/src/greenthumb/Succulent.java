package greenthumb;

/** Child class 1: stores water, needs little. */
public class Succulent extends Plant {
    public Succulent(String name) { super(name, 7, 50); }
    @Override public String getType() { return "Succulent"; }
    @Override public String getCareTip() { return "Loves sunlight. Water only once a week, never overwater."; }
}
