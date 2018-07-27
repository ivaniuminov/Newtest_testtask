package com.newtest.impl;

import com.newtest.Operation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class MultiplicationTests {

    @Test
    public void testMultiplicationHappyPath() {
        Operation<Integer> mult = new Multiplication();
        int expectedResult = 24;
        int actualResult = mult.calculate(6 , 4);
        assertEquals(expectedResult, actualResult);
    }
}
