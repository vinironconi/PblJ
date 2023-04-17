public class Funcionario extends Pessoa{
    private int vendas;

    public Funcionario(String nome, String profissao, int vendas){
        super(nome, profissao);
        this.vendas = vendas;
    }
    public int getAssinaContrato(){
        return vendas;
    }
}
