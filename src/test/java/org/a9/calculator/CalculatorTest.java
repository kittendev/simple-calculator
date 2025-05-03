package org.a9.calculator;

/**
 * Kelas ini adalah kelas dasar untuk pengujian unit pada kelas Calculator.
 * Kelas ini menyediakan instance dari Calculator dan nilai delta yang digunakan dalam pengujian.
 *
 *  @version 1.0
 *  @since 2025-05-03
 *  @author Dafa
 */
public class CalculatorTest {

    // Create an instance of the Calculator class
    protected final Calculator calc = new Calculator();

    // Delta value for floating point comparisons
    protected final double DELTA = 1e-5;
}
