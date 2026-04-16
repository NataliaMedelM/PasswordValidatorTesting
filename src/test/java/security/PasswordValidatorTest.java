package security;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testContieneNumero() {
        assertTrue(validator.contieneNumero("Clave123"));
    }

    @Test
    void testNoContieneNumero() {
        assertFalse(validator.contieneNumero("ClaveABC"));
    }

    @Test
    void testLongitudValida() {
        assertTrue(validator.tieneLongitudMinima("Clave1234"));
    }

    @Test
    void testLongitudCorta() {
        assertFalse(validator.tieneLongitudMinima("abc12"));
    }
}