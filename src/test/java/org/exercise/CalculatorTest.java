package org.exercise;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(5.0, calculator.add(2.5f, 2.5f), 0.0000001);
        assertEquals(-1.0, calculator.add(-2.0f, 1.0f), 0.001);
        assertEquals(0.0, calculator.add(0.0f, 0.0f), 0.001);
    }

    @Test
    void testSubstract() {
        assertEquals(1.0, calculator.substract(3.0f, 2.0f), 0.0000001);
        assertEquals(-1.0, calculator.substract(2.0f, 3.0f), 0.0000001);
        assertEquals(0.0, calculator.substract(3.0f, 3.0f), 0.0000001);
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6.0f, 3.0f), 0.0000001);
        assertEquals(-2.0, calculator.divide(-6.0f, 3.0f), 0.0000001);
        assertEquals(1.0, calculator.divide(3.0f, 3.0f), 0.0000001);
    }

    @Test
    void testMultiply() {
        assertEquals(6.0, calculator.multiply(2.0f, 3.0f), 0.0000001);
        assertEquals(-2.0, calculator.multiply(-2.0f, 1.0f), 0.0000001);
        assertEquals(0.0, calculator.multiply(0.0f, 3.0f), 0.0000001);
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(2.0f, 0.0f);
        });
    }
}