package com.newtest.impl;

import com.newtest.Operation;

public class Concatenation implements Operation<String> {
    @Override
    public String calculate(String op1, String op2) {
        return op1 + op2;
    }
}
