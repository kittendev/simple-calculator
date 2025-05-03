package org.a9.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

/**
 * Kelas ini merupakan pengujian unit untuk metode getNumber pada kelas InputValidator.
 * Kelas ini menguji berbagai skenario penerimaan input number.
 *
 * @version 2.0
 * @since 2025-05-02
 * @author Firman
 */

public class InputNumberValidatorTest {

    @Test
    @DisplayName("Input dibawah batas maximum")
    public void testGetNumberBelowMaximum() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("32766\n".getBytes()));
        double number = InputValidator.getNumber(scanner, "Masukkan angka:");
        assertEquals(32766, number, 0.0001);
        scanner.close();
    }

    @Test
    @DisplayName("Input pada batas maximum")
    public void testGetNumberMaximum() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("32767\n".getBytes()));
        double number = InputValidator.getNumber(scanner, "Masukkan angka:");
        assertEquals(32767, number, 0.0001);
        scanner.close();
    }

    @Test
    @DisplayName("Input diatas batas maximum")
    public void testGetNumberAboveMaximum() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("32768\n".getBytes()));
        assertThrows(IllegalArgumentException.class, () -> {
            InputValidator.getNumber(scanner, "Masukkan angka:");
        });
        scanner.close();
    }

    @Test
    @DisplayName("Input diatas batas minimum")
    public void testGetNumberBelomMinimum() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("-32767\n".getBytes()));
        double number = InputValidator.getNumber(scanner, "Masukkan angka:");
        assertEquals(-32767, number, 0.0001);
        scanner.close();
    }

    @Test
    @DisplayName("Input pada batas minimum")
    public void testGetNumberMinimum() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("-32768\n".getBytes()));
        double number = InputValidator.getNumber(scanner, "Masukkan angka:");
        assertEquals(-32768, number, 0.0001);
        scanner.close();
    }

    @Test
    @DisplayName("Input dibawah batas minimum")
    public void testGetNumber_OutOfRange_Lower() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("-32769\n".getBytes()));
        assertThrows(IllegalArgumentException.class, () -> {
            InputValidator.getNumber(scanner, "Masukkan angka:");
        });
        scanner.close();
    }

    @Test
    @DisplayName("Input valid bilangan Integer")
    public void testGetNumberInteger() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("20\n".getBytes()));
        double number = InputValidator.getNumber(scanner, "Masukkan angka:");
        assertEquals(20, number, 0.0001);
        scanner.close();
    }

    @Test
    @DisplayName("Input valid bilangan Float")
    public void testGetNumberFloat() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("20.00\n".getBytes()));
        double number = InputValidator.getNumber(scanner, "Masukkan angka:");
        assertEquals(20.00, number, 0.0001);
        scanner.close();
    }

    @Test
    @DisplayName("Input non numerik")
    public void testGetNumberNonNumerik() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("Test\n".getBytes()));
        assertThrows(IllegalArgumentException.class, () -> {
            InputValidator.getNumber(scanner, "Masukkan angka:");
        });
        scanner.close();
    }
}
