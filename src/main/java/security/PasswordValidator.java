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

    public boolean contieneNumero(String password) {
        if (password == null) {
            throw new IllegalArgumentException("La contraseña no puede ser null");
        }

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }

    //Parte 4: contieneMayuscula (Sabrina Jeria)
    public boolean contieneMayuscula(String password) {  //Válida que la contraseña tenga a lo menos una mayuscula

        validarNull(password);  //Llama a metodo de validación (null) para con ello evitar errores

        for (char c : password.toCharArray()) {  // String a arreglo de caracteres (los recorre uno por uno)

            if (Character.isUpperCase(c)) { //verifica si es una letra mayuscula)

                return true; // si la encuentra devuelve un true
            }
        }

        return false; // si no la encuentra false
    }

}

