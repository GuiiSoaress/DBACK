package exContaCorrente;

// Crie uma classe para representar uma conta corrente que possui um
// número, um saldo e um limite de cheque especial. Ao criar o objeto,
// você deverá passar como argumento para o construtor todos os
// atributos da classe. Os parâmetros do construtor deverão ter os mesmos
// nomes dos atributos da classe. Desenvolva métodos para depositar,
// consultar saldo, sacar (se possível) e verificar se o cliente está usando o
// cheque especial. Faça um programa para testar essa classe.

public class ContaCorrente {
    //definição de atributos
    private int idConta;
    private double saldo;
    private double limiteChequeEspecial;
    private boolean estadoChequeEspecial;
    private double auxLimiteChequeEspecial;

    //metodo construtor
    public ContaCorrente(int idConta, double saldo, double limiteChequeEspecial) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.limiteChequeEspecial = limiteChequeEspecial;  
        this.auxLimiteChequeEspecial = limiteChequeEspecial;
    }

    //metodo para sacar dinheiro
    public String sacar(double saque){
        //verifica se há saldo e se é um numero maior que 0
        if(saque <= saldo && saque > 0){
            saldo -= saque;
            return "Saque de R$" + saque + " feito com sucesso!";
        }
        //verifica se saque é maior que o saldo e se há limite de cheque especial
        else if(saque > saldo && (saque - saldo) <= limiteChequeEspecial){
            limiteChequeEspecial -= (saque - saldo);
            saldo -= saque;
            estadoChequeEspecial = true;
            return "Saque de R$" + saque + " feito com sucesso, Você entrou no limine do cheque Especial!";
        }
        else{
            return "Saldo insuficiente!";
        }
    }

    //metodo para depositar dinheiro
    public void depositar(double deposito){
        //verifica se o cheque especial está sendo usado
        if(estadoChequeEspecial == true){
           saldo += deposito;
           //compara o deposito com o valor do cheque especial e reativa-o
           if(deposito >= auxLimiteChequeEspecial){
            limiteChequeEspecial = auxLimiteChequeEspecial;
            estadoChequeEspecial = false;
            System.out.println("Deposito de R$" + deposito + " feito com sucesso, cheque especial reativado!");
           } 
        
        }else{
            saldo += deposito;
            System.out.println("Deposito de R$" + deposito + " feito com sucesso!");
        }
    }

    //metodo para verificar as informações da conta
    public void informacoesConta(){
        System.out.println("------------Informações da cota:------------");
        System.out.println("Id da Conta: #" + idConta);
        System.out.println("Saldo da conta: R$" + saldo);
        System.out.println("Limite do cheque especial: R$" + auxLimiteChequeEspecial);
        if (estadoChequeEspecial == true){
            System.out.println("Está utilizando cheque especial: Sim");
        } else{
             System.out.println("Está utilizando cheque especial: Não");
        }
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

    public boolean isEstadoChequeEspecial() {
        return estadoChequeEspecial;
    }

    public void setEstadoChequeEspecial(boolean estadoChequeEspecial) {
        this.estadoChequeEspecial = estadoChequeEspecial;
    }

}
