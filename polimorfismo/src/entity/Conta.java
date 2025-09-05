package entity;

public class Conta {
    //attributes
    private Integer numero;
    private String titular;
    protected Double saldo;

    //constructors
    public Conta() {
    }   

    public Conta(Integer numero, String titular, Double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    //getters and setters
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }
    

    public void sacar(Double valor){
        if(saldo >= valor){
            saldo -= (valor);
        }
    }

    public void depositar(Double valor){
        if(valor > 0){
            saldo += valor;
        }
    }
}
