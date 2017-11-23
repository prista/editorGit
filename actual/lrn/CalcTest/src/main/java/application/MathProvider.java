package application;

/*
 *  This is our sample class that we would like to unit test
 *  To do this we will create a sample functionality in the
 *  class
 *  Let the class give us these 3 basic functionalities
 *  substract()
 *  add()
 *  multiply()
 *
 *  Our goal is to have unit tests around these
 *  basic functionalities
 */

public class MathProvider {
    public MathProvider() {
    }

    public int add(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber);
    }

    public int substract(int firstNumber, int secondNumber) {
        return (firstNumber - secondNumber);
    }

    public int multiply(int firstNumber, int secondNumber) {
        return (firstNumber * secondNumber);
    }
}
