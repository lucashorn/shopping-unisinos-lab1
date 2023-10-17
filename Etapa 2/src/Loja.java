public class Loja
{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;

    // Construtor da classe
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao){
       this.nome = nome;
       this.quantidadeFuncionarios = quantidadeFuncionarios;
       this.salarioBaseFuncionario = salarioBaseFuncionario;
       this.endereco = endereco;
       this.dataFundacao = dataFundacao;
    }
    
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao){
       this.nome = nome;
       this.quantidadeFuncionarios = quantidadeFuncionarios;
       this.salarioBaseFuncionario = -1;
       this.endereco = endereco;
       this.dataFundacao = dataFundacao;
    }

    // Metodos getters
    public String getNome(){
        return this.nome;
    }
    
    public int getQuantidadeFuncionarios(){
        return this.quantidadeFuncionarios;
    }
    
    public double getSalarioBaseFuncionario(){
        return this.salarioBaseFuncionario;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }
    
    public Data getDataFundacao(){
        return this.dataFundacao;
    }

    //Metodos setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }

    // Metodos de calculo
    public double gastosComSalario(){
        double valor = -1;

        if (this.salarioBaseFuncionario != -1 && this.salarioBaseFuncionario > 0) {
            valor = this.salarioBaseFuncionario * this.quantidadeFuncionarios;
        }

        return valor;
    }

    public char tamanhoDaLoja(){
        char valor = 'P';
        int quantidadeFuncionarios = this.quantidadeFuncionarios;
        
        if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            valor = 'M';
        } else if (quantidadeFuncionarios >= 31) {
            valor = 'G';
        }

        return valor;
    }

    //Sobrescrita do toString
    public String toString(){
        String valor = "";
        valor = "\n Nome: " + this.nome + "\n Qtd. Funcionarios: " + this.quantidadeFuncionarios + "\n Salario base: " + this.salarioBaseFuncionario + "\n Gasto com salarios: " + this.gastosComSalario() + "\n Tamanho da loja: " + this.tamanhoDaLoja() + endereco + "\n Data fundação: " + dataFundacao;
        return valor;
    }
}
