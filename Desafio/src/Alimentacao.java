public class Alimentacao extends Loja
{
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int qntProdutos){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, qntProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(){
        //istanceof
    }

    // Métodos de get
    public Data getDataAlvara() {
        return this.dataAlvara;
    }

    // Métodos de set
    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    //Sobrescrita do toString para subclasse
    public String toString(){
        String valor = super.toString();
        return valor + "\n Data do alvara: " + this.dataAlvara;
    }

}
