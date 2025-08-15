package exLampada;

import java.util.Scanner;

public class testeLampada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Lampada lampadaSala = new Lampada(false);
        int opcao = 0;

        while(true){
            System.out.println("-----------------------------Interruptor-----------------------------");
            System.out.println("1 - Acender Lampada");
            System.out.println("2 - Apagar Lampada");
            System.out.println("3 - Verificar Lâmpada");
            System.out.println("---------------------------------------------------------------------");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    lampadaSala.acenderLampada();
                    break;
                case 2:
                    lampadaSala.apagarLampada();
                    break;
                case 3:
                    System.out.println(lampadaSala.isEstadoLampada());
            }

        }
        
    }

}
