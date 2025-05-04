package org.a9.calculator;

/**
 * Kelas ini merupakan kelas yang mengatur tampilan yang akan muncul pada console pengguna.
 *
 * @version 1.0
 * @since 2025-04-27
 * @author Raihan
 */

public class ConsolePrinter {
    public static void printResult(double result) {
        System.out.println("Hasil: " + (result == (int) result ? (int) result : String.format("%.5f", result)));
    }

    public static void printError(String message) {
        System.err.println("Error: " + message);
    }

    public static void printWelcomeMessage() {
        System.out.println("Kalkulator Sederhana");
        System.out.println("---------------------");
    }
}
