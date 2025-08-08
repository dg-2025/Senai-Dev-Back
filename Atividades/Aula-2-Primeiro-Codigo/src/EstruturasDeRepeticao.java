import java.util.Scanner;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
//      Repetir Mensagem**
//        Pergunte uma senha para o usuário, enquanto ele não acertar a senha `123` pergunte novamente.
        Scanner sc = new Scanner(System.in);
        System.out.println("informe sua senha");
        String senha = sc.nextLine();
        while(!senha.equals("123")) {
            System.out.println("Senha incorreta!");
            System.out.println("Informe uma senha: ");
            senha = sc.nextLine();


//      Repetição de Processo**
//
//      Escreva um programa que imprime a mensagem "Executando o processo..." e,
//      em seguida, pergunta ao usuário se ele deseja executar o processo novamente.
//      Se o usuário digitar 's' (ou 'S'), o processo se repete. Caso contrário, o programa é encerrado.
//      O do-while é ideal aqui, pois o processo sempre executa pelo menos uma vez.

            String opcao;
            do {
                System.out.println("Executando o processo...");
                System.out.println("Deseja executar novamente?");
                opcao = sc.nextLine();

            } while(opcao.equals("s") || opcao.equals("S"));

            System.out.println("Processo encerrado!");

//      Cálculo de Fatorial
//      Crie um programa que peça ao usuário um número inteiro não negativo e calcule seu fatorial.
//      O fatorial de um número n (representado por n!) é o produto de todos
//      os inteiros positivos menores ou iguais a n.
//      Por exemplo, 5! = 5 * 4 * 3 * 2 * 1 = 120. Use um laço for para realizar a multiplicação.
//      *Dica: Comece com uma variável de resultado igual a 1 e multiplique-a pelos números de `n` até 1.*

            System.out.println("Informe um numero!");
            int num = sc.nextInt();
            int resultado = 1;

            for (int i = num; i > 1; i--) {
                resultado *= i;
            }
            System.out.println(resultado);



        }
    }
}
