package org.a9.calculator;

import java.util.Scanner;


/**
 * Kelas utama untuk menjalankan kalkulator sederhana.
 * Kelas ini menginisialisasi kalkulator dan mengatur flow aplikasi.
 *
 * @version 1.0
 * @since 2025-04-27
 * @author Dafa, Firman
 */
public class Main {

    /**
     * Entry point dari aplikasi.
     */
    public Main() {
        // Constructor default
    }

    private final static Calculator calculator = new Calculator();

    /**
     * Metode utama untuk menjalankan kalkulator.
     * Mengambil input dari pengguna, melakukan
     * perhitungan, dan menampilkan hasil.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {

        ConsolePrinter.printWelcomeMessage();

        try (Scanner scanner = new Scanner(System.in)){
            scanner.useLocale(java.util.Locale.US);
            double num1 = InputValidator.getNumber(scanner, "Masukkan angka pertama: ");
            String operator = InputValidator.getOperator(scanner, "Masukkan operator (+, -, *, /): ");
            double num2 = InputValidator.getNumber(scanner, "Masukkan angka kedua: ");

            double result = 0;

            switch (operator) {
                case "+":
                    result = calculator.add(num1, num2);
                    break;
                case "-":
                    result = calculator.subtract(num1, num2);
                    break;
                case "*":
                    result = calculator.multiply(num1, num2);
                    break;
                case "/":
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    break;
            }

            ConsolePrinter.printResult(result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            ConsolePrinter.printError(e.getMessage());
        }
    }
}