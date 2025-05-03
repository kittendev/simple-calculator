package org.a9.calculator;

/**
 * Kelas ini merupakan implementasi dari kalkulator sederhana yang dapat melakukan operasi penjumlahan,
 * pengurangan, perkalian, dan pembagian.
 *
 * @version 1.0
 * @since 2025-04-27
 * @author Dafa
 */
public class Calculator {

    /**
     * Metode ini digunakan untuk menjumlahkan dua angka.
     *
     * @param angka_pertama Angka pertama yang akan dijumlahkan.
     * @param angka_kedua Angka kedua yang akan dijumlahkan.
     * @return Hasil penjumlahan dari dua angka.
     */
    public double add(double angka_pertama, double angka_kedua) {
        return angka_pertama + angka_kedua;
    }

    /**
     * Metode ini digunakan untuk mengurangi dua angka.
     *
     * @param angka_pertama Angka pertama yang akan dikurangi.
     * @param angka_kedua Angka kedua yang akan dikurangi.
     * @return Hasil pengurangan dari dua angka.
     */
    public double subtract(double angka_pertama, double angka_kedua) {
        return angka_pertama - angka_kedua;
    }

    /**
     * Metode ini digunakan untuk mengalikan dua angka.
     *
     * @param angka_pertama Angka pertama yang akan dikalikan.
     * @param angka_kedua Angka kedua yang akan dikalikan.
     * @return Hasil perkalian dari dua angka.
     */
    public double multiply(double angka_pertama, double angka_kedua) {
        return angka_pertama * angka_kedua;
    }

    /**
     * Metode ini digunakan untuk membagi dua angka.
     *
     * @param angka_pertama Angka pertama yang akan dibagi.
     * @param angka_kedua Angka kedua yang akan membagi.
     * @return Hasil pembagian dari dua angka.
     * @throws ArithmeticException Jika angka kedua adalah nol.
     */
    public double divide(double angka_pertama, double angka_kedua) {
        if (angka_kedua == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
        return angka_pertama / angka_kedua;
    }
}
