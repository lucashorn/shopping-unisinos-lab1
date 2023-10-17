public class Loja
{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    // Construtor da classe
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){
       this.nome = nome;
       this.quantidadeFuncionarios = quantidadeFuncionarios;
       this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public Loja(String nome, int quantidadeFuncionarios){
       this.nome = nome;
       this.quantidadeFuncionarios = quantidadeFuncionarios;
       this.salarioBaseFuncionario = -1;
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

    // Metodos de calculo
    public double gastosComSalario(){
        double valor = -1;

        if (this.salarioBaseFuncionario != -1) {
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
        valor = "Nome: " + this.nome + "\n Qtd. Funcionarios: " + this.quantidadeFuncionarios + "\n Salario base: " + this.salarioBaseFuncionario;
        return valor;
    }
}
