import java.util.Scanner;

public class MaximoEnVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];
        int maximo = Integer.MIN_VALUE;
        int posicion = -1;

        System.out.println("Ingrese 8 números enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] > maximo) {
                maximo = numeros[i];
                posicion = i;
            }
        }

        System.out.println("\nEl número mayor es: " + maximo);
        System.out.println("Se encuentra en la posición: " + posicion);
    }
}

