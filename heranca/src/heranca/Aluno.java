package heranca;

public class Aluno extends Pessoa {
    //Atributes
    private String identificacao;
    private int anoLetivo;
    private int idade;
    

    //Constructors
     public Aluno(String cpf, String identificacao) {
        super(cpf);
        this.identificacao = identificacao;
    }

    //Getters and Setters
    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}



