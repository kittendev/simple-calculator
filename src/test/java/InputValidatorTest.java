import org.a9.InputValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayInputStream;
import java.io.InputStream;


public class InputValidatorTest {

    private final InputStream originalIn = System.in;

    @AfterEach
    public void restoreSystemIn() {
        System.setIn(originalIn);
    }

    @Test
    public void testGetNumberValid_1() {

        String input = "20\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        double number = InputValidator.getNumber("Masukkan angka:");
        assertEquals(20, number, 0.0001);
    }

    @Test
    public void testGetNumberValid_2() {

        String input = "32768\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertThrows(IllegalArgumentException.class, () -> {
            InputValidator.getNumber("Masukkan angka: ");
        });
    }

    @Test
    public void testGetNumberValid_3() {

        String input = "-32769\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertThrows(IllegalArgumentException.class, () -> {
            InputValidator.getNumber("Masukkan angka: ");
        });
    }


    @Test
    void testGetNumberInvalid() {
        String input = "Test\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertThrows(IllegalArgumentException.class, () -> {
            InputValidator.getNumber("Masukkan angka: ");
        });
    }

    @Test
    public void testGetOperatorValid() {
        String input = "-\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        String operator = InputValidator.getOperator("Masukkan operator (+, -, *, /): ");
        assertEquals("-", operator);
    }

    @Test
    public void testGetOperatorInvalid() {
        String input = "&\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertThrows(IllegalArgumentException.class, () -> {
            InputValidator.getOperator("Masukkan operator (+, -, *, /): ");
        });
    }

}
