package poo;

public class Pessoa {
    
    public int idade;
    public String nome;
    public boolean casado;

    public Pessoa(){};

    public Pessoa(int idade, String nome, boolean casado){
        this.idade = idade;
        this.nome = nome;
        this.casado = casado;
    }

    public Pessoa(int idade, String nome){
        this.idade = idade;
        this.nome = nome;
    }

}
