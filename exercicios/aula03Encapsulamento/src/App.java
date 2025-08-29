import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        boolean menu = true;
        char resposta;

        //instanciação da classe
        Voo voo = new Voo(123, "São Paulo", "Bahia", "Azul", "A");

        //Menu de teste da classe
        while (menu == true) {
            System.out.println("----------------------Aeroporto---------------------");
            System.out.println("1 - Numero do Voo ");
            System.out.println("2 - Origem");
            System.out.println("3 - Destino");
            System.out.println("4 - Companhia Aérea");
            System.out.println("5 - Portao de Embarque");
            System.out.println("6 - Sair");
            System.out.println("---------------------------------------------------------");
            int opcao = scan.nextInt();

            switch (opcao) {
                //Visualização e alteração do numero do voo
                case 1:
                    System.out.println("Numero do Voo: " + voo.getNumeroVoo());
                    System.out.println("Deseja alterar o numero do voo? [S/N]");
                    resposta = scan.next().charAt(0);
                    scan.nextLine(); //Limpar o buffer
                    if (resposta == 's') {
                        System.out.println("Digite o novo numero do voo: ");
                        int numeroVoo = scan.nextInt();
                        voo.setNumeroVoo(numeroVoo);
                        System.out.println("Numero do voo alterado com sucesso!");
                    } else {
                        break;
                    }
                    break;

                //Visualização e alteração da origem do voo
                case 2:
                    System.out.println("Origem do Voo: " + voo.getOrigemVoo());
                    System.out.println("Deseja alterar a origem do voo? [S/N]");
                    resposta = scan.next().charAt(0);
                    scan.nextLine(); //Limpar o buffer
                    if (resposta == 's' || resposta == 'S') {
                        System.out.println("Digite a nova origem do voo: ");
                        String origemVoo = scan.nextLine();
                        voo.setOrigemVoo(origemVoo);
                        System.out.println("Origem do voo alterada com sucesso!");
                    } else {
                        break;
                    }
                    break;

                //Visualização e alteração do destino do voo
                case 3:
                    System.out.println("Destino do Voo: " + voo.getDestinoVoo());
                    System.out.println("Deseja alterar o destino do voo? [S/N]");
                    resposta = scan.next().charAt(0);
                    scan.nextLine(); //Limpar o buffer
                    if (resposta == 's' || resposta == 'S') {
                        System.out.println("Digite o novo destino do voo: ");
                        String destinoVoo = scan.nextLine();
                        voo.setDestinoVoo(destinoVoo);
                        System.out.println("Destino do voo alterado com sucesso!");
                    } else {
                        break;
                    }
                    break;
                
                //Visualização e alteração da companhia aérea do voo
                case 4:
                    System.out.println("Companhia aérea do Voo: " + voo.getCompanhiaVoo());
                    System.out.println("Deseja alterar a companhia do voo? [S/N]");
                    resposta = scan.next().charAt(0);
                    scan.nextLine(); //Limpar o buffer
                    if (resposta == 's' || resposta == 'S') {
                        System.out.println("Digite a nova companhia do voo: ");
                        String companhiaVoo = scan.nextLine();
                        voo.setCompanhiaVoo(companhiaVoo);
                        System.out.println("Companhia do voo alterada com sucesso!");
                    } else {
                        break;
                    }
                    break;

                //Visualização do portão de embarque do voo
                case 5:
                    System.out.println("Portão de embarque do Voo: " + voo.getPortaoEmbarque());
                    System.out.println("Deseja alterar o portão de embarque do voo? [S/N]");
                    resposta = scan.next().charAt(0);
                    scan.nextLine(); //Limpar o buffer
                    if (resposta == 's' || resposta == 'S') {
                        System.out.println("Digite o novo portão de embarque do voo: ");
                        String portaoEmbarque = scan.nextLine();
                        voo.setPortaoEmbarque(portaoEmbarque);
                        System.out.println("Portão de embarque do voo alterado com sucesso!");
                    } else {
                        break;
                    }
                    break;
                //Sair do menu e fechar aplicação
                case 6:
                    menu = false;
                    break;
            }

            

        }

        scan.close();
    }
}
