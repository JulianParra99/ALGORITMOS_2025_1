import java.util.Scanner;

public class vector1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear un vector de 5 elementos
        int[] numeros = new int[5];
        
        // ingresar los 5 numeros
        System.out.println("Por favor, ingrese 5 numeros enteros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // 
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += numeros[i];
        }
        
        // 
        System.out.println("La suma total de los números ingresados es: " + suma);
        
        scanner.close();
    }
}

