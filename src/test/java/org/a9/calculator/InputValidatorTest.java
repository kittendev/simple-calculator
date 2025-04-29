package org.a9.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;


public class InputValidatorTest {

    private final InputStream originalIn = System.in;

    @Test
    public void testGetNumberValid() {

        String input = "20\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        double number = InputValidator.getNumber("Masukkan angka:");
        assertEquals(20, number, 0.0001);
    }

    @Test
    void testGetNumberInvalid() {
        String input = "abc\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertThrows(IllegalArgumentException.class, () -> {
            InputValidator.getNumber("Masukkan angka: ");
        });
    }
}
