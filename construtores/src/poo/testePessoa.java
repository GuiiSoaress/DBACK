package poo;
public class testePessoa {
    
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa(2, "Guilherme", false);
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa(12, "james", false);
        
        System.out.println("Nome:" + pessoa1.nome);
        System.out.println("idade:" + pessoa1.idade);
        System.out.println("casado:" + pessoa1.casado);
        
        System.out.println("Nome:" + pessoa3.nome);
        System.out.println("idade:" + pessoa3.idade);
        System.out.println("casado:" + pessoa3.casado);
        
    }
}
