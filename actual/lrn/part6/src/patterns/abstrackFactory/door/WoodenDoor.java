package patterns.abstrackFactory.door;

public class WoodenDoor implements Door{
    @Override
    public void getDescription() {
        System.out.println("Я деревянная дверь");
    }
}
