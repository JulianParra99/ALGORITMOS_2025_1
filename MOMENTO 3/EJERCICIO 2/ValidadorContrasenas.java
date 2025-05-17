import java.util.Scanner;


public class ValidadorContrasenas {

    // Constante para la longitud mínima
    private static final int LONGITUD_MINIMA = 8;

    /**
     * Verifica si la contraseña tiene la longitud mínima requerida.
     * @param password La contraseña a verificar.
     * @return true si la longitud es válida, false en caso contrario.
     */
    public static boolean esLongitudValida(String password) {
        return password != null && password.length() >= LONGITUD_MINIMA;
    }

    /**
     * Verifica si la contraseña contiene al menos una letra mayúscula.
     * @param password La contraseña a verificar.
     * @return true si contiene una mayúscula, false en caso contrario.
     */
    public static boolean contieneMayuscula(String password) {
        if (password == null) {
            return false;
        }
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si la contraseña contiene al menos una letra minúscula.
     * @param password La contraseña a verificar.
     * @return true si contiene una minúscula, false en caso contrario.
     */
    public static boolean contieneMinuscula(String password) {
        if (password == null) {
            return false;
        }
        
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si la contraseña contiene al menos un dígito.
     * @param password La contraseña a verificar.
     * @return true si contiene un dígito, false en caso contrario.
     */
    public static boolean contieneDigito(String password) {
        if (password == null) {
            return false;
        }
        
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si una contraseña es segura según todos los criterios.
     * @param password La contraseña a verificar.
     * @return true si la contraseña es segura, false en caso contrario.
     */
    public static boolean esContrasenaSegura(String password) {
        return esLongitudValida(password) &&
               contieneMayuscula(password) &&
               contieneMinuscula(password) &&
               contieneDigito(password);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String prueba1 = "clave123";
        String prueba2 = "ClaveSegura1";
        String prueba3 = "OTRAMAYUSCULA2";
        String prueba4 = "abc";
        String prueba5 = "sindigito";
        String prueba6 = "SINMINUSCULA123";
        String prueba7 = "sinmayuscula123";
        String prueba8 = null;

        System.out.println("Ingrese su contraseña: ");

        String prueba9 = scanner.nextLine();

        System.out.println("'" + prueba1 + "' es segura? " + esContrasenaSegura(prueba1));
        System.out.println("'" + prueba2 + "' es segura? " + esContrasenaSegura(prueba2));
        System.out.println("'" + prueba3 + "' es segura? " + esContrasenaSegura(prueba3));
        System.out.println("'" + prueba9 + "' es segura? " + esContrasenaSegura(prueba9)); // agregar esta variable por teclado a los printline de abajo.
        
        // Pruebas adicionales
        System.out.println("\nPruebas adicionales:");
        System.out.println("'" + prueba4 + "' es segura? " + esContrasenaSegura(prueba4));
        System.out.println("'" + prueba5 + "' es segura? " + esContrasenaSegura(prueba5));
        System.out.println("'" + prueba6 + "' es segura? " + esContrasenaSegura(prueba6));
        System.out.println("'" + prueba7 + "' es segura? " + esContrasenaSegura(prueba7));
        System.out.println("'null' es segura? " + esContrasenaSegura(prueba8));
        
        // Pruebas individuales de cada criterio
        System.out.println("\nPruebas de criterios individuales para 'ClaveSegura1':");
        System.out.println("Longitud válida: " + esLongitudValida(prueba2));
        System.out.println("Contiene mayúscula: " + contieneMayuscula(prueba2));
        System.out.println("Contiene minúscula: " + contieneMinuscula(prueba2));
        System.out.println("Contiene dígito: " + contieneDigito(prueba2));
    }
}
