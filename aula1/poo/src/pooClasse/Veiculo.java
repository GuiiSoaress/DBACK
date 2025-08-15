package pooClasse;

public class Veiculo {
    int passageiros;
    int capCombustivel;
    int kpl;

    int autonomia (){
        return capCombustivel * kpl;
    }

    double combNecessario(int kilometro){
        return (double)kilometro / kpl;
    }
}