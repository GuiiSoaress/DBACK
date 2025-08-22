public class Voo {
    
    private int numeroVoo;
    private String origemVoo;
    private String destinoVoo;
    private String companhiaVoo;
    private String portaoEmbarque;


    public Voo(int numeroVoo, String origemVoo, String destinoVoo, String companhiaVoo, String portaoEmbarque) {
        this.numeroVoo = numeroVoo;
        this.origemVoo = origemVoo;
        this.destinoVoo = destinoVoo;
        this.companhiaVoo = companhiaVoo;
        this.portaoEmbarque = portaoEmbarque;
    }
    
    public Voo() {
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getOrigemVoo() {
        return origemVoo;
    }

    public void setOrigemVoo(String origemVoo) {
        this.origemVoo = origemVoo;
    }

    public String getDestinoVoo() {
        return destinoVoo;
    }

    public void setDestinoVoo(String destinoVoo) {
        this.destinoVoo = destinoVoo;
    }

    public String getCompanhiaVoo() {
        return companhiaVoo;
    }

    public void setCompanhiaVoo(String companhiaVoo) {
        this.companhiaVoo = companhiaVoo;
    }
    public String getPortaoEmbarque() {
        return portaoEmbarque;
    }
    public void setPortaoEmbarque(String portaoEmbarque) {
        this.portaoEmbarque = portaoEmbarque;
    }

}
