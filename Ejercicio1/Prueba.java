package Taller13.Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        // Crear una instancia de Rectangulo
        Rectangulo rectangulo = new Rectangulo(4.0, 5.0);
        System.out.println("Área del Rectángulo: " + rectangulo.calcularArea());

        System.out.println("-------------------------");

        // Crear una instancia de Triangulo
        Triangulo triangulo = new Triangulo(3.0, 6.0);
        System.out.println("Área del Triángulo: " + triangulo.calcularArea());
    }
}

