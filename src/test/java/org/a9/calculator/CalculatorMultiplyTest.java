package org.a9.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Kelas ini merupakan pengujian unit untuk metode perkalian pada kelas Calculator.
 * Kelas ini menguji berbagai skenario perkalian.
 *
 * @version 1.0
 * @since 2025-05-03
 * @author Dafa
 */
public class CalculatorMultiplyTest extends CalculatorTest {

    @Test
    @DisplayName("Perkalian 2 buah integer positif")
    public void testMultiplyTwoPositiveIntegers() {
        assertEquals(6, calc.multiply(2, 3), DELTA);
    }

    @Test
    @DisplayName("Perkalian 2 buah integer negatif")
    public void testMultiplyTwoNegativeIntegers() {
        assertEquals(12, calc.multiply(-2, -6), DELTA);
    }

    @Test
    @DisplayName("Perkalian 1 integer positif dan 1 integer negatif")
    public void testMultiplyPositiveAndNegativeInteger() {
        assertEquals(-36, calc.multiply(6, -6), DELTA);
    }

    @Test
    @DisplayName("Perkalian 1 integer dan floating number")
    public void testMultiplyIntegerAndFloatingNumber() {
        assertEquals(1.56, calc.multiply(6, 0.26), DELTA);
    }

    @Test
    @DisplayName("Perkalian 2 floating number")
    public void testMultiplyTwoFloatingNumbers() {
        assertEquals(26.51310, calc.multiply(5.90, 4.493745), DELTA);
    }

    @Test
    @DisplayName("Perkalian dengan angka 0")
    public void testMultiplyWithZero() {
        assertEquals(0, calc.multiply(26, 0), DELTA);
    }
}
