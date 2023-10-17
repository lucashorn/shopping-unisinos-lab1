public class Bijuteria extends Loja
{
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.metaVendas = metaVendas;
    }

    // Métodos de get
    public double getMetaVendas() {
        return this.metaVendas;
    }

    // Métodos de set
    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    //Sobrescrita do toString para subclasse
    public String toString(){
        String valor = super.toString();
        return valor + "\n Meta de vendas: " + this.metaVendas;
    }

}
