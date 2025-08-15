import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Produto prod1 = new Produto("Monitor", 800, "Dell", 80);

        prod1.mostrarInformacoes();

        Produto prod2 = new Produto("Notebook", 2500, "Dell", 40);

        prod2.mostrarInformacoes();

//

//=============================================================================================================
            /*
            1. Criando a Classe `Musica` (Apenas Atributos)**
            Crie uma classe chamada `Musica`. Ela deve ter os atributos necessários para armazenar o título,
             o artista e a duração em segundos da música.
            Dicas:
            - A classe deve se chamar `Musica`.
            - Crie os atributos: `titulo` (String), `artista` (String) e `duracaoEmSegundos` (int).
            - Nesta atividade, não é necessário criar nenhum método.
             O objetivo é focar apenas na definição da classe e seus atributos.
             */

        Musica minhaMusica = new Musica();

        minhaMusica.artista = "Bohemian Rhapsody";
        minhaMusica.titulo = "Queen";
        minhaMusica.duracaoEmSegundos = 325;

        System.out.println("Tocando agora: " + minhaMusica.titulo);
        System.out.println("Artista: " + minhaMusica.artista);


//=============================================================================================================
             /*
             2. Criando a Classe `Carro` com um Método Simples
            Crie uma classe `Carro` com atributos para marca, modelo e ano. Agora sim,
             inclua um método simples que exiba todas essas informações de forma organizada.
            Dicas:
            - Nome da classe: `Carro`.
            - Atributos: `marca` (String), `modelo` (String), `ano` (int).
            - Método:** Crie um método chamado `exibirInformacoes()` que não retorna nada (void)
            e apenas imprime os dados do carro.
            */
        Carro car1 = new Carro();

        car1.modelo = "argo";
        car1.marca = "fiat";

        car1.mostrarInformacoes();

        Carro car2 = new Carro();

        car2.modelo = "argo";
        car2.marca = "fiat";

        car2.mostrarInformacoes();


//=============================================================================================================
            /*
            3. Criando a Classe `Aluno` com Lógica Simples**
            Crie uma classe `Aluno` que tenha como atributos o nome e a nota do aluno.
             Crie um método que verifique e exiba uma mensagem se o aluno foi aprovado ou reprovado,
            considerando a média 7.
            Dicas:
            - Nome da classe: `Aluno`.
            - Atributos: `nome` (String), `nota` (double).
            - **Método:** Crie um método `verificarStatus()` (void) que use uma estrutura `if/else`
            para checar o valor da `nota`.
            */

         Scanner sc = new Scanner(System.in);
         System.out.println("digite uma nota");
         double nota = sc.nextDouble();
         Aluno status = new Aluno(nota);
         status.verificarStatus(nota);


//=============================================================================================================
            /*
            4. Gerenciando uma `ContaBancaria`**
            Crie uma classe `ContaBancaria` com atributos para o nome do titular e o saldo. Implemente métodos
            para depositar e sacar valores, garantindo que não seja possível sacar um valor maior
            que o saldo disponível.
            Dicas:
            - Nome da classe: `ContaBancaria`.
            - Atributos: `titular` (String), `saldo` (double).
            - Método `depositar(double valor)`: deve receber um valor e somá-lo ao saldo.
            - Método `sacar(double valor)`: deve verificar se `valor` é menor ou igual ao `saldo`.
              Se for, subtraia o valor do saldo. Se não, exiba uma mensagem "Saldo insuficiente".
             */


//=============================================================================================================
            /*
            5. Controlando o Estoque de um `Produto`**
            Usando como base o exemplo do texto, crie a classe `Produto`. Ela deve ter atributos para nome,
            preço e quantidade em estoque.
            Implemente métodos para adicionar itens ao estoque e para registrar uma venda.
            O método de venda deve diminuir o estoque e verificar se há quantidade suficiente para a transação.
            Dicas:
            - Nome da classe: `Produto`.
            - Atributos: `nome` (String), `preco` (double), `estoque` (int).
            - Método `adicionarEstoque(int quantidade)`: aumenta o valor do atributo `estoque`.
            - Método `realizarVenda(int quantidade)`: verifica se há `estoque` suficiente.
              Se sim, diminui o estoque e informa que a venda foi realizada.
              Se não, informa que o produto está fora de estoque.
             */

//=============================================================================================================
            /*
            6. Criando um `PersonagemJogo`**

            Crie uma classe `PersonagemJogo` que represente um personagem em um jogo de RPG.
            A classe deve ter atributos para nome, nível e pontos de vida (PV).
            Crie métodos para que o personagem possa receber dano e subir de nível.
            Dicas:
            - Nome da classe: `PersonagemJogo`.
            - Atributos: `nome` (String), `nivel` (int), `pontosDeVida` (int).
            - Método `receberDano(int dano)`: subtrai o valor do `dano` dos `pontosDeVida`.
            - Método `subirDeNivel()`: incrementa o `nivel` do personagem em 1.
            - Inclua um método `exibirStatus()` para mostrar o estado atual do personagem (nome, nível e PV).
             */

//=============================================================================================================
    }
}
