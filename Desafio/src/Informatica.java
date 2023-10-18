public class Informatica extends Loja
{
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int qntProdutos){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, qntProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(){
        // intanceof
    }

    // Métodos de get
    public double getSeguroEletronicos() {
        return this.seguroEletronicos;
    }

    // Métodos de set
    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    //Sobrescrita do toString para subclasse
    public String toString(){
        String valor = super.toString();
        return valor + "\n Valor do seguro: " + this.seguroEletronicos;
    }

}
