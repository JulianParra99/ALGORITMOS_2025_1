import java.util.Scanner;

public class BuscarNumeroEnVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el número que desea buscar: ");
        int numeroBuscado = scanner.nextInt();

        boolean encontrado = false;
        for (int numero : numeros) {
            if (numero == numeroBuscado) {
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("El número sí se encuentra en el vector.");
        } else {
            System.out.println("El número NO se encuentra en el vector.");
        }

        scanner.close();
    }
}
