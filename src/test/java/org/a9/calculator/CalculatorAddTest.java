package org.a9.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Kelas ini merupakan pengujian unit untuk metode penjumlahan pada kelas Calculator.
 * Kelas ini menguji berbagai skenario penjumlahan.
 *
 * @version 1.0
 * @since 2025-05-03
 * @author Dafa
 */
public class CalculatorAddTest extends CalculatorTest {

    @Test
    @DisplayName("Penjumlahan 2 buah integer positif")
    public void testAddTwoPositiveIntegers() {
        assertEquals(5, calc.add(2, 3), DELTA);
    }

    @Test
    @DisplayName("Penjumlahan 2 buah integer negatif")
    public void testAddTwoNegativeIntegers() {
        assertEquals(-8, calc.add(-2, -6), DELTA);
    }

    @Test
    @DisplayName("Penjumlahan 1 integer positif dan 1 integer negatif")
    public void testAddPositiveAndNegativeInteger() {
        assertEquals(0, calc.add(6, -6), DELTA);
    }

    @Test
    @DisplayName("Penjumlahan 1 integer dan floating number")
    public void testAddIntegerAndFloatingNumber() {
        assertEquals(6.26, calc.add(6, 0.26), DELTA);
    }

    @Test
    @DisplayName("Penjumlahan 2 floating number")
    public void testAddTwoFloatingNumbers() {
        assertEquals(17.39375, calc.add(5.90, 11.493745), DELTA);
    }

    @Test
    @DisplayName("Penjumlahan dengan angka 0")
    public void testAddWithZero() {
        assertEquals(26, calc.add(26, 0), DELTA);
    }
}
