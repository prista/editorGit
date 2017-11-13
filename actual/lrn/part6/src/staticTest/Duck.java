package staticTest;

public class Duck {




    int k = 'b';
    char x = 'c';

    private int size;
    private final int whuffie;

    Duck(){
        whuffie = 42;
    }

    public static void main(String[] args) {
        Duck d = new Duck();
        d.k = d.x;
        System.out.println(d.k);
        d.setSize(12);
        System.out.println("Lool: " + d.getSize());
        String s = String.format("%,6.1f", 42.000);
        System.out.println(s);
        System.out.println(String.format("%,7d", 6));
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
