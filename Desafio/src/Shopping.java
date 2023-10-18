import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    private int numeroLojas;

    // Construtor da classe
    public Shopping(String nome, Endereco endereco, int qtdLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[qtdLojas];
        this.numeroLojas = 0;
    }

    // Metodos getters
    public String getNome() {
        return this.nome;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public Loja[] getLojas() {
        return this.lojas;
    }

    //Metodos setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Gerenciamento das lojas
    public boolean insereLoja(Loja loja) {
        if (this.numeroLojas < this.lojas.length) {
            this.lojas[this.numeroLojas] = loja;
            this.numeroLojas++;
            return true;
        }
        
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < this.numeroLojas; i++) {
            if (this.lojas[i] != null && this.lojas[i].getNome().equals(nomeLoja)) {
                
                // Realoca os espaços vazios
                for (int j = i; j < this.numeroLojas - 1; j++) {
                    this.lojas[j] = this.lojas[j + 1];
                }
                
                this.lojas[this.numeroLojas - 1] = null;
                this.numeroLojas--;
                return true;
            }
        }

        return false; 
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        Object classeDinamica = null;
        int retorno = 0;
        switch (tipoLoja) {            
            case "Cosmético":
                classeDinamica = new Cosmetico();
                break;

            case "Vestuário":
                classeDinamica = new Vestuario();
                break;
                
            case "Bijuteria":
                classeDinamica = new Bijuteria();
                break;

            case "Alimentação":
                classeDinamica = new Alimentacao();
                break;

            case "Informática":
                classeDinamica = new Informatica();
                break;
            
            default:
                return -1;

        }

        for (int i = 0; i < this.lojas.length; i++) {
            if (classeDinamica.getClass().isInstance(this.lojas[i])) {
                retorno++;
            }
        }

        return retorno;
    }

    // public Informatica lojaSeguroMaisCaro () {
    //     Loja lojaMaisCara = null;
    //     double valorMaisAlto = 0;

    //     for (Loja loja : this.lojas) {
    //         if (loja instanceof Informatica informatica) {
    //             if (informatica.getSeguroEletronicos() > valorMaisAlto) {
    //                 System.out.println(informatica.getSeguroEletronicos());
    //                 System.out.println(valorMaisAlto);
    //                 valorMaisAlto = informatica.getSeguroEletronicos();
    //                 lojaMaisCara = loja;
    //             }
    //         }
    //     }

    //     return (Informatica) lojaMaisCara;
    // }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double maiorValorSeguro = 0.0;
    
        for (int i = 0; i < numeroLojas; i++) {
            if (lojas[i] instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) lojas[i];
                double valorSeguro = lojaInformatica.getSeguroEletronicos();
    
                if (valorSeguro > maiorValorSeguro) {
                    maiorValorSeguro = valorSeguro;
                    lojaMaisCara = lojaInformatica;
                }
            }
        }
    
        return lojaMaisCara;
    }

    //Sobrescrita do toString
    public String toString(){
        String valor = "";
        valor = "\n Nome: " + this.nome + this.endereco + "\n Lojas: " + Arrays.toString(lojas);
        return valor;
    }
}
