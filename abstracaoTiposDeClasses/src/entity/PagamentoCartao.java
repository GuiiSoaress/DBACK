package entity;

public class PagamentoCartao extends Pagamento{
    //Attributes
    private String numeroDoCartao;

    
    //Constructors
    public PagamentoCartao() {
        
    }

    public PagamentoCartao(double valor, String numeroDoCartao) {
        super(valor);
        this.numeroDoCartao = numeroDoCartao;
    }

    //Getters And Setters    
    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }
    
    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }
    
    //Methods 

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento Efetuado via Cartão");
    }

}
