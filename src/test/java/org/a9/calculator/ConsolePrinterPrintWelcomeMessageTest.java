package org.a9.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Kelas ini merupakan pengujian unit untuk ConsolePrinter pada kelas printWelcomeMessage.
 * Kelas ini menguji skenario interface console pada saat user membuka aplikasi.
 *
 * @version 1.0
 * @since 2025-05-02
 * @author Raihan
 */

public class ConsolePrinterPrintWelcomeMessageTest {
    @Test
    @DisplayName("Tampilan Interface Console Welcome")
    public void testShowInitialWelcomeInterfaceOutput() {

        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ConsolePrinter.printWelcomeMessage();

        System.setOut(originalOut);

        String expectedOutput = "Kalkulator Sederhana" + System.lineSeparator()
                + "---------------------"+ System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
