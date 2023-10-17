public class Vestuario extends Loja
{
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }

    // Métodos de get
    public boolean getProdutosImportados() {
        return this.produtosImportados;
    }

    // Métodos de set
    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    //Sobrescrita do toString para subclasse
    public String toString(){
        String valor = super.toString();
        return valor + "\n Produtos importados: " + (this.produtosImportados ? "Sim" : "Não");
    }

}
