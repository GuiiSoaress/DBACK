package exFiguraGeometrica;

public class Triangulo extends Figura2D {
    // attributes
    private double altura;
    private double base;

    // constructors
    public Triangulo(String nome, String cor, int arestas, double altura, double base) {
        super(nome, cor, arestas);
        this.altura = altura;
        this.base = base;
    }

    // getters and setters
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

}
