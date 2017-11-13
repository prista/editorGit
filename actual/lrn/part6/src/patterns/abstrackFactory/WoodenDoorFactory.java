package patterns.abstrackFactory;

import patterns.abstrackFactory.DoorFittingExpert.Carpenter;
import patterns.abstrackFactory.DoorFittingExpert.DoorFittingExpert;
import patterns.abstrackFactory.door.Door;
import patterns.abstrackFactory.door.WoodenDoor;

public class WoodenDoorFactory implements DoorFactory{

    @Override
    public Door makeDoor() {
        return new WoodenDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        return new Carpenter();
    }
}
