package entity;

public class ContaPoupanca extends Conta{
    //attributes
    private Double taxaDeJuros;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaDeJuros) {
        super(numero, titular, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    //getters and setters
    public Double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(Double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    //methods
    public void atualizarSaldo(){
        saldo += saldo * taxaDeJuros;
    }

    @Override
    public final void sacar(Double valor){
        super.sacar(valor);
        saldo -= 5;
    }

    
    
}
