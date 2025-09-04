package exFiguraGeometrica;

public class Circulo extends Figura2D{
    //attributes
    private double diametro;

    //constructors
    public Circulo(String nome, String cor, int arestas, double diametro) {
        super(nome, cor, arestas);
        this.diametro = diametro;
    }

    //getters and setters
    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    

    
}
