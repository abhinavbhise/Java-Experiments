package greenthumb;

/** Interface: anything that can be watered must follow this contract. */
public interface Waterable {
    void water(int ml) throws PlantCareException;
    int getWaterNeedMl();
    int getWaterIntervalDays();
}
