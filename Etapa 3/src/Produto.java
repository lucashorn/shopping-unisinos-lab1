public class Produto{
    
    private String nome;
    private double preco;
    private Data dataValidade;
    
    // Construtor da classe
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    // Metodos getters
    public String getNome(){
        return this.nome;
    }
    
    public double getPreco(){
        return this.preco;
    }

    public Data getDataValidade(){
        return this.dataValidade;
    }
    
    //Metodos setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(int preco){
        this.preco = preco;
    }

    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }

    // Metodo de verificacao
    public boolean estaVencido(Data dataAtual){
        return dataAtual.getAno() > this.dataValidade.getAno() ||
              (dataAtual.getAno() == this.dataValidade.getAno() && dataAtual.getMes() > this.dataValidade.getMes()) ||
              (dataAtual.getAno() == this.dataValidade.getAno() && dataAtual.getMes() == this.dataValidade.getMes() && dataAtual.getDia() > this.dataValidade.getDia());
    }

    //Sobrescrita do toString
    public String toString(){
        String valor = "";
        valor = "\n Nome: " + this.nome + "\n Valor: " + this.preco  + "\n Data valdiade: " + this.dataValidade;
        return valor;
    }
}