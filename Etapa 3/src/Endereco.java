public class Endereco{
    
    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;

    
    // Construtor da classe
    public Endereco(String nomeDaRua, String cidade, String estado, String pais ,String cep ,String numero, String complemento){
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    // Metodos getters
    public String getNomeDaRua(){
        return this.nomeDaRua;
    }
    
    public String getCidade(){
        return this.cidade;
    }
    
    public String getEstado(){
        return this.estado;
    }
    
    public String getPais(){
        return this.pais;
    }

    public String getCep(){
        return this.cep;
    }

    public String getNumero(){
        return this.numero;
    }

    public String getComplemento(){
        return this.complemento;
    }
    
    //Metodos setters
    public void setNomeDaRua(String nomeDaRua){
        this.nomeDaRua = nomeDaRua;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public void setPais(String pais){
        this.pais = pais;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

    //Sobrescrita do toString
    public String toString(){
        String valor = "";
        valor = "\n Rua: " + this.nomeDaRua + "\n Cidade: " + this.cidade + "\n Estado: " + this.estado + "\n Pais: " + this.pais + "\n CEP: " + this.cep + "\n Numero: " + this.numero + "\n Complemento: " + this.complemento;
        return valor;
    }
}