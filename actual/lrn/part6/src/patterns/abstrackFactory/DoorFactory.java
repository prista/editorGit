package patterns.abstrackFactory;

import patterns.abstrackFactory.DoorFittingExpert.DoorFittingExpert;
import patterns.abstrackFactory.door.Door;

public interface DoorFactory {
    Door makeDoor();
    DoorFittingExpert makeFittingExpert();
}
