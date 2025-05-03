package org.a9.calculator;

import java.util.Scanner;

public class Main {

    private final static Calculator calculator = new Calculator();

    public static void main(String[] args) {

        ConsolePrinter.printWelcomeMessage();

        try (Scanner scanner = new Scanner(System.in)){
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