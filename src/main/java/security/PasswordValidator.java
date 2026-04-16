package security;

public class PasswordValidator {
    public boolean validar (String password){
        if (password == null){
            return false;
        }
        return password.length()>= 8;
    }
  
    public boolean tieneLongitudMinima(String password) {
        if (password == null) {
            throw new IllegalArgumentException("La contraseña no puede ser null");
        }
        return password.length() >= 8;
    }

   /**
     * Valida que la contraseña contenga al menos un número.
     * @param password contraseña a evaluar
     * @return true si contiene número, false si no
     */
    public boolean contieneNumero(String password) {
        validarNull(password);

        // Recorremos cada carácter
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }

        return false;
    }
    
}

