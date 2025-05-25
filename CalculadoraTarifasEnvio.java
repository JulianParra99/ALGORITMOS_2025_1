// Unica clase para el Reto 2
import java.util.Scanner;

public class CalculadoraTarifasEnvio {
 // Costos base por zona (valores fijos en pesos colombianos)
 public static final double COSTO_BASE_LOCAL = 5000.0;
 public static final double COSTO_BASE_NACIONAL = 15000.0;
 public static final double COSTO_BASE_INTERNACIONAL = 50000.0;

 // Costo adicional por kilogramo (valores fijos en pesos colombianos)
 public static final double COSTO_ADICIONAL_POR_KG_LOCAL = 1000.0;
 public static final double COSTO_ADICIONAL_POR_KG_NACIONAL =
3000.0;
 public static final double COSTO_ADICIONAL_POR_KG_INTERNACIONAL =
10000.0;

 /**
 * Calcula el costo adicional basado en el peso del paquete y la
zona.
 *
 * @param pesoKg El peso del paquete en kilogramos.
 * @param zona El tipo de zona: 1 para Local, 2 para Nacional, 3 para
Internacional.
 * @return El costo adicional por peso calculado. Si la zona no es
válida, retorna 0.0.
 */
 public static double calcularCostoAdicionalPorPeso(double pesoKg,
int zona) {
 double costoAdicional = 0.0;
 // TODO: Implementar la lógica para calcular el costo adicional.
 // Si la zona es 1 (Local), el costoAdicional es pesoKg *
COSTO_ADICIONAL_POR_KG_LOCAL.
 // Si la zona es 2 (Nacional), el costoAdicional es pesoKg *
COSTO_ADICIONAL_POR_KG_NACIONAL.
 // Si la zona es 3 (Internacional), el costoAdicional es pesoKg *
COSTO_ADICIONAL_POR_KG_INTERNACIONAL.
 // Si el peso es negativo, el costo adicional debe ser 0.
 // --------- INICIO DE TU CÓDIGO ---------
 if (pesoKg < 0) {
 return 0.0; // No se cobra adicional por peso negativo
 }
 switch (zona) {
 case 1: // Local
 costoAdicional = pesoKg * COSTO_ADICIONAL_POR_KG_LOCAL;
 break;
 case 2: // Nacional
 costoAdicional = pesoKg * COSTO_ADICIONAL_POR_KG_NACIONAL;
 break;
 case 3: // Internacional
 costoAdicional = pesoKg * COSTO_ADICIONAL_POR_KG_INTERNACIONAL;
 break;
 default:
 System.out.println("Advertencia: Zona no válida para
costo adicional.");
 costoAdicional = 0.0; // O manejar error como se
prefiera
 break;
 }
 // --------- FIN DE TU CÓDIGO ---------
 return costoAdicional;
 }

 /**
 * Obtiene el costo base según la zona de envío.
 *
 * @param zona El tipo de zona: 1 para Local, 2 para Nacional, 3 para
Internacional.
 * @return El costo base correspondiente. Si la zona no es válida,
retorna 0.0.
 */
 public static double obtenerCostoBasePorZona(int zona) {
 // TODO: Implementar la lógica para obtener el costo base.
 // Utilizar un switch o if-else if para determinar el costo base
 // según las constantes COSTO_BASE_LOCAL, COSTO_BASE_NACIONAL,
COSTO_BASE_INTERNACIONAL.
 // --------- INICIO DE TU CÓDIGO ---------
 double costoBase = 0.0;
 switch (zona) {
 case 1:
 costoBase = COSTO_BASE_LOCAL;
 break;
 case 2:
 costoBase = COSTO_BASE_NACIONAL;
 break;
 case 3:
 costoBase = COSTO_BASE_INTERNACIONAL;
 break;
 default:
 System.out.println("Advertencia: Zona no válida para costo base.");
 costoBase = 0.0;
 break;
 }
 return costoBase;
 // --------- FIN DE TU CÓDIGO ---------
 }

 /**
 * Calcula la tarifa total del envío.
 * La tarifa total es la suma del costo base por zona y el costo
adicional por peso.
 *
 * @param pesoKg El peso del paquete en kilogramos.
 * @param zona El tipo de zona: 1 para Local, 2 para Nacional, 3 para
Internacional.
 * @return La tarifa total calculada.
 */
 public static double calcularTarifaTotal(double pesoKg, int zona) {
 double tarifaTotal = 0.0;
 // TODO: Implementar la lógica para calcular la tarifa total.
 // 1. Llama al método obtenerCostoBasePorZona.
 // 2. Llama al método calcularCostoAdicionalPorPeso.
 // 3. Suma ambos resultados para obtener la tarifaTotal.
 // --------- INICIO DE TU CÓDIGO ---------
 double costoBase = obtenerCostoBasePorZona(zona);
 double costoAdicional = calcularCostoAdicionalPorPeso(pesoKg, zona);
 tarifaTotal = costoBase + costoAdicional;
 // --------- FIN DE TU CÓDIGO ---------
 return tarifaTotal;
 }

 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("--- Calculadora de Tarifas de Envío
Logística Veloz S.A. ---");
 double pesoPaquete;
 // TODO: Solicitar y validar el peso del paquete.
 // Debe ser un número positivo. Usa un bucle do-while hasta que
se ingrese un valor válido.
 // --------- INICIO DE TU CÓDIGO (lectura peso) ---------
 do {
 System.out.print("Ingrese el peso del paquete en kilogramos (ej: 2.5): ");
 while (!scanner.hasNextDouble()) {
 System.out.println("Entrada inválida. Por favor, ingrese un número para el peso.");
 scanner.next(); // Consumir la entrada inválida
 System.out.print("Ingrese el peso del paquete en kilogramos (ej: 2.5): ");
 }
 pesoPaquete = scanner.nextDouble();
 if (pesoPaquete <= 0) {
 System.out.println("El peso debe ser un número positivo. Intente de nuevo.");
 }
 } while (pesoPaquete <= 0);
 // --------- FIN DE TU CÓDIGO (lectura peso) ---------

 int zonaEnvio;
 // TODO: Solicitar y validar la zona de envío.
 // Debe ser 1 (Local), 2 (Nacional), o 3 (Internacional). Usa un
bucle do-while.
 // --------- INICIO DE TU CÓDIGO (lectura zona) ---------
 do {
 System.out.println("Seleccione la zona de envío:");
 System.out.println("1. Local");
 System.out.println("2. Nacional");
 System.out.println("3. Internacional");
 System.out.print("Opción (1-3): ");
 while (!scanner.hasNextInt()) {
 System.out.println("Entrada inválida. Por favor, ingrese un número para la zona.");
 scanner.next(); // Consumir la entrada inválida
 System.out.print("Opción (1-3): ");
 }
 zonaEnvio = scanner.nextInt();
 if (zonaEnvio < 1 || zonaEnvio > 3) {
 System.out.println("Opción de zona no válida. Por favor, ingrese 1, 2 o 3.");
 }
 } while (zonaEnvio < 1 || zonaEnvio > 3);
 // --------- FIN DE TU CÓDIGO (lectura zona) ---------

 double tarifaFinal = calcularTarifaTotal(pesoPaquete,
zonaEnvio);
 System.out.println("\n--- Detalle del Envío ---");
 System.out.println("Peso del Paquete: " + pesoPaquete + " kg");
 String nombreZona = "";
 switch (zonaEnvio) {
 case 1: nombreZona = "Local"; break;
 case 2: nombreZona = "Nacional"; break;
 case 3: nombreZona = "Internacional"; break;
 }
 System.out.println("Zona de Destino: " + nombreZona);
 System.out.println("Tarifa Total de Envío: $" +
String.format("%,.2f", tarifaFinal));
 System.out.println("---------------------------");
 scanner.close();
 }
}