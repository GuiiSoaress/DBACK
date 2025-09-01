package heranca;

public class Triangulo extends Figura2D {   
    //Atributes
    private String tipo; // Isoceles, Escaleno ou equilatero


    //Constructors
    public Triangulo(double base, double altura, String tipo) {
        super(base, altura);
        this.tipo = tipo;
    }

    //getters and settes
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //methods
    public double calculoArea(){ // retorna a área do triangulo
        return (getBase() * getAltura()) / 2;
    } 
}
