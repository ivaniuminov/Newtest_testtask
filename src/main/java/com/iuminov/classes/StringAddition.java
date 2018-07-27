package com.iuminov.classes;

import com.iuminov.interfaces.Operation;

public class StringAddition implements Operation<String> {
    @Override
    public String calculate(String op1, String op2) {
        return op1 + op2;
    }
}
