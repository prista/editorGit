package patterns.simplefactory;

public class DoorFactory {
    public static Door makeDoor(double weight, double height) {
        return new WoodenDoor(weight, height);
    }
}
