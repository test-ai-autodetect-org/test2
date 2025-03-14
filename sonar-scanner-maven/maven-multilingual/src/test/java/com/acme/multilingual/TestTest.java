package com.acme.multilingual;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTest {

    private final Test test = new Test();

    @Test
    public void testAdd() {
        assertEquals(5, test.add(2, 3));
        assertThrows(OverflowException.class, () -> test.add(Integer.MAX_VALUE, 1));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, test.subtract(3, 2));
        assertThrows(UnderflowException.class, () -> test.subtract(Integer.MIN_VALUE, 1));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, test.multiply(2, 3));
        assertThrows(OverflowException.class, () -> test.multiply(Integer.MAX_VALUE, 2));
    }

    @Test
    public void testDivide() {
        assertEquals(2, test.divide(6, 3));
        assertThrows(ArithmeticException.class, () -> test.divide(1, 0));
    }
}