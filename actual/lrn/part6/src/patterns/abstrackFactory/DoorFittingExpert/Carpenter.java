package patterns.abstrackFactory.DoorFittingExpert;

public class Carpenter implements DoorFittingExpert {
    @Override
    public void getDescription() {
        System.out.println("Я могу подобрать только деревянные двери");
    }
}
