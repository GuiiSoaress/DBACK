package exContaCorrente;

import java.util.Scanner;

public class testeContaCorrente {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente(01,1000.00, 1000.00);

        //menu para teste da conta corrente
        while(true){
            System.out.println("----------------------Conta Corrente---------------------");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Saldo");
            System.out.println("4 - Cheque Especial");
            System.out.println("5 - Informações da Conta");
            System.out.println("---------------------------------------------------------");
            int opcao = scan.nextInt();

            switch (opcao){
                //sacar dinheiro
                case 1:
                    System.out.print("Digite o valor que gostaria de sacar: ");
                    double saque = scan.nextDouble();
                    conta.sacar(saque);

                    //limpa o buffer
                    scan.nextLine();
                    break;
                //depositar dinheiro
                case 2:
                    System.out.println("Digite o valor que deseja depositar:");
                    double deposito = scan.nextDouble();
                    conta.depositar(deposito);
                    //limpa o buffer
                    scan.nextLine();
                    break;
                //verificar o saldo
                case 3: 
                    System.out.println("Saldo da conta: " + conta.getSaldo());
                    break;
                //verificar o cheque especial
                case 4:
                    System.out.println("Você tem R$" + conta.getLimiteChequeEspecial() + " reais de limite de cheque especial!");
                    if(conta.isEstadoChequeEspecial() ==  true){
                        System.out.println("Você está usando o limite do cheque especial, faça um deposito para reativa-lo.");
                    }else{
                        System.out.println("Você não está usando o limite do cheque especial!");
                    }
                //verificar as informações da conta
                case 5:
                    conta.informacoesConta();
            }

        }

    }
}
