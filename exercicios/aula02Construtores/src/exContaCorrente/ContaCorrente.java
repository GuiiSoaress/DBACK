package exContaCorrente;

// Crie uma classe para representar uma conta corrente que possui um
// número, um saldo e um limite de cheque especial. Ao criar o objeto,
// você deverá passar como argumento para o construtor todos os
// atributos da classe. Os parâmetros do construtor deverão ter os mesmos
// nomes dos atributos da classe. Desenvolva métodos para depositar,
// consultar saldo, sacar (se possível) e verificar se o cliente está usando o
// cheque especial. Faça um programa para testar essa classe.

public class ContaCorrente {
    private int idConta;
    private double saldo;
    private double limiteChequeEspecial;
    private boolean estadoChequeEspecial;
    

    //constructor
    public ContaCorrente(int idConta, double saldo, double limiteChequeEspecial) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.limiteChequeEspecial = limiteChequeEspecial;  
    }

    //metodo para sacar dinheiro
    public void sacar(double saque){
        if(saque >= saldo && saque > 0){
            saldo -= saque;
            System.out.println("Saque de R$" + saque + " feito com sucesso!");
        }else{
            System.out.println("Saldo Insuficiente!");
        }

        if(saque < saldo && (saque - saldo) >= limiteChequeEspecial){
            saldo -= saque;
            limiteChequeEspecial - saque - saldo;
        }
    }

    public void depositar(double deposito){
        saldo += deposito;
        System.out.println("Deposito de R$" + deposito + " feito com sucesso!");
    }
















    //getters and setters
    public int getIdConta() {
        return idConta;
    }


    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }


    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    
    

    

}
