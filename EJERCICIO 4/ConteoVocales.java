import java.util.Scanner;

public class ConteoVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] caracteres = new char[10];
        int contadorVocales = 0;

        System.out.println("Ingrese 10 caracteres (uno por uno):");

        for (int i = 0; i < caracteres.length; i++) {
            System.out.print("Carácter " + (i + 1) + ": ");
            String input = scanner.nextLine();

            caracteres[i] = input.toLowerCase().charAt(0);
        }

        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("\nCantidad de vocales encontradas: " + contadorVocales);
    }
}