package com.iuminov.classes;

import com.iuminov.interfaces.Operation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class OperationsTest {

    @Test
    public void testAdditionHappyPath() {

        Operation<Integer> add = new Addition();
        int expectedResult = 10;
        int actualResult = add.calculate(6 , 4);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSubtractionHappyPath() {

        Operation<Integer> add = new Subtraction();
        int expectedResult = 2;
        int actualResult = add.calculate(6 , 4);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiplicationHappyPath() {

        Operation<Integer> add = new Multiplication();
        int expectedResult = 24;
        int actualResult = add.calculate(6 , 4);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDivisionHappyPath() {

        Operation<Integer> add = new Division();
        int expectedResult = 1;
        int actualResult = add.calculate(6 , 4);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringAdditionHappyPath() {

        Operation<String> add = new StringAddition();
        String expectedResult = "64";
        String actualResult = add.calculate("6" , "4");
        assertEquals(expectedResult, actualResult);
    }
}
