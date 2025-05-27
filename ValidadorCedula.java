import java.util.Scanner;

public class ValidadorCedula {

// Creamos un método que valida el formato de la cédula
    public static boolean esFormatoCedulaValido(String numeroCedula) {
        // ésta parte verifica que tenga exactamente 10 caracteres  :D
        if (numeroCedula.length() != 10) {
            return false;
        }

        /*  establecer que todos los carácteres sean dígitos
        mediante un ciclo for que recorra cada caracter de la cadena numeroCedula*/
        for (int i = 0; i < numeroCedula.length(); i++) {
            if (!Character.isDigit(numeroCedula.charAt(i))) { 
            // !Charac... es un método de Java que devuelve true si el carácter es un dígito numérico (0-9).
                return false;
            }
        }

        // Verifica que no empiece con '0' en el primer caracter con el metodo 
        //charAt...index 0 es el primer caracter de la cadena
        if (numeroCedula.charAt(0) == '0') {
            return false;
        }

        return true; // Si pasa todas las validaciones
    }


    // Método principal Main :D

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-= Sistema Validador de Formato de Cédulas =-           version 0.1.7");

        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese el número de cédula a validar: ");
            String cedula = scanner.nextLine();
            // aqui se crea una variable y se le instancia el metodo esFormato....
            boolean esValido = esFormatoCedulaValido(cedula);

            if (esValido) {
                System.out.println("Formato de Cédula VÁLIDO.");
            } else {
                System.out.println("Formato de Cédula INVÁLIDO.");
            }

            System.out.print("¿Quieres validar otra cédula? (S/N): ");

            /* a las opciones ingresadas por scanner se anulan los espacios y 
             * la minuscula se ingresa como una mayuscula */
            String respuesta = scanner.nextLine().trim().toLowerCase();
            

            /* aquí si la respuesta es distinta de la letra "s" no ejecutara la orden 
            del ciclo while "continuar" ...preguntar para validar otra cedula */
            if (!respuesta.equals("s")) {
                continuar = false;
                System.out.println("Gracias por usar el sistema.");
            }
        }

        scanner.close();
    }

    
}

