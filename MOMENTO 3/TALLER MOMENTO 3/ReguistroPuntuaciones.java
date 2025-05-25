import java.util.Scanner;

public class RegistroPuntuaciones {
    // Usaremos arrays de tamaño fijo para almacenar nombres y puntuaciones.
    // Suponemos un máximo de 5 puntuaciones altas.
    static final int MAX_PUNTUACIONES = 5;
    String[] nombresJugadores = new String[MAX_PUNTUACIONES];
    int[] puntuaciones = new int[MAX_PUNTUACIONES];
    int contadorActual = 0; // Para saber cuántas puntuaciones hemos registrado

    // Método para agregar una nueva puntuación
    // No se preocupará por ordenarlas, solo por registrarlas si hay espacio.
    public void agregarPuntuacion(String nombre, int puntaje) {
        if (contadorActual < MAX_PUNTUACIONES) {
            nombresJugadores[contadorActual] = nombre; // Error corregido: Faltaba ;
            puntuaciones[contadorActual] = puntaje;
            contadorActual++; // Error corregido: Faltaba ;
            System.out.println("Puntuación para " + nombre + " registrada.");
        } else {
            System.out.println("Registro lleno. No se pudo agregar la puntuación de " + nombre); // Error corregido: 'nomre' por 'nombre'
        }
        // El 'return;' al final de un método 'void' es redundante si es la última instrucción y no hay una condición.
        // Se puede dejar o quitar, dependiendo del estilo. Para este caso, lo he eliminado para mayor claridad.
    }

    // Método para mostrar todas las puntuaciones registradas
    public void mostrarPuntuaciones() {
        System.out.println("\n--- Puntuaciones Más Altas ---");
        if (contadorActual == 0) {
            System.out.println("Aún no hay puntuaciones registradas.");
            return; // Error corregido: Agregado 'return;' para salir si no hay puntuaciones.
        }
        // Error corregido: La condición del bucle debe ser '< contadorActual' para evitar ArrayIndexOutOfBoundsException.
        // Si el contadorActual es 0, el bucle no se ejecuta. Si es 1, se ejecuta para i=0.
        for (int i = 0; i < contadorActual; i++) {
            System.out.println(nombresJugadores[i] + ": " + puntuaciones[i] + " puntos");
        }
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        RegistroPuntuaciones registro = new RegistroPuntuaciones();
        Scanner teclado = new Scanner(System.in);
        String opcionUsuario; // Error corregido: Declarada como String, inicialización movida al bucle.

        while (true) { // Usamos un bucle infinito y salimos con 'break' cuando la opción sea "3"
            System.out.println("\nSistema de Puntuaciones Arcade");
            System.out.println("1. Agregar Puntuación");
            System.out.println("2. Mostrar Puntuaciones");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcionUsuario = teclado.nextLine(); // Leemos la opción como String

            switch (opcionUsuario) { // Ahora el switch funciona correctamente con String
                case "1": // Error corregido: case debe ser String "1"
                    // No es necesario el if aquí, ya que el método agregarPuntuacion maneja el caso de registro lleno.
                    System.out.print("Nombre del jugador: ");
                    String nombreJugador = teclado.nextLine();
                    System.out.print("Puntuación obtenida: ");
                    int puntajeObtenido = -1; // Inicializamos con un valor seguro
                    try {
                        puntajeObtenido = Integer.parseInt(teclado.nextLine()); // Leemos como String y convertimos a int
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida. Por favor, ingresa un número para la puntuación.");
                        break; // Salimos del switch para que el usuario pueda intentar de nuevo
                    }
                    registro.agregarPuntuacion(nombreJugador, puntajeObtenido);
                    break;
                case "2":
                    registro.mostrarPuntuaciones();
                    break;
                case "3":
                    System.out.println("Gracias por jugar!");
                    teclado.close(); // Cerramos el scanner antes de salir
                    return; // Salimos del método main para terminar la aplicación
                default:
                    System.out.println("Opción no válida. Intente nuevamente."); // Error corregido: Faltaba ;
            }
        }
    }
}