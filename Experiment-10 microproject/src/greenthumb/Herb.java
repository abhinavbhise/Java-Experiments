package greenthumb;

/** Child class 3: kitchen herbs like tulsi, mint, basil. */
public class Herb extends Plant {
    public Herb(String name) { super(name, 3, 100); }
    @Override public String getType() { return "Herb"; }
    @Override public String getCareTip() { return "Keep soil slightly moist. Trim leaves to help it grow."; }
}
