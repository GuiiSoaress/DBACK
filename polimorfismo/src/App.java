import entity.Conta;
import entity.ContaEmpresa;
import entity.ContaPoupanca;
import exemploSobrecarga.Calcular;

public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta(1010, "André Roberto", 0.0);
        ContaEmpresa contaEmpresa = new ContaEmpresa(1011, "Guilherme", 0.0, 500.0);

        // UPCASTING
        Conta c1 = contaEmpresa;
        Conta c2 = new ContaEmpresa(1012, "Geremias", 0.0, 300.0);
        Conta c3 = new ContaPoupanca(1013, "Cleiton", 0.0, 0.01);

        // DOWNCASTING
        // ContaEmpresa ce1 = Conta;
        // ContaEmpresa ce2 = (ContaEmpresa) conta;

        if (c2 instanceof ContaEmpresa) {
            ContaEmpresa c4 = (ContaEmpresa) c2;
            System.out.println("Sou uma conta Poupança");
        }

        //////////////////////////////////////////////////////////////////////////////

        Calcular calcular = new Calcular();
        calcular.calcular(3.0);
        calcular.calcular(3.0, 5.0);
        calcular.calcular(3.0, 5.0, 7.0);

        ContaEmpresa ce = new ContaEmpresa(1110, "André", 1000.0, 500.0);
        ContaPoupanca cp = new ContaPoupanca(111, "Roberto", 1000.0, 0.01);

        System.out.println("Saldo CE: " + ce.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());

        ce.sacar(50.0);
        cp.sacar(50.0);

        System.out.println("==========================================================");
        System.out.println("Saldo CE: " + ce.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());
    }
}
