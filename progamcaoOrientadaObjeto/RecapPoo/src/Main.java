import Conta.Bancaria.ContaBancaria;
import Conta.Bancaria.OperacoesConta;
import Produto.Exibivel;
import Produto.Produto;
import formas.Circulo;
import formas.FormasGometricas;
import formas.Quadrado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Circulo, Quadrado - calcularArea()
        //  Criar INTERFACES
        FormasGometricas forma = new Circulo(6);
//        FormasGometricas[] formas = new FormasGometricas[10];
        forma.CalcularArea();
//====================================================================================================
        /*
            1. Produto
            - Interface `Exibivel`
            - Método: `void exibirDetalhes();`
            - Classe `Produto`
            - Atributos: `String nome`, `double preco`
            - Implementa `Exibivel`
            - Construtor: recebe `nome` e `preco`
            - Método `exibirDetalhes()` → imprime nome e preço do produto

            Extra: adicione um atributo `categoria` ao produto e mostre-o no `exibirDetalhes()`

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o nome do produto:");
        String nomeProduto = sc.nextLine();
        System.out.println("digite o preco do produto:");
        double precoProduto = sc.nextDouble();
        Exibivel nome = new Produto(nomeProduto,precoProduto);
        nome.exibirDetalhes();
//====================================================================================================

        /*
            2. Conta Bancária

            - Interface `OperacoesConta`
            - Métodos:
            - `void depositar(double valor)`
            - `void sacar(double valor)`
            - `double consultarSaldo()`
            - **Classe `ContaBancaria`**
            - Atributos: `String numeroConta`, `double saldo` (privado)
            - Implementa `OperacoesConta`
            - Construtor: recebe número da conta e saldo inicial
            - Métodos implementados (com validações, ex.: impedir saque maior que o saldo)

            Extra: crie um método `transferir(ContaBancaria destino, double valor)`
            que permita transferências entre contas.

         */
        sc.nextLine();
        System.out.println("Digite o numero da sua conta :");
        String numeroConta = sc.nextLine();
        OperacoesConta conta = new ContaBancaria(numeroConta, 0 );
        System.out.println("Digite o valor a depositar na sua conta :");
        double valor = sc.nextInt();

        System.out.println("oque voce deseja fazer ?");
        System.out.println("sacar [1]");
        System.out.println("depositar [2]");
        System.out.println("consultar saldo [3]");
        int opcoes = sc.nextInt();
        if (opcoes == 1 ){
            conta.sacar(valor);
        } else if ( opcoes == 2) {
            conta.depositar(valor);
        } else if (opcoes == 3) {
            conta.consultarSaldo();
        }
        else {
            System.out.println("digite um opcao valida !!");
        }

//====================================================================================================

        /*
            3. Tarefa**

            - Interface `Concluivel`**
            - Métodos:
            - `void concluir()`
            - `boolean estaConcluida()`
            - Classe `Tarefa`**
            - Atributos: `String descricao`, `boolean concluida`
            - Implementa `Concluivel`
            - Construtor: recebe a descrição
            - Método `exibirStatus()` → imprime descrição + status (concluída ou pendente)

            Extra:** adicione `int prioridade` (1–5) e mostre junto do status.



         */

//====================================================================================================

        /*
            4. Catálogo de Biblioteca**

            - **Classe base `ItemBiblioteca`**
            - Atributos: `String titulo`, `int anoPublicacao`
            - Método `exibirInfo()`
            - **Classe `Livro`** (herda de `ItemBiblioteca`)
            - Atributos: `String autor`
            - Sobrescreve `exibirInfo()` → inclui autor
            - **Classe `Revista`** (herda de `ItemBiblioteca`)
            - Atributos: `int edicao`
            - Sobrescreve `exibirInfo()` → inclui edição

            Extra:** crie uma lista ou vetor (`ArrayList<ItemBiblioteca>`)
            e percorra exibindo todos os itens, usando polimorfismo.



         */


//====================================================================================================

        /*
            5. Loja Online**

            - **Interface `Vendavel`**
            - Método: `double calcularPrecoFinal();`
            - **Classe `ProdutoFisico`**
            - Atributos: `double preco`, `double frete`
            - Implementa `Vendavel` → preço final = preço + frete
            - **Classe `ProdutoDigital`**
            - Atributos: `double preco`, `int tamanhoArquivoMB`
            - Implementa `Vendavel` → preço final = preço (com possível desconto para arquivos grandes)

            Extra:** crie uma lista ou vetor de produtos (`List<Vendavel>`)
             e calcule o valor total do carrinho.



         */

//====================================================================================================

        /*
            6. Gestão de Colaboradores**

            - **Classe base `Funcionario`**
            - Atributos: `String nome`, `double salarioBase` (protected)
            - Método: `double calcularPagamento()` (padrão retorna `salarioBase`)
            - **Classe `FuncionarioCLT`**
            - Sem atributos extras
            - Usa salário fixo do `Funcionario`
            - **Classe `FuncionarioFreelancer`**
            - Atributos: `double valorHora`, `int horasTrabalhadas`
            - Sobrescreve `calcularPagamento()` → valorHora * horasTrabalhadas

        Extra:** crie um método em `Funcionario` chamado `exibirDados()` e sobrescreva nas subclasses.



         */

//====================================================================================================

        /*
        ### **7. Sistema de Notificações**

            - **Interface `Notificacao`**
            - Método: `void enviar(String mensagem);`
            - **Classes que implementam:**
            - `NotificacaoEmail`
            - `NotificacaoSMS`
            - `NotificacaoPush`

            Cada uma imprime de forma diferente a mensagem enviada.

            Extra:** crie uma lista ou vetor de `Notificacao` e envie a mesma mensagem para todos os canais.
         */

//====================================================================================================

        /*
            8. Cursos

            - **Classe base `Curso`**
            - Atributos: `String nome`, `int duracaoHoras`
            - Construtor: inicializa os atributos
            - Método: `exibirDetalhes()`
            - **Classe `CursoOnline`**
            - Atributos: `String linkAcesso`
            - Sobrescreve `exibirDetalhes()` → inclui link
            - **Classe `CursoPresencial`**
            - Atributos: `String endereco`
            - Sobrescreve `exibirDetalhes()` → inclui endereço

            Extra:** crie uma lista ou vetor de cursos (`ArrayList<Curso>`)
             e percorra exibindo todos os detalhes.
         */

//====================================================================================================
    }
}
