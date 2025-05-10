public class GeometriaSimple {

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularArea(double lado) {
        return lado * lado;
    }

    public static void main(String[] args) {
        double areaRectangulo = calcularAreaRectangulo(5.0, 3.0);
        double areaCuadrado = calcularAreaCuadrado(4.0);

        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Área del cuadrado: " + areaCuadrado);


        double areaRectanguloAlt = calcularArea(6.0, 2.5);
        double areaCuadradoAlt = calcularArea(5.0);

        System.out.println("Área del rectángulo (sobrecarga): " + areaRectanguloAlt);
        System.out.println("Área del cuadrado (sobrecarga): " + areaCuadradoAlt);
    }
}
