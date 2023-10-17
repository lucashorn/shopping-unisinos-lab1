public class Produto{
    
    private String nome;
    private double preco;
    
    // Construtor da classe
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    // Metodos getters
    public String getNome(){
        return this.nome;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    //Metodos setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(int preco){
        this.preco = preco;
    }

    //Sobrescrita do toString
    public String toString(){
        String valor = "";
        valor = "Nome: " + this.nome + "\n Valor: " + this.preco;
        return valor;
    }
}