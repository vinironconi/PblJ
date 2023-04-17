import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Cliente("Marcos", "Cliente", 0));
        pessoas.add(new Cliente("Jeferson", "Cliente", 8));
        pessoas.add(new Gerente("Marine", "Gerente", 0));
        pessoas.add(new Gerente("Lucas", "Gerente", 10));
        pessoas.add(new Funcionario("Glauber", "Funcionario", 3));
        pessoas.add(new Funcionario("Larissa", "Funcionario", 5));

        for(Pessoa pessoa: pessoas){
            if(pessoa instanceof Cliente){
                System.out.println(pessoa.getNome());
                System.out.println(pessoa.getProfissao());
            }
            else if (pessoa instanceof Gerente){
                System.out.println(pessoa.getNome());
                System.out.println(pessoa.getProfissao());
            }
            else{
                System.out.println(pessoa.getNome());
                System.out.println(pessoa.getProfissao());
            }

        }

    }
}
