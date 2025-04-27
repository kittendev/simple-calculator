package org.a9;

import  java.util.Scanner;

public class InputValidator {
    private final static Scanner scanner = new Scanner(System.in);

    public static double getNumber(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Input tidak valid. Silakan masukkan angka: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static String getOperator() {
        System.out.print("Masukkan operator (+, -, *, /): ");
        String operator = scanner.next();
        while (!operator.matches("[+\\-*/]")) {
            System.out.print("Operator tidak valid. Silakan masukkan operator (+, -, *, /): ");
            operator = scanner.next();
        }
        return operator;
    }

    public static void closeScanner() {
        scanner.close();
    }
}
