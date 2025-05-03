package org.a9.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

/**
 * Kelas ini merupakan pengujian unit untuk metode getOperator pada kelas InputValidator.
 * Kelas ini menguji berbagai skenario penerimaan input operator.
 *
 * @version 2.0
 * @since 2025-05-02
 * @author Firman
 */

public class InputOperatorValidatorTest {

    @Test
    @DisplayName("Input operator valid")
    public void testGetOperatorValid() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("-\n".getBytes()));
        String operator = InputValidator.getOperator(scanner, "Masukkan operator (+, -, *, /): ");
        assertEquals("-", operator);
        scanner.close();
    }

    @Test
    @DisplayName("Input operator invalid")
    public void testGetOperatorInvalid() {
        Scanner scanner = new Scanner(new ByteArrayInputStream("&\n".getBytes()));
        assertThrows(IllegalArgumentException.class, () -> {
            InputValidator.getOperator(scanner, "Masukkan operator (+, -, *, /): ");
        });
        scanner.close();
    }
}
