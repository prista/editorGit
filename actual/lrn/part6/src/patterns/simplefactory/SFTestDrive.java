package patterns.simplefactory;

import static java.lang.System.out;

public class SFTestDrive {
    public static void main(String[] args) {
        Door d = DoorFactory.makeDoor(1, 2.3);
        out.println(d);
    }
}
