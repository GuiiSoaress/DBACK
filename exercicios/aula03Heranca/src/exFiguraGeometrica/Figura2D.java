package exFiguraGeometrica;

public class Figura2D extends FiguraGeometrica {
    //Atributos
    private int arestas;
    
    //constructors
    public Figura2D(String nome, String cor, int arestas) {
        super(nome, cor);
        this.arestas = arestas;
    }

    //getters and setters
    public int getArestas() {
        return arestas;
    }

    public void setArestas(int arestas) {
        this.arestas = arestas;
    }    
}
