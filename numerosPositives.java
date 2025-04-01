import java.util.Scanner;

public class numerosPositives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int suma = 0;   // Variable para almacenar la suma de los números positivos
        int contador = 0; // Contador de los números positivos ingresados
        
        while (true) {
            System.out.print("Ingrese un numero entero (escriba -0- para finalizar): ");
            int numero = scanner.nextInt();
            
            if (numero == 0) {
                break;  // cierra el ciclo al ingresar el valor de cero
            }
            
            if (numero > 0) {
                suma += numero;  // Suma los números positivos
                contador++;       // Incrementa el contador de números positivos
            }
        }
        
        // Verificación de si se ingresaron números positivos
        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio de los números positivos ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        scanner.close(); 
    }
}
