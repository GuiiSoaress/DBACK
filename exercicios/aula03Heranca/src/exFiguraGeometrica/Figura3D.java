package exFiguraGeometrica;

public class Figura3D extends FiguraGeometrica{
    //atributos
    private int numeroFaces;


    //constructors
    public Figura3D(String nome, String cor, int numeroFaces) {
        super(nome, cor);
        this.numeroFaces = numeroFaces;
    }
    
    //getters and Setters
    public int getNumeroFaces() {
        return numeroFaces;
    }

    public void setNumeroFaces(int numeroFaces) {
        this.numeroFaces =  numeroFaces ;
    }

    
    
}
