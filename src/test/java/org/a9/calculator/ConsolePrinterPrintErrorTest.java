package org.a9.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Kelas ini merupakan pengujian unit untuk ConsolePrinter pada kelas printError.
 * Kelas ini menguji skenario interface console pada saat terjadi error.
 *
 * @version 1.0
 * @since 2025-05-02
 * @author Raihan
 */

public class ConsolePrinterPrintErrorTest {
    @Test
    @DisplayName("Tampilan Interface Console Error Input Tidak Valid")
    public void testShowInitialErrorInterfaceOutput() {

        String simulatedErrorMessage = "Input tidak valid.";

        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ConsolePrinter.printError(simulatedErrorMessage);

        System.setOut(originalOut);

        String expectedOutput = "Error: " + simulatedErrorMessage + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }
    @Test
    @DisplayName("Tampilan Interface Console Error Input Diluar Batas")
    public void testShowInitialErrorBorderInterfaceOutput() {

        String simulatedErrorMessage = "Input harus antara -32768 dan 32767.";

        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ConsolePrinter.printError(simulatedErrorMessage);

        System.setOut(originalOut);

        String expectedOutput = "Error: " + simulatedErrorMessage + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }
    @Test
    @DisplayName("Tampilan Interface Console Error Input Operator")
    public void testShowInitialErrorOperatorInterfaceOutput() {

        String simulatedErrorMessage = "Operator tidak valid.";

        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ConsolePrinter.printError(simulatedErrorMessage);

        System.setOut(originalOut);

        String expectedOutput = "Error: " + simulatedErrorMessage + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }
}
