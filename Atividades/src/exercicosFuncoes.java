import java.util.Scanner;

public class exercicosFuncoes {


    //            1. Exibir uma mensagem de boas-vindas

    public static void mostrarMensagem() {
        System.out.println("Bem-vindo(a) ao programa!");
    }

//------------------------------------------------------------------------------------------------

    //            2. Mostrar o dobro de um número

    public static void mostrarDobro(int num1) {

        System.out.println(num1 * 2);

    }

//------------------------------------------------------------------------------------------------

    //            3. Retornar a divisão de dois números inteiros

    public static int dividir(int num1, int num2) {
        int resultado = num1 / num2;
        return resultado;
    }

//------------------------------------------------------------------------------------------------

    //            4. Verificar se um número é par

    public static boolean ehPar(int num1) {

        int resultado = num1 % 2;
        boolean par = false;
        if (resultado == 0) {
            par = true;
        }
        return par;

    }

//------------------------------------------------------------------------------------------------

    //            5. Calcular média de três notas**

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        double resultado = (nota1 + nota2 + nota3) / 3;
        return resultado;
    }

//------------------------------------------------------------------------------------------------

    //            6. Mostrar uma linha decorativa

    public static void linha() {
        System.out.println("---------------------------------------------");

    }

//------------------------------------------------------------------------------------------------

    //        Extra 1 - Verificar se um número é múltiplo de 3

    public static boolean ehMultiploDeTres(int num1) {
        int resultado = num1 % 3;
        boolean multiploDeTres = false;
        if (resultado == 0) {
            multiploDeTres = true;
        }
        return multiploDeTres;

    }

//------------------------------------------------------------------------------------------------

    //          Extra 2 - Somar elementos de um arrayExtra

//    public static int somarArray(int[] num ){
//
//
//    }


//$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$##$#$#$#$#$#$#$#$##$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$
//$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$##$#$#$#$#$#$#$#$##$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$

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
        linha();

//========================================================================================================

        /*
        2. Mostrar o dobro de um número
        Crie uma função chamada mostrarDobro que receba um número inteiro como parâmetro
         e imprima o dobro desse número.
        Dicas:
        A função deve ter um parâmetro inteiro.
        A função não precisa retornar valor (só imprime).
        Exemplo de uso:
        mostrarDobro(5); // Saída: O dobro é 10
         */

        System.out.println("digite um numero");
        Scanner sc = new Scanner(System.in);
        mostrarDobro(sc.nextInt());
        linha();

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
        linha();

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
        System.out.println("o numero digitado e um par ? " + par);
        linha();

//========================================================================================================

        /*
        5. Calcular média de três notas**
        Crie uma função chamada `calcularMedia` que receba três notas (valores decimais)
         como parâmetros e retorne a média aritmética delas.
        **Dica:**
        - A função **deve retornar um valor decimal** (`double` ou `float`).
        **Exemplo de uso:**
         */

        System.out.println("digite 3 numero para calcular a media");
        double numer1 = sc.nextInt();
        double numer2 = sc.nextInt();
        double numer3 = sc.nextInt();
        System.out.println("sua media e : " + calcularMedia(numer1, numer2, numer3));


//========================================================================================================

        /*
        6. Mostrar uma linha decorativa
        Crie uma função chamada linha que imprima no console uma linha com 30 hífens
        (ou outro símbolo de sua escolha), como:
        -----------------------------
        Dica:
        A função não precisa receber parâmetros.
        A função não retorna nada.
        Exemplo de uso:
        linha(); // Saída: ------------------------------
         */
        linha();

//========================================================================================================

        /*
        Extra 1 - Verificar se um número é múltiplo de 3
        Crie a função ehMultiploDeTres que receba um número inteiro e retorne true se for múltiplo de 3,
         ou false caso contrário.
        Exemplo:
        boolean resultado = ehMultiploDeTres(9); // true
        boolean outro = ehMultiploDeTres(10);    // false
         */

        System.out.println("digite um numero e descubra se e multiplo de 3 : ");
        int number = sc.nextInt();
        boolean verdadeiro = ehMultiploDeTres(number);
        if ( verdadeiro == true) {
            System.out.println(" esse numero e multiplo de 3");

        } else {
            System.out.println("esse numero não e multiplo de 3");
        }
        linha();

//========================================================================================================

        /*
        Extra 2 - Somar elementos de um array
        Crie a função `somarArray` que receba um array de números inteiros e retorne a soma
         de todos os elementos.
        - Parâmetro: `int[]`
        - Retorno: inteiro

        Exemplo:
        int[] meuArray = {1， 2， 3， 4}；
        int soma = somarArray(meuArray); // 10
         */

    }


}
