package unit.tests;

import application.MathProvider;

public class JunitMathProvider_1 {
    MathProvider provider;

    public JunitMathProvider_1() {
        provider = new MathProvider();
    }

    public void add() {
        System.out.println("WHAT? " + new Object().getClass());
        System.out.println("Starting test " + new Object().getClass().getEnclosingMethod().getName());
    }
}
