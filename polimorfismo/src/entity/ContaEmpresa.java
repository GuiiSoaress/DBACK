package entity;

public class ContaEmpresa extends Conta{
    //attributos
    private Double limiteDeEmprestimo;

    //constructors
    public ContaEmpresa() {}

    public ContaEmpresa(Integer numero, String titular, Double saldo, Double limiteDeEmprestimo) {
        super(numero, titular, saldo);
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }

    //getters and setters
    public Double getLimiteDeEmprestimo() {
        return limiteDeEmprestimo;
    }

    public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }

    //methods 
    public void emprestar(Double valor){
        if(valor <= limiteDeEmprestimo){
            depositar(valor);
        }
    }

    @Override
    public final void sacar(Double valor){
        super.sacar(valor);
        saldo -= 2;
    }
    
    
}
