import java.util.Scanner;

public class RegistroTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[7];
        double suma = 0;
        boolean hayFiebre = false;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Ingrese la temperatura del día " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
            suma += temperaturas[i];

            if (temperaturas[i] > 38) {
                hayFiebre = true;
            }
        }

        double promedio = suma / temperaturas.length;

        System.out.println("\nPromedio de temperaturas: " + promedio + "°C");
        if (hayFiebre) {
            System.out.println("⚠️ Alerta: Se detectó fiebre en al menos un día.");
        } else {
            System.out.println("✅ No se detectó fiebre durante la semana.");
        }
    }
}
