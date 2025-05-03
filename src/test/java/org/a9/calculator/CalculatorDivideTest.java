package org.a9.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Kelas ini merupakan pengujian unit untuk metode pembagian pada kelas Calculator.
 * Kelas ini menguji berbagai skenario pembagian.
 *
 * @version 1.0
 * @since 2025-05-03
 * @author Dafa
 */
public class CalculatorDivideTest extends CalculatorTest {

    @Test
    @DisplayName("Pembagian 2 buah integer positif")
    public void testDivideTwoPositiveIntegers() {
        assertEquals(2, calc.divide(6, 3), DELTA);
    }

    @Test
    @DisplayName("Pembagian 2 buah integer negatif")
    public void testDivideTwoNegativeIntegers() {
        assertEquals(2, calc.divide(-4, -2), DELTA);
    }

    @Test
    @DisplayName("Pembagian 1 integer positif dan 1 integer negatif")
    public void testDividePositiveAndNegativeInteger() {
        assertEquals(-1, calc.divide(6, -6), DELTA);
    }

    @Test
    @DisplayName("Pembagian 1 integer dan floating number")
    public void testDivideIntegerAndFloatingNumber() {
        assertEquals(23.07692, calc.divide(6, 0.26), DELTA);
    }

    @Test
    @DisplayName("Pembagian 2 floating number")
    public void testDivideTwoFloatingNumbers() {
        assertEquals(6, calc.divide(3.6, 0.6), DELTA);
    }

    @Test
    @DisplayName("Pembagian dengan angka 0")
    public void testDivideWithZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(26, 0));
    }
}
