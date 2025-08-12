import java.util.Scanner;

public class exercicosVetores {
    public static void mostrarMensagem() {
        System.out.println("Bem-vindo(a) ao programa!");
    }

    public static void mostrarDobro(int num1) {

        System.out.println(num1 * 2);

    }

    public static int dividir(int num1, int num2) {
        int resultado = num1 / num2;
        return resultado;
    }

    public static boolean ehPar(int num1){

        int resultado = num1 % 2;
        boolean par = false;
        if (resultado == 0){
            par = true;
        }
        return par;

    }

//========================================================================================================

//========================================================================================================

//========================================================================================================

    public static void main(String[] args) {
        /*
            1. Exibir uma mensagem de boas-vindas
            Crie uma função chamada mostrarMensagem que imprima no console a seguinte frase:
            "Bem-vindo(a) ao programa!"
            Dicas:
            A função não deve ter parâmetros.
            A função não precisa retornar nenhum valor (tipo void).
            Exemplo esperado ao chamar a função:
            mostrarMensagem(); // Saída: Bem-vindo(a) ao programa!
         */


        mostrarMensagem();

//========================================================================================================
        /*
            2. Mostrar o dobro de um número
        Crie uma função chamada mostrarDobro que receba um número inteiro como parâmetro e imprima o dobro desse número.
        Dicas:
        A função deve ter um parâmetro inteiro.
        A função não precisa retornar valor (só imprime).
        Exemplo de uso:
        mostrarDobro(5); // Saída: O dobro é 10

         */


        System.out.println("digite um numero");
        Scanner sc = new Scanner(System.in);
        mostrarDobro(sc.nextInt());

//========================================================================================================
        /*
            3. Retornar a divisão de dois números inteiros
        Objetivo: Praticar parâmetros + retorno.
        Descrição:
        Crie uma função chamada dividir que receba dois números inteiros e retorne a divisão entre eles.
        Dicas:
        A função deve ter dois parâmetros inteiros.
        A função deve retornar um número.
        Exemplo de uso:
        int resultado = somar(4, 7); // resultado = 11
         */

        System.out.println("digite 2 numeros");

        int resultado = dividir(sc.nextInt(), sc.nextInt());
        System.out.println("o resultado e: " + resultado);

//========================================================================================================
        /*
        4. Verificar se um número é par
    Crie uma função chamada ehPar que receba um número inteiro
     e retorne true se o número for par e false se for ímpar.
    Dica:
    A função deve retornar um valor booleano.
    Exemplo de uso:
    boolean resultado = ehPar(8); // true
         */

        System.out.println("digite um numero");
        int num1 = sc.nextInt();
        boolean par = ehPar(num1);
        System.out.println("o numero digitado e um par ? " + par );



//========================================================================================================
    }
}
