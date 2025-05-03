package org.a9.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Kelas ini merupakan pengujian unit untuk metode pengurangan pada kelas Calculator.
 * Kelas ini menguji berbagai skenario pengurangan.
 *
 * @version 1.0
 * @since 2025-05-03
 * @author Dafa
 */
public class CalculatorSubtractTest extends CalculatorTest {

    @Test
    @DisplayName("Pengurangan 2 buah integer positif")
    public void testSubtractTwoPositiveIntegers() {
        assertEquals(-1, calc.subtract(2, 3), DELTA);
    }

    @Test
    @DisplayName("Pengurangan 2 buah integer negatif")
    public void testSubtractTwoNegativeIntegers() {
        assertEquals(4, calc.subtract(-2, -6), DELTA);
    }

    @Test
    @DisplayName("Pengurangan 1 integer positif dan 1 integer negatif")
    public void testSubtractPositiveAndNegativeInteger() {
        assertEquals(12, calc.subtract(6, -6), DELTA);
    }

    @Test
    @DisplayName("Pengurangan 1 integer dan floating number")
    public void testSubtractIntegerAndFloatingNumber() {
        assertEquals(5.74, calc.subtract(6, 0.26), DELTA);
    }

    @Test
    @DisplayName("Pengurangan 2 floating number")
    public void testSubtractTwoFloatingNumbers() {
        assertEquals(1.40625, calc.subtract(5.90, 4.493745), DELTA);
    }

    @Test
    @DisplayName("Pengurangan dengan angka 0")
    public void testSubtractWithZero() {
        assertEquals(26, calc.subtract(26, 0), DELTA);
    }
}
