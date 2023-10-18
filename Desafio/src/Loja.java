
public class Loja
{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;
    private int estoque;

    // Construtor da classe
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int qntProdutos){
       this.nome = nome;
       this.quantidadeFuncionarios = quantidadeFuncionarios;
       this.salarioBaseFuncionario = salarioBaseFuncionario;
       this.endereco = endereco;
       this.dataFundacao = dataFundacao;
       this.estoqueProdutos = new Produto[qntProdutos];
       this.estoque = 0;
    }

    public Loja(){
        // istanceof
    }
    
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int qntProdutos){
       this.nome = nome;
       this.quantidadeFuncionarios = quantidadeFuncionarios;
       this.salarioBaseFuncionario = -1;
       this.endereco = endereco;
       this.dataFundacao = dataFundacao;
       this.estoqueProdutos = new Produto[qntProdutos];
       this.estoque = 0;
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

    public Produto[] getEstoqueProdutos(){
        return this.estoqueProdutos;
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

    // Gerenciamento dos produtos
    public boolean insereProduto(Produto produto) {
        if (this.estoque < this.estoqueProdutos.length) {
            this.estoqueProdutos[this.estoque] = produto;
            this.estoque++;
            return true;
        }
        
        return false;
    }

    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < this.estoque; i++) {
            if (this.estoqueProdutos[i] != null && this.estoqueProdutos[i].getNome().equals(nomeProduto)) {
                
                // Realoca os espaços vazios
                for (int j = i; j < this.estoque - 1; j++) {
                    this.estoqueProdutos[j] = this.estoqueProdutos[j + 1];
                }

                this.estoqueProdutos[this.estoque - 1] = null;
                this.estoque--;
                return true;
            }
        }

        return false; 
    }

    public String imprimeProdutos() {
        String retorno = "";
        for (int i = 0; i < this.estoqueProdutos.length; i++) {
            if (this.estoqueProdutos[i] != null)
                retorno += this.estoqueProdutos[i].getNome() + ",";
        }

        return retorno;
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
        valor = "\n Nome: " + this.nome + "\n Qtd. Funcionarios: " + this.quantidadeFuncionarios + "\n Salario base: " + this.salarioBaseFuncionario + "\n Gasto com salarios: " + this.gastosComSalario() + "\n Tamanho da loja: " + this.tamanhoDaLoja() + this.endereco + "\n Data fundação: " + this.dataFundacao + "\n Produtos: " + this.imprimeProdutos();
        return valor;
    }
}
