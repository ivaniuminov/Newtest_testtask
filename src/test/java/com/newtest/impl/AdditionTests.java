package com.newtest.impl;

import com.newtest.Operation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class AdditionTests {

    @Test
    public void testAdditionHappyPath() {
        Operation<Integer> add = new Addition();
        int expectedResult = 10;
        int actualResult = add.calculate(6 , 4);
        assertEquals(expectedResult, actualResult);
    }
}
