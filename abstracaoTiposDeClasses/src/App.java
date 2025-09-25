import entity.PagamentoCartao;
import entity.PagamentoPix;

public class App {
    public static void main(String[] args) throws Exception {
        
        PagamentoCartao p1 = new PagamentoCartao(1275.34, "123456789");
        PagamentoPix p2 = new PagamentoPix(258.79, "98765432-1");
        
        p1.processarPagamento();
        p2.processarPagamento();

        p1.imprimirRecibo();
        p2.imprimirRecibo();
    }
}
