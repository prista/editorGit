package excercise;

public class ExTestDrive {
    public static void main(String[] args) {
        String test = args[0];
        System.out.println("t");
        try {
            doRisky(test);
        } catch (MyEx e) {
            System.out.println("a");
        } finally {
            System.out.println("w");
            System.out.println("s");
        }
    }

    private static void doRisky(String t) throws MyEx{
        System.out.println("h");
        if ("yes".equals(t)) {
            throw new MyEx();
        }
        System.out.println("r");
        System.out.println("o");
    }

    private static class MyEx extends Exception{
    }
}
