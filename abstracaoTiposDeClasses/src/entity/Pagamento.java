package entity;

public abstract class Pagamento {
    //Attributes
    protected double valor;

    //Constructors
    public Pagamento() {
    }

    public Pagamento(double valor) {
        this.valor = valor;
    }

    //Getters and Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    //Methods
    public abstract void processarPagamento();

    public void imprimirRecibo(){
        System.out.println("Valor do pagamento: " + valor);
    }
    
}