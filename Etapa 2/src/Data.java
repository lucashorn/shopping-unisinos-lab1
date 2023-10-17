public class Data
{
    private int dia;
    private int mes;
    private int ano;

    // Construtor da classe
    public Data(int dia, int mes, int ano){
       this.dia = dia;
       this.mes = mes;
       this.ano = ano;
       validarData();
    }
    
    // Validador de data
    private void validarData() {

        // Quantidade de dias por mês
        int[] diasPorMes = {31, verificaAnoBissexto() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Verifica se o mês e o dia são válidos ( mes - 1 pois o array começa em 0)
        if (mes < 1 || mes > 12 || dia < 1 || dia > diasPorMes[mes - 1]) {
            System.out.println("[NOK] Data informada está inválida. Alterando para 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    // Metodos getters
    public int getDia(){
        return this.dia;
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    //Metodos setters
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }

    // Metodos de verificacao
    public Boolean verificaAnoBissexto(){
        Boolean retorno = (this.ano % 4 == 0) && (this.ano % 100 != 0 || this.ano % 400 == 0);
        return retorno;
    }

    //Sobrescrita do toString
    public String toString(){
        String valor = "";
        valor = this.dia + "/" + this.mes + "/" + this.ano;
        return valor;
    }
}
