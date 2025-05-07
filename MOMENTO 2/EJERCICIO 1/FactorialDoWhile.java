import java.util.Scanner;

public class FactorialDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        int num = scanner.nextInt();
        scanner.close();

        int fac = 1;
        int i = num;

        if (num == 0) {
            fac = 1;
        } else {
            do {
                fac *= i;
                i--;
            } while (i > 1);
        }

        System.out.println("El factorial de " + num + " es: " + fac);
    }
}