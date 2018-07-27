package com.newtest.impl;

import com.newtest.Operation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class SubtractionTests {

    @Test
    public void testSubtractionHappyPath() {
        Operation<Integer> sub = new Subtraction();
        int expectedResult = 2;
        int actualResult = sub.calculate(6 , 4);
        assertEquals(expectedResult, actualResult);
    }
}
