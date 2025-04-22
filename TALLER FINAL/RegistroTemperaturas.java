import java.util.Scanner;

public class RegistroTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // crear el scanner

        // en este espacio creamos el vector para almacenar todas las 30  temperaturas
        int dias = 30; // cantidad de dias 
        double[] temperaturas = new double[dias]; //especificacion del vector y los datos que va a almacenar

        // creamos un print para solicitar al usuario las temperaturas maximas diarias
        System.out.println("Hola, Bienvenido!!\n\rPor favor ingrese las 30 temperaturas máximas del mes:");
        for (int i = 0; i < dias; i++) {
            System.out.print("temperatura del dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble(); // en este metodo scanner el ingresa cada valor de la variable i al registro de temperatura
        }

        // Variables para realizar los cálculos
        double maximo = temperaturas[0];
        double minimo = temperaturas[0];
        double suma = 0;
        int diasCalidos = 0; // Días con temperatura > 25°C.

        // creamos un ciclo para generar las temepraturas maximas, menores, calcular promedios y contar dias con temepratura < 25°C.
        for (int i = 0; i < dias; i++) {
            // Actualizar máximo y mínimo
            if (temperaturas[i] > maximo) {
                maximo = temperaturas[i];
            }
            if (temperaturas[i] < minimo) {
                minimo = temperaturas[i];
            }
            // Sumar las temperaturas para calcular el promedio
            suma += temperaturas[i]; 
            // Contar los días cálidos
            if (temperaturas[i] > 25) {
                diasCalidos++;
            }
        }

        // Calcular promedio creando una variable con el mismo nombre 
        double promedio = suma / dias;

        // aqui se impreimen y se generan los resultados
        System.out.println("\nEstos son los resultados:");
        System.out.println("La temperatura maxima registrada es: " + maximo + "°C");
        System.out.println("La temperatura mínima registrada es: " + minimo + "°C");
        System.out.println("La temperatura promedio del mes es: " + promedio + "°C");
        System.out.println("Cantidad de días con temperatura mayor a 25°C son: " + diasCalidos +"dias");

        scanner.close(); //cerramos scanner
    }
}
