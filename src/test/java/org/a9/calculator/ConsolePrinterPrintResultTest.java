package org.a9.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Kelas ini merupakan pengujian unit untuk ConsolePrinter pada kelas printResult.
 * Kelas ini menguji skenario interface console pada saat selesai mengkalkulasikan angka.
 *
 * @version 1.0
 * @since 2025-05-02
 * @author Raihan
 */

public class ConsolePrinterPrintResultTest {
    @Test
    @DisplayName("Tampilkan Hasil Jika Bilangan Bulat")
    public void testPrintResult_Integer() {
        double result = 5.0;

        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ConsolePrinter.printResult(result);

        System.setOut(originalOut);

        String expected = "Hasil: 5" + System.lineSeparator();
        assertEquals(expected, outContent.toString());
    }
    @Test
    @DisplayName("Tampilkan Hasil Jika Bilangan Desimal")
    public void testPrintResult_Decimal() {
        double result = 3.14159;

        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ConsolePrinter.printResult(result);

        System.setOut(originalOut);

        String expected = "Hasil: 3.14159" + System.lineSeparator();
        assertEquals(expected, outContent.toString());
    }
}

