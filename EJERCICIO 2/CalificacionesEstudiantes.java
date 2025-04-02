import java.util.Scanner;

public class CalificacionesEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int aprobados = 0;
        int reprobados = 0;
        int calificacion;

                        // Ciclo para ingresar calificaciones hasta que se ingrese -1
        while (true) {
            System.out.print("Ingresa la calificación del estudiante (0-100) o -1 para terminar: ");
            calificacion = scanner.nextInt();

            if (calificacion == -1) {
                break; // Rompe el ciclo si se ingresa -1
            }


                    /*Verifica que la calificación esté en el rango permitido usando el operador AND, es decir maror igual que Cero
                    y menor o igual que 100 */  
                    
            if (calificacion >= 0 && calificacion <= 100) { 
                if (calificacion >= 60) {
                    aprobados++;              // suma el contador de aprobados
                } else {
                    reprobados++;             // suma el contador de reprobados
                }
                                            // evidencia mensaje de valores no aptos
            } else {
                System.out.println("Calificación inválida, ingresa un valor entre 0 y 100.");
            }
        }

                                            // Mostrar el resultado
        System.out.println("Número de estudiantes que aprobaron: " + aprobados);
        System.out.println("Número de estudiantes que reprobaron: " + reprobados);
        scanner.close();
    }
    
}