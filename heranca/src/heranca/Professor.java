package heranca;

public class Professor extends Pessoa {
    //Atributes
    private int numeroDeAulas;
    private int quantidadeDeTurmas;
    private String periodo;

    //Constructors  
    public Professor(String cpf, int numeroDeAulas) {
        super(cpf);
        this.numeroDeAulas = numeroDeAulas;
    }

    //Getters and Setters
    public int getNumeroDeAulas() {
        return numeroDeAulas;
    }
    public void setNumeroDeAulas(int numeroDeAulas) {
        this.numeroDeAulas = numeroDeAulas;
    }
    public int getQuantidadeDeTurmas() {
        return quantidadeDeTurmas;
    }
    public void setQuantidadeDeTurmas(int quantidadeDeTurmas) {
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }
    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    
}
