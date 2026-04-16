package security;

public class PasswordValidator {

    public boolean tieneLongitudMinima(String password) {
        if (password == null) {
            throw new IllegalArgumentException("La contraseña no puede ser null");
        }
        return password.length() >= 8;
    }

    public boolean contieneNumero(String password) {
        if (password == null) {
            throw new IllegalArgumentException("La contraseña no puede ser null");
        }

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }
}