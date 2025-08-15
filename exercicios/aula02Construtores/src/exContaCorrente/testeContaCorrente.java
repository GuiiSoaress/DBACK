package exContaCorrente;

import java.util.Scanner;

public class testeContaCorrente {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente(01,1000.00, 1000.00);

        while(true){
            System.out.println("----------------------Conta Corrente---------------------");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Saldo");
            System.out.println("4 - Cheque Especial");
            System.out.println("5 - Informações da Conta");
            int opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    break;
                case 2:
                    break;

                case 3: 
                    break;
            }

        }
    }
}
