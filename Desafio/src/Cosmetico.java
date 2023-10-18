public class Cosmetico extends Loja
{
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int qntProdutos){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, qntProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public Cosmetico(){
        // intanceof
    }

    // Métodos de get
    public double getTaxaComercializacao() {
        return this.taxaComercializacao;
    }

    // Métodos de set
    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    //Sobrescrita do toString para subclasse
    public String toString(){
        String valor = super.toString();
        return valor + "\n Taxa de comercialização: " + this.taxaComercializacao;
    }

}
