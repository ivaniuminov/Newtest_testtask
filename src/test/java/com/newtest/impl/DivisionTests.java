package com.newtest.impl;

import com.newtest.Operation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class DivisionTests {

    @Test
    public void testDivisionHappyPath() {
        Operation<Integer> div = new Division();
        int expectedResult = 1;
        int actualResult = div.calculate(6 , 4);
        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Operation<Integer> div = new Division();
        int actualResult = div.calculate(6 , 0);
    }
}
