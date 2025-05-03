package org.a9.calculator;

import java.util.Scanner;

/**
 * Kelas ini merupakan kelas yang berfumgsi untuk menerima input angka dan operator. Kelas ini juga
 * berfungsi sebagai validator input agar sesuai dengan spesifikasi program.
 *
 * @version 1.0
 * @since 2025-04-27
 * @author Firman
 */

public class InputValidator {

    InputValidator () {
        // Constructor default
    }

    /**
     * Metode ini digunakan untuk menerima dan memvalidasi input angka.
     *
     * @param scanner untuk menerima input.
     * @param prompt yang akan ditampilkan ke layar.
     * @return angka yang diinputkan user.
     */
    public static double getNumber(Scanner scanner, String prompt) {
        System.out.print(prompt);
        if (!scanner.hasNextDouble()) {
            throw new IllegalArgumentException("Input tidak valid.");
        }

        double number = scanner.nextDouble();
        if (number < -32768 || number > 32767) {
            throw new IllegalArgumentException("Input harus antara -32768 dan 32767.");
        }
        return number;
    }

    /**
     * Metode ini digunakan untuk menerima dan memvalidasi input operator.
     *
     * @param scanner untuk menerima input.
     * @param prompt yang akan ditampilkan ke layar.
     * @return operator yang diinputkan user.
     */
    public static String getOperator(Scanner scanner, String prompt) {
        System.out.print(prompt);
        String operator = scanner.next();
        if (!operator.matches("[+\\-*/]")) {
            throw new IllegalArgumentException("Operator tidak valid.");
        }
        return operator;
    }
}
