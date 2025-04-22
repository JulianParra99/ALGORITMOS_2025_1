import java.util.Scanner;

public class GestionCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes: ");
        int numEstudiantes = scanner.nextInt();

        double[][] calificaciones = new double[numEstudiantes][3];

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Estudiante " + i + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("  Ingrese la nota del examen " + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextDouble();
            }
        }

        double[] promedios = new double[numEstudiantes];
        for (int i = 0; i < numEstudiantes; i++) {
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += calificaciones[i][j];
            }
            promedios[i] = suma / 3.0;
        }

        int aprobados = 0;
        int reprobados = 0;

        for (double promedio : promedios) {
            if (promedio >= 6.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        System.out.println("\nEstudiantes que aprobaron: " + aprobados);
        System.out.println("Estudiantes que reprobaron: " + reprobados);

        System.out.println("\nPromedios finales por estudiante:");
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.printf("Estudiante %d - Promedio final: %.2f\n", i, promedios[i]);
        }

        scanner.close();
    }
}
