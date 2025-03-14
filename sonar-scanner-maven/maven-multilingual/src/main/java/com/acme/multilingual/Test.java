package com.acme.multilingual;

public class Test {

    public int add(int a, int b) {
        // Check for potential overflow
        if (a > 0 && b > Integer.MAX_VALUE - a) {
            throw new ArithmeticException("Integer overflow");
        }
        return a + b;
    }

    public int subtract(int a, int b) {
        // Check for potential underflow
        if (a < 0 && b > Integer.MAX_VALUE + a) {
            throw new ArithmeticException("Integer underflow");
        }
        return a - b;
    }
}
