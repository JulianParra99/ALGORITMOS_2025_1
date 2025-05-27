// Única clase para el Reto 1
import java.util.Scanner;

public class RegistroPuntuaciones {
    /* Usaremos arrays de tamaño fijo para almacenar nombres y
    puntuaciones. */
    // Suponemos un máximo de 5 puntuaciones altas.
    static final int MAX_PUNTUACIONES = 5;
    String[] nombresJugadores = new String[MAX_PUNTUACIONES];
    int[] puntuaciones = new int[MAX_PUNTUACIONES];
    int contadorActual = 0; // Para saber cuántas puntuaciones hemos registrado
    
    // Método para agregar una nueva puntuación
    /* No se preocupará por ordenarlas, solo por registrarlas si hay
    espacio.*/
    public void agregarPuntuacion(String nombre, int puntaje) {
        if (contadorActual < MAX_PUNTUACIONES) {
            nombresJugadores[contadorActual] = nombre; // Agregado punto y coma
            puntuaciones[contadorActual] = puntaje; // Agregado punto y coma
            contadorActual++; // Agregado punto y coma
            System.out.println("Puntuación para " + nombre + " registrada.");
        } else {
            System.out.println("Registro lleno. No se pudo agregar la puntuación de " + nombre); // Corregido 'nomre' a 'nombre'
        }
        // Eliminado return innecesario
    }
    
    // Método para mostrar todas las puntuaciones registradas
    public void mostrarPuntuaciones() {
        System.out.println("\n--- Puntuaciones Más Altas ---");
        if (contadorActual == 0) {
            System.out.println("Aún no hay puntuaciones registradas.");
            return; // Agregado return para salir si no hay puntuaciones
        }
        
        for (int i = 0; i < contadorActual; i++) { // Corregida condición de <= a <
            System.out.println(nombresJugadores[i] + ": " + puntuaciones[i] + " puntos");
        }
        System.out.println("---------------------------");
    }
    
    public static void main(String[] args) {
        RegistroPuntuaciones registro = new RegistroPuntuaciones();
        Scanner teclado = new Scanner(System.in);
        String opcionUsuario = "0"; // Mantenido como String
        
        while (!opcionUsuario.equals("3")) {
            System.out.println("\nSistema de Puntuaciones Arcade");
            System.out.println("1. Agregar Puntuación");
            System.out.println("2. Mostrar Puntuaciones");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcionUsuario = teclado.nextLine();
            
            switch (opcionUsuario) {
                case "1": // Corregido de case 1 a case "1"
                    if (registro.contadorActual < MAX_PUNTUACIONES) {
                        System.out.print("Nombre del jugador: ");
                        String nombreJugador = teclado.nextLine();
                        System.out.print("Puntuación obtenida: ");
                        int puntajeObtenido = teclado.nextInt();
                        teclado.nextLine(); // Limpiar buffer
                        registro.agregarPuntuacion(nombreJugador, puntajeObtenido);
                    } else {
                        System.out.println("El registro de puntuaciones está lleno.");
                    }
                    break;
                case "2":
                    registro.mostrarPuntuaciones();
                    break;
                case "3":
                    System.out.println("Gracias por jugar!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente."); // Agregado punto y coma
            }
        }
        teclado.close();
    }
}