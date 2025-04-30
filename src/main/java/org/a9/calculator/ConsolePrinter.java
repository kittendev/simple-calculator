package org.a9.calculator;

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
