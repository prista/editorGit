package patterns.abstrackFactory;

import patterns.abstrackFactory.DoorFittingExpert.DoorFittingExpert;
import patterns.abstrackFactory.DoorFittingExpert.Welder;
import patterns.abstrackFactory.door.Door;
import patterns.abstrackFactory.door.IronDoor;

public class IronDoorFactory implements DoorFactory{

    @Override
    public Door makeDoor() {
        return new IronDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        return new Welder();
    }
}
