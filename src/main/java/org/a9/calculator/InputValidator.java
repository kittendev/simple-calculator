package org.a9.calculator;

import  java.util.Scanner;

public class InputValidator {
    private final static Scanner scanner = new Scanner(System.in);

    public static double getNumber(String prompt) {
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

    public static String getOperator() {
        System.out.print("Masukkan operator (+, -, *, /): ");
        String operator = scanner.next();
        if (!operator.matches("[+\\-*/]")) {
            throw new IllegalArgumentException("Operator tidak valid.");
        }
        return operator;
    }

    public static void closeScanner() {
        scanner.close();
    }
}
