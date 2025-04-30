package org.a9.calculator;

public class Calculator {

    public double add(double angka_pertama, double angka_kedua) {
        return angka_pertama + angka_kedua;
    }

    public double subtract(double angka_pertama, double angka_kedua) {
        return angka_pertama - angka_kedua;
    }

    public double multiply(double angka_pertama, double angka_kedua) {
        return angka_pertama * angka_kedua;
    }

    public double divide(double angka_pertama, double angka_kedua) {
        if (angka_kedua == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
        return angka_pertama / angka_kedua;
    }
}
