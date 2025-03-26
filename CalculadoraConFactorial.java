import java.util.Scanner;

public class CalculadoraConFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Dividir dos números");
            System.out.println("5. Factorial de un número");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    int suma1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int suma2 = scanner.nextInt();
                    System.out.println("Resultado: " + (suma1 + suma2));
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    int resta1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int resta2 = scanner.nextInt();
                    System.out.println("Resultado: " + (resta1 - resta2));
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    int mult1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int mult2 = scanner.nextInt();
                    System.out.println("Resultado: " + (mult1 * mult2));
                    break;
                case 4:
                    System.out.print("Ingrese el dividendo: ");
                    double div1 = scanner.nextDouble();
                    System.out.print("Ingrese el divisor: ");
                    double div2 = scanner.nextDouble();
                    if (div2 != 0) {
                        System.out.println("Resultado: " + (div1 / div2));
                    } else {
                        System.out.println("No se puede dividir por cero.");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese un número para calcular su factorial: ");
                    int num = scanner.nextInt();
                    int factorial = 1;
                    int i = num;
                    while (i > 1) {
                        factorial *= i;
                        i--;
                    }
                    System.out.println("El factorial de " + num + " es: " + factorial);
                    break;
                case 6:
                    System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}

