import java.util.Scanner;

public class MatrizNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] notas = new double[3][4];

        for (int estudiante = 0; estudiante < 3; estudiante++) {
            System.out.println("Ingrese las notas del estudiante " + (estudiante + 1) + ":");
            for (int asignatura = 0; asignatura < 4; asignatura++) {
                System.out.print("Nota " + (asignatura + 1) + ": ");
                notas[estudiante][asignatura] = scanner.nextDouble();
            }
        }

        System.out.println("\nPromedios:");
        for (int estudiante = 0; estudiante < 3; estudiante++) {
            double suma = 0;
            for (int asignatura = 0; asignatura < 4; asignatura++) {
                suma += notas[estudiante][asignatura];
            }
            double promedio = suma / 4;
            System.out.println("Estudiante " + (estudiante + 1) + ": " + promedio);
        }

        scanner.close();
    }
}
