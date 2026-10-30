package greenthumb;

/** Our own (user-defined) exception for all plant-care problems. */
public class PlantCareException extends Exception {
    public PlantCareException(String message) {
        super(message);
    }
}
