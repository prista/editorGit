package AppTests;

import org.junit.Assert;
import org.junit.Test;
import source.Calculator;

public class AddingNumbersTests {
    private Calculator myCalculator = new Calculator();

    @Test
    public void addTwoPositiveNumbers() {
        int expectedResult = 30;
        int actualResult = myCalculator.add(10,20);
        Assert.assertEquals("The the sum of two positive numbers is correct", expectedResult, actualResult);
    }

    @Test
    public void addTwoNegativeNumbers() {
        int expectedResult = -30;
        int actualResult = myCalculator.add(-10, -20);
        Assert.assertEquals("he the sum of two negative numbers is correct", expectedResult, actualResult);
    }
}
