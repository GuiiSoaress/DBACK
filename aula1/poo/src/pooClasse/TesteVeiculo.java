package pooClasse;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo minivan = new Veiculo();
        Veiculo carroEsportivo = new Veiculo();
        
        double litros;
        int dist = 300;

        minivan.passageiros = 7;
        minivan.capCombustivel = 40;
        minivan.kpl = 15;

        carroEsportivo.passageiros = 2;
        carroEsportivo.capCombustivel = 30;
        carroEsportivo.kpl = 10;
        
        litros = minivan.combNecessario(dist);
        System.out.println("Para percorrer a distancia com a minivan" + dist + " são necessários " + litros + " litros.");
        
        litros = carroEsportivo.combNecessario(dist);
        System.out.println("Para percorrer a distancia com o carro esportivo" + dist + " são necessários " + litros + " litros.");
    }
}   
