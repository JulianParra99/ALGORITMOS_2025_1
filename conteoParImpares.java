import java.util.Scanner;

public class conteoParImpares {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

                    //variables para contar numeros
        int Par = 0;
        int Impar = 0;

                    // ingresar los 10 numeros
        for (int num = 1; num <= 10; num++) {
            System.out.print("Ingresa el número " + num + ": ");
            int numero = scanner.nextInt();

            // ahora se cuenta los ´numeros pares e impares
            if (numero % 2 == 0) {
                Par++;  // determina numero par
            } else {
                Impar++;  // cuenta los impares
            }
        }

        // Mostrar los resultados
        System.out.println("Cantidad de números pares: " + Par);
        System.out.println("Cantidad de números impares: " + Impar);

        // Cerrar el scanner
        scanner.close();
    }
}
