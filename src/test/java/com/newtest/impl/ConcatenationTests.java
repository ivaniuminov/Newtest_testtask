package com.newtest.impl;

import com.newtest.Operation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ConcatenationTests {

    @Test
    public void testStringAdditionHappyPath() {
        Operation<String> conc = new Concatenation();
        String expectedResult = "64";
        String actualResult = conc.calculate("6" , "4");
        assertEquals(expectedResult, actualResult);
    }
}