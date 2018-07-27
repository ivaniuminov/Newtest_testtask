package com.iuminov.classes;

import com.iuminov.interfaces.Operation;

public class Addition implements Operation<Integer> {
    @Override
    public Integer calculate(Integer op1, Integer op2) {
        return op1 + op2;
    }
}