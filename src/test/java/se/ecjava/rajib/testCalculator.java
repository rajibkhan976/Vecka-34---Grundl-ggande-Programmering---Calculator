package se.ecjava.rajib;

import org.junit.Assert;
import org.junit.Test;

public class testCalculator {

    @Test
    public void test_addOperation () {
        double inputOne = 2.5;
        double inputTwo = 3.5;
        double expectedResult = 6.0;

        double actualResult = Calculator.addOperation(inputOne, inputTwo);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void test_subtractOperation () {
        double inputOne = 4.5;
        double inputTwo = 1.1;
        double expectedResult = 3.4;

        double actualResult = Calculator.subtractOperation(inputOne, inputTwo);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void test_multiplyOperation () {
        double inputOne = 2.0;
        double inputTwo = 3.0;
        double expectedResult = 6.0;

        double actualResult = Calculator.multiplyOperation(inputOne, inputTwo);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void test_divideOperation () {
        double inputOne = 6.0;
        double inputTwo = 2.0;
        double expectedResult = 3.0;

        double actualResult = Calculator.divideOperation(inputOne, inputTwo);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }
}
