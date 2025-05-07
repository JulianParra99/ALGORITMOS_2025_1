import java.util.Scanner;

public class EdadPersonitas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                                // asignamos variables de edad
        int MayoresEdad = 0;
        int MenoresEdad = 0;
        
        
        while (true) {
            System.out.print("Ingrese la edad de una persona (valor negativo para terminar): ");
            int edad = scanner.nextInt();
            
            if (edad <= 0) {
                break;          // si el valor  es negativo, rompemos el ciclo
            }
            
            if (edad <= 17) {
                MenoresEdad++;  // Si la edad es menor o igual a 17 seria menor de edad
            } else {
                MayoresEdad++;  // Si la edad es superior a 17 serian mayores
            }
        }
        
                                // generar resultados : 
        System.out.println("Personas menores de edad: " + MenoresEdad);
        System.out.println("Personas mayores de edad: " + MayoresEdad);
        
        scanner.close();
    }
}

