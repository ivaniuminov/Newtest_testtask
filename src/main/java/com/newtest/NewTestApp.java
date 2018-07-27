package com.newtest;

import com.newtest.impl.*;

public class NewTestApp {

    public static void main(String[] args) {
        Operation<Integer> add = new Addition();
        Operation<Integer> sub = new Subtraction();
        Operation<Integer> mult = new Multiplication();
        Operation<Integer> div = new Division();
        Operation<String> conc = new Concatenation();

        System.out.println("result is :" + add.calculate(6,4));
        System.out.println("result is :" + sub.calculate(6,4));
        System.out.println("result is :" + mult.calculate(6,4));
        System.out.println("result is :" + div.calculate(6,4));
        System.out.println("result is :" + conc.calculate("6", "4"));
    }
}
