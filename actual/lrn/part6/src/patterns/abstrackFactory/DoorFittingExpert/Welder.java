package patterns.abstrackFactory.DoorFittingExpert;

public class Welder implements DoorFittingExpert{
    @Override
    public void getDescription() {
        System.out.println("Я могу подобрать только железные двери");
    }
}
