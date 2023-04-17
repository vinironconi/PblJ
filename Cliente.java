public class Cliente extends Pessoa{
    private int compras;

    public Cliente(String nome, String profissao, int compras){
        super(nome, profissao);
        this.compras = compras;
    }
    public int getCompras(){
        return compras;
    }
}
