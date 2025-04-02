import java.util.Scanner;

public class Fibunacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de secuencias de la serie Fibonacci: ");
        int numSec = scanner.nextInt();
        scanner.close();

        int numA = 0, numB = 1, i = 0;
        
        System.out.println("Secuencia de Fibonacci:");
        while (i < numSec) {
            System.out.print(numA + " ");
            int temp = numA + numB;
            numA = numB;
            numB = temp;
            i++;
        }
    }
}