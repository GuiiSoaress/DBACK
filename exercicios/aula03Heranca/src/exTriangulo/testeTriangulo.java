package exTriangulo;

public class testeTriangulo {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(10, 5, "Escaleno");
        Triangulo triangulo2 = new Triangulo(20, 10, "Isoceles");
        Triangulo triangulo3 = new Triangulo(30, 20, "Equilatero");

        System.out.println("Tipos de Triangulos: ");
        System.out.println("Triangulo: " + triangulo1.getTipo());
        System.out.println("Triangulo: " + triangulo2.getTipo());
        System.out.println("Triangulo: " + triangulo3.getTipo());

        System.out.println("Áreas dos triângulos: ");
        System.out.printf("Triângulo1: %.2f\n", triangulo1.calculoArea());
        System.out.printf("Triângulo2: %.2f\n", triangulo2.calculoArea());
        System.out.printf("Triângulo3: %.2f\n", triangulo3.calculoArea());

    }

}
