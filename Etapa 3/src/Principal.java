public class Principal {
    public static void main(String[] args) throws Exception {
        int opcao;
        do {            
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            opcao = Teclado.leInt("Escolha uma opção: ");

            switch (opcao) {
                // Criar loja
                case 1:
                    Loja novaLoja = criarLoja();
                    limparTela();
                    System.out.println(novaLoja);

                    // Trava o usuario para conseguir ver as informacoes da loja criada
                    Teclado.leString("\n\u001B[31m APERTE QUALQUER TECLA PARA VOLTAR ÀS OPÇÕES\u001B[0m");
                    limparTela();
                    break;
                
                // Criar produto
                case 2:

                    Produto novoProduto = criarProduto();
                    limparTela();
                    System.out.println(novoProduto);

                    // Produto esta ou nao vencido
                    String msgVencido = " PRODUTO " + (novoProduto.estaVencido(new Data(20, 10, 2023)) ? "" : "NÃO ") + "VENCIDO";
                    System.out.println(msgVencido);

                    // Trava o usuario para conseguir ver as informacoes da loja criada
                    Teclado.leString("\n \u001B[31mAPERTE QUALQUER TECLA PARA VOLTAR ÀS OPÇÕES\u001B[0m");
                    limparTela();
                    break;

                case 3:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    limparTela();
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 3);
        // Encerra o sistema

    }

    private static Produto criarProduto(){
        limparTela();
        System.out.println("-- CRIAR PRODUTO --");
        String nome = Teclado.leString("Digite o nome do produto: ");
        double preco = Teclado.leDouble("Digite o preço do produto: ");
        Data validade = coletarData("-- Informações sobre a data de validade --");

        return new Produto(nome, preco, validade);
    }

    private static Loja criarLoja(){
        Loja novaLoja;
        limparTela();
        System.out.println("-- CRIAR LOJA --");
        String nome = Teclado.leString("Digite o nome da loja: ");
        int quantidadeFuncionarios = Teclado.leInt("Digite a quantidade de funcionários: ");
        double salarioBaseFuncionario = Teclado.leDouble("Digite o salario base dos funcionários (opicional): ");

        limparTela();

        Endereco endereco = coletarEndereco("-- Informações sobre o endereco --");        
        Data data = coletarData("-- Informações sobre a data de fundação --");

        if (salarioBaseFuncionario == 0.0) {
             novaLoja = new Loja(nome, quantidadeFuncionarios, endereco, data);
        } else {
             novaLoja = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data);
        }
        
        return novaLoja;
    }

    public static Endereco coletarEndereco(String msg){
        System.out.println(msg);
        String nomeRua = Teclado.leString("Digite o nome da rua: ");
        String cidade = Teclado.leString("Digite a cidade: ");
        String estado = Teclado.leString("Digite o estado: ");
        String pais = Teclado.leString("Digite o pais: ");
        String cep = Teclado.leString("Digite o cep: ");
        String numero = Teclado.leString("Digite o número: ");
        String complemento = Teclado.leString("Digite o complemento: ");
        return new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);
    }

    public static Data coletarData(String msg){
        limparTela();
        System.out.println(msg);
        int dia = Teclado.leInt("Digite o dia: ");
        int mes = Teclado.leInt("Digite a mês: ");
        int ano = Teclado.leInt("Digite o ano: ");
        return new Data(dia, mes, ano);
    }

    public static void limparTela(){  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
