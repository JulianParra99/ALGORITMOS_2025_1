import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        int numA = scanner.nextInt();
        scanner.close();

        int fac = 1;
        int i = numA;

        while (i > 1) {
            fac *= i;
            i--;
        }

        System.out.println("El factorial de " + numA + " es: " + fac);
    }
}