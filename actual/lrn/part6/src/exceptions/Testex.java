package exceptions;

public class Testex {

    String testStr = "yes";
    public static void main(String[] args) {
        Testex test = new Testex();
        int i = test.doStuff(test);
        System.out.println("LOOOOOL 00: " + i);
    }

    public void doRisky(String other) throws Exception{
        System.out.println("LOOL 01");
        if ("yes".equals(other)) {
            throw new Exception();
        }
    }

    public int doStuff(Testex tex) {
        try {
            tex.doRisky("yes");
            System.out.println("TRRY");
            return 5;
        } catch (Exception ex) {
            System.out.println("CATCH");
            return 6;
        } finally {
            System.out.println("FINALLY");
        }
    }
}
