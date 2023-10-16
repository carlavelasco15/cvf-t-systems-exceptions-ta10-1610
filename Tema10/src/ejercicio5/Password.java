package ejercicio5;

import java.util.Random;

public class Password {
    private int longitud;
    private String contrasena;

    private final int LONGITUD_DEFAULT = 8;

    public Password() {
        this.longitud = LONGITUD_DEFAULT;
        generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public String getContrasena() {
        return contrasena;
    }

    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }
        return mayusculas > 2 && minusculas > 1 && numeros > 5;
    }

    public void generarPassword() {
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        char[] passwordArray = new char[longitud];

        for (int i = 0; i < longitud; i++) {
            passwordArray[i] = caracteres.charAt(random.nextInt(caracteres.length()));
        }

        contrasena = new String(passwordArray);
    }
}