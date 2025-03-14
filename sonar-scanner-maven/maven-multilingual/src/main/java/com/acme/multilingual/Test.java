package com.acme.multilingual;

class OverflowException extends RuntimeException {
    public OverflowException(String message) {
        super(message);
    }
}

class UnderflowException extends RuntimeException {
    public UnderflowException(String message) {
        super(message);
    }
}

public class Test {

    public int add(int a, int b) {
        // Check for potential overflow
        if (a > 0 && b > Integer.MAX_VALUE - a) {
            throw new OverflowException("Integer overflow");
        }
        return a + b;
    }

    public int subtract(int a, int b) {
        // Check for potential underflow
        if (a < 0 && b > Integer.MAX_VALUE + a) {
            throw new UnderflowException("Integer underflow");
        }
        return a - b;
    }

    public int multiply(int a, int b) {
        // Check for potential overflow
        if (a > 0 && b > Integer.MAX_VALUE / a) {
            throw new OverflowException("Integer overflow");
        }
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
