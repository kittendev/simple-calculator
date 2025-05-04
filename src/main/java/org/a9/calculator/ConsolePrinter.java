package org.a9.calculator;

/**
 * Kelas ini merupakan kelas yang mengatur tampilan yang akan muncul pada console pengguna.
 *
 * @version 1.0
 * @since 2025-04-27
 * @author Raihan
 */

public class ConsolePrinter {

    /**
     * Metode ini digunakan untuk mengvisualiasikan Interface pada konsol.
     * Outputnya adalah hasil dari operasi perhitungan
     */
    public static void printResult(double result) {
        System.out.println("Hasil: " + (result == (int) result ? (int) result : String.format("%.5f", result)));
    }

    /**
     * Metode ini digunakan untuk mengvisualiasikan Interface pada konsol.
     * Outputnya adalah message error yang terjadi ketika ada ketidaksesuaian
     */
    public static void printError(String message) {
        System.err.println("Error: " + message);
    }

    /**
     * Metode ini digunakan untuk mengvisualiasikan Interface pada konsol.
     * Outputnya adalah visualisasi yang akan muncul ketika pengguna membuka aplikasi
     */
    public static void printWelcomeMessage() {
        System.out.println("Kalkulator Sederhana");
        System.out.println("---------------------");
    }
}
