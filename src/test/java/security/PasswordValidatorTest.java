package security;



import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    // Los tests deben ir AQUÍ ADENTRO (dentro de estas llaves)
  PasswordValidator validator = new PasswordValidator();
  
    @Test
    @DisplayName("Debería fallar si la contraseña tiene menos de 8 caracteres")
    void testLongitudCorta() {
        PasswordValidator validator = new PasswordValidator(); // Nombre correcto
        boolean resultado = validator.validar("1234567"); // Método correcto
        assertEquals(false, resultado);
    }

    @Test
    @DisplayName("Debería pasar si tiene exactamente 8 caracteres")
    void testLongitudExacta() {
        PasswordValidator validator = new PasswordValidator();
        boolean resultado = validator.validar("12345678");
        assertEquals(true, resultado);
    }

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

    // MAYÚSCULAS

    @Test
    void contieneMayuscula_true() {
        assertTrue(validator.contieneMayuscula("clave123A")); // Debe devolver true si hay mayúscula
    }

    @Test
    void contieneMayuscula_false() {
        assertFalse(validator.contieneMayuscula("clave123"));// Debe devolver false si no hay mayúsculas
    }

        // Verifica que el sistema maneje correctamente una contraseña null
    @Test
    public void testPasswordNull() {
        assertThrows(IllegalArgumentException.class, () -> validator.esPasswordValida(null));
    }

}


