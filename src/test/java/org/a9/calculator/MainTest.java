package org.a9.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import org.a9.calculator.ConsolePrinter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Kelas ini merupakan pengujian unit untuk main pada kelas Main.
 * Kelas ini menguji berbagai skenario keberjalanan alur program pada main.
 *
 * @version 1.0
 * @since 2025-05-02
 * @author Raihan
 */

public class MainTest {
    @Test
    @DisplayName("Simulasi input 5 + 3 dan verifikasi output lengkap")
    public void testMainMethodWithValidInputCalculatorAdd() {
        // Simulasi input dari user: angka pertama, operator, angka kedua
        String simulatedInput = "5\n+\n3\n";
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setIn(inContent);
        System.setOut(new PrintStream(outContent));

        org.a9.calculator.Main.main(new String[]{});

        System.setIn(originalIn);
        System.setOut(originalOut);

        String output = outContent.toString();

        // Verifikasi bahwa interface dan hasil muncul sesuai
        assertTrue(output.contains("Kalkulator Sederhana" + System.lineSeparator()
                + "---------------------"), "Harus ada welcome message");
        assertTrue(output.contains("Masukkan angka pertama: "), "Harus ada prompt angka pertama");
        assertTrue(output.contains("Masukkan operator (+, -, *, /): "), "Harus ada prompt operator");
        assertTrue(output.contains("Masukkan angka kedua: "), "Harus ada prompt angka kedua");
        assertTrue(output.contains("Hasil: 8"), "Hasil akhir harus 8");
    }
    @Test
    @DisplayName("Simulasi input 5 - 3 dan verifikasi output lengkap")
    public void testMainMethodWithValidInputCalculatorSubstract() {
        // Simulasi input dari user: angka pertama, operator, angka kedua
        String simulatedInput = "5\n-\n3\n";
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setIn(inContent);
        System.setOut(new PrintStream(outContent));

        org.a9.calculator.Main.main(new String[]{});

        System.setIn(originalIn);
        System.setOut(originalOut);

        String output = outContent.toString();

        // Verifikasi bahwa interface dan hasil muncul sesuai
        assertTrue(output.contains("Kalkulator Sederhana" + System.lineSeparator()
                + "---------------------"), "Harus ada welcome message");
        assertTrue(output.contains("Masukkan angka pertama: "), "Harus ada prompt angka pertama");
        assertTrue(output.contains("Masukkan operator (+, -, *, /): "), "Harus ada prompt operator");
        assertTrue(output.contains("Masukkan angka kedua: "), "Harus ada prompt angka kedua");
        assertTrue(output.contains("Hasil: 2"), "Hasil akhir harus 2");
    }
    @Test
    @DisplayName("Simulasi input 5 * 3 dan verifikasi output lengkap")
    public void testMainMethodWithValidInputCalculatorMultiply() {
        // Simulasi input dari user: angka pertama, operator, angka kedua
        String simulatedInput = "5\n+\n3\n";
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setIn(inContent);
        System.setOut(new PrintStream(outContent));

        org.a9.calculator.Main.main(new String[]{});

        System.setIn(originalIn);
        System.setOut(originalOut);

        String output = outContent.toString();

        // Verifikasi bahwa interface dan hasil muncul sesuai
        assertTrue(output.contains("Kalkulator Sederhana" + System.lineSeparator()
                + "---------------------"), "Harus ada welcome message");
        assertTrue(output.contains("Masukkan angka pertama: "), "Harus ada prompt angka pertama");
        assertTrue(output.contains("Masukkan operator (+, -, *, /): "), "Harus ada prompt operator");
        assertTrue(output.contains("Masukkan angka kedua: "), "Harus ada prompt angka kedua");
        assertTrue(output.contains("Hasil: 15"), "Hasil akhir harus 15");
    }
    @Test
    @DisplayName("Simulasi input 6 / 3 dan verifikasi output lengkap")
    public void testMainMethodWithValidInputCalculatorDivide() {
        // Simulasi input dari user: angka pertama, operator, angka kedua
        String simulatedInput = "6\n/\n3\n";
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayInputStream inContent = new ByteArrayInputStream(simulatedInput.getBytes());
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setIn(inContent);
        System.setOut(new PrintStream(outContent));

        org.a9.calculator.Main.main(new String[]{});

        System.setIn(originalIn);
        System.setOut(originalOut);

        String output = outContent.toString();

        // Verifikasi bahwa interface dan hasil muncul sesuai
        assertTrue(output.contains("Kalkulator Sederhana" + System.lineSeparator()
                + "---------------------"), "Harus ada welcome message");
        assertTrue(output.contains("Masukkan angka pertama: "), "Harus ada prompt angka pertama");
        assertTrue(output.contains("Masukkan operator (+, -, *, /): "), "Harus ada prompt operator");
        assertTrue(output.contains("Masukkan angka kedua: "), "Harus ada prompt angka kedua");
        assertTrue(output.contains("Hasil: 2"), "Hasil akhir harus 2");
    }
}


