import java.util.Scanner;  // Agregado para usar Scanner

public class TorneoPuntuaciones {
    public static void main(String[] args) {  // Error corregido: "string" cambiado a "String"

        // Declarar vector para 5 puntuaciones
        int[] puntuaciones = new int[5];  // Error corregido: faltaba el punto y coma al final

        Scanner teclado = new Scanner(System.in);
        int puntuacionMaxima = Integer.MIN_VALUE;  // Inicializado con el menor valor posible para asegurar que cualquier valor ingresado sea mayor

        System.out.println("Ingrese las 5 puntuaciones de los jugadores:");

        // Ciclo corregido para ingresar puntuaciones
        for (int i = 0; i < puntuaciones.length; i++) {  // Error corregido: condición cambiada de i <= puntuaciones.length a i < puntuaciones.length, incrementador cambiado de i+ a i++
            System.out.print("Puntuación jugador " + (i + 1) + ": ");
            puntuaciones[i] = teclado.nextInt();

            // Comprobar si es la puntuación máxima
            if (puntuaciones[i] > puntuacionMaxima) {  // Error corregido: condición cambiada para buscar la mayor puntuación (">" en lugar de "<")
                puntuacionMaxima = puntuaciones[i];
            }
        }

        // Mostrar puntuaciones (bucle while corregido)
        System.out.println("\nPuntuaciones ingresadas:");
        int k = 0;
        while (k < puntuaciones.length) {  // Error corregido: condición cambiada de asignación (=) a comparación (<)
            System.out.println("Jugador " + (k + 1) + ": " + puntuaciones[k]);
            k++;  // Incrementar contador para evitar ciclo infinito (error lógico solucionado)
        }

        // Mostrar puntuación máxima
        System.out.println("\nLa puntuación máxima fue: " + puntuacionMaxima);

        teclado.close();  // Cerrar recurso Scanner (buena práctica)
    }
}
