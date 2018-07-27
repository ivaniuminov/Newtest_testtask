package com.newtest.impl;

import com.newtest.Operation;

public class Addition implements Operation<Integer> {
    @Override
    public Integer calculate(Integer op1, Integer op2) {
        return op1 + op2;
    }
}
