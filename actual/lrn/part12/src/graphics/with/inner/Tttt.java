package graphics.with.inner;

import java.util.Locale;

public class Tttt {
    static double a = 3500000.55;
    public static void main(String[] args) {
        //System.out.println(String.format("%,.2f", a).replaceAll(","," ").replace(".", ","));
        System.out.println(String.format(new Locale("ru"),"% ,.2f", a));
        System.out.println("TTT: " + new Locale("ru").toString());
        System.out.println("DEFAULT: " + Locale.getDefault().toString());
    }
}
