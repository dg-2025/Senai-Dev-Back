public class Main {
    public static void main(String[] args) {

//        Produto prod1 = new Produto();
//        prod1.nome = "monitor";
//        prod1.preco = 850.00;
//        prod1.marca = "dell";
//
//        prod1.mostrarInformacoes();
//
//        Produto prod2 = new Produto();
//
//        prod2.nome = "nootbok";
//        prod2.preco = 3000.00;
//        prod2.marca = "dell";
//
//        prod2.mostrarInformacoes();
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

    }
}
