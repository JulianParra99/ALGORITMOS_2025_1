import java.util.Scanner;

public class SumaDiagonales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Ingrese el tamaño de la matriz (máximo 5): ");
            n = scanner.nextInt();
        } while (n < 1 || n > 5);

        int[][] matriz = new int[n][n];
        int sumaPrincipal = 0;
        int sumaSecundaria = 0;

        System.out.println("\nIngrese los valores de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            sumaPrincipal += matriz[i][i];           
            sumaSecundaria += matriz[i][n - 1 - i];   
        }

        System.out.println("\nSuma de la diagonal principal: " + sumaPrincipal);
        System.out.println("Suma de la diagonal secundaria: " + sumaSecundaria);
    }
}

