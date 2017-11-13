package patterns.abstrackFactory.door;

public class IronDoor implements Door{
    @Override
    public void getDescription() {
        System.out.println("Я железная дверь");
    }
}
