package org.a9.calculator;

import java.util.Scanner;

public class InputValidator {

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

    public static String getOperator(Scanner scanner, String prompt) {
        System.out.print(prompt);
        String operator = scanner.next();
        if (!operator.matches("[+\\-*/]")) {
            throw new IllegalArgumentException("Operator tidak valid.");
        }
        return operator;
    }
}
