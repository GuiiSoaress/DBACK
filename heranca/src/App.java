import heranca.Aluno;
import heranca.Pessoa;
import heranca.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("2268815452");
        Professor professor = new Professor("26485569852", 30);
        Aluno aluno = new Aluno("551855895","98545");

        pessoa.setNome("Guilherme");
        professor.setNome("André");
        aluno.setNome("Silva");

        System.out.println(pessoa.getNome());
        System.out.println(professor.getNome());
        System.out.println(aluno.getNome());
    }
}
