package entity;

public class PagamentoPix extends Pagamento {
    //Attributes
    private String contaBancaria;

    //Constructors
    public PagamentoPix() {
    }

    public PagamentoPix(double valor, String contaBancaria) {
        super(valor);
        this.contaBancaria = contaBancaria;
    }

    //Getters And Setters
    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }
    
    //Methods
    @Override
    public void processarPagamento() {
       System.out.println("Pagamento Efetuado via PIX");
    }


    
    
}
