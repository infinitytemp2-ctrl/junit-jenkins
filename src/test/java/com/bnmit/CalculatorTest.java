package com.bnmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(2, calc.add(1, 1));
    }

    @Test
    public void testSub() {
        assertEquals(4, calc.sub(8, 4));
    }

    @Test
    public void testMul() {
        assertEquals(4, calc.mul(2, 2));
    }

    @Test
    public void testDiv() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> calc.div(7, 0));
        assertEquals("/ by 0", e.getMessage());
    }
}
