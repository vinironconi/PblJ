public class Gerente extends Pessoa{
    private int assinaContrato;

    public Gerente(String nome, String profissao, int assinaContrato){
        super(nome, profissao);
        this.assinaContrato = assinaContrato;
    }
    public int getAssinaContrato(){
        return assinaContrato;
    }
}
