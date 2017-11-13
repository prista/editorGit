package patterns.abstrackFactory;

public class AFTestDrive {

    public static void main(String[] args) {
        WoodenDoorFactory woodenDoorFactory = new WoodenDoorFactory();
        woodenDoorFactory.makeDoor().getDescription();
        woodenDoorFactory.makeFittingExpert().getDescription();


        IronDoorFactory ironDoorFactory = new IronDoorFactory();
        ironDoorFactory.makeDoor().getDescription();
        ironDoorFactory.makeFittingExpert().getDescription();
    }
}
