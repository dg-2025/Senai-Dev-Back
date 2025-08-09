import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
//        int[] idades = new int[5];;
        String[] nomes = new String[10];

//        idades[0] = 12;
//        idades[1] = 22;
//        idades[2] = 32;
//        idades[3] = 42;
//        idades[4] = 52;
//        for (int i = 0; i < idades.length; i++) {
//            System.out.println(idades[i]);
//
//        nomes[0] = "reinaldo";
//        nomes[1] = "daniel";
//        nomes[2] = "gabriel";
//        nomes[3] = "guilherme";
//        nomes[4] = "luan";
//        nomes[5] = "jose";
//        nomes[6] = "cleiton";
//        nomes[7] = "mauro";
//        nomes[8] = "rosa";
//        nomes[9] = "nicoly";
//
//            for (int j = 0; j < nomes.length; j++) {
//                System.out.println(nomes[j]);

//===============================================================================================================

//        1. Crie e imprima um vetor
//        Crie um vetor de 5 posições do tipo `int`, preencha com valores fixos
//        (por exemplo, 10, 20, 30, 40, 50) e imprima todos os valores usando um laço `for`.

//        int[] numeros = new int[5];
//        numeros[0] = 10;
//        numeros[1] = 20;
//        numeros[2] = 30;
//        numeros[3] = 40;
//        numeros[4] = 50;
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);

//===============================================================================================================

        //     2. Preencher e listar 10 elementos
//       Crie um vetor de 10 posições do tipo `int`. Solicite ao usuário que informe os 10 valores e,
//       ao final, **exiba todos os números digitados** usando um laço `for`.

        Scanner sc = new Scanner(System.in);
//        System.out.println("digite nomes");
//        for (int i = 0; i < nomes.length; i++) {
//            nomes[i] = sc.nextLine();
//        }
//        for (int i = 0; i < nomes.length; i++) {
//            System.out.println(nomes[i]);
//
//        }

//===============================================================================================================

//      3. Soma dos elementos do vetor
//      Crie um vetor de 4 posições com valores definidos pelo usuário
//      e calcule a **soma de todos os elementos**.

//        int[] valor = new int[4];
//        System.out.println("digite 4 numeros");
//        for (int i = 0; i < valor.length; i++) {
//            valor[i] = sc.nextInt();
//
//        }
//        int resultado = 0 ;
//        for (int i = 0; i < valor.length; i++) {
//            resultado = resultado + valor[i];
//
//        }
//        System.out.println("a soma dos resultados e: " + resultado);

//===============================================================================================================

//      4. Encontre o maior valor
//      Preencha um vetor com 6 números inteiros definidos pelo usuário.
//      Em seguida, mostre **qual é o maior valor** presente no vetor.

//        int[] numeros = new int[6];
//        System.out.println("digite 6 numeros");
//        int maior = 0;
//        for (int i = 0; i < numeros.length; i++) {
//            numeros[i] = sc.nextInt();
//            if (i == 0 ){
//                maior = numeros[i];
//
//            }
//            if (numeros[i] > maior){
//                maior = numeros[i];
//            }
//        }
//        System.out.println("o maior numero e:" + maior);

//===============================================================================================================

//      5. Contar números pares em um vetor
//
//      Crie um vetor com 10 números inteiros (digitados pelo usuário).
//      Conte e mostre **quantos desses números são pares**.

//        int[] numeros = new int[10];
//        System.out.println("digite 10 numeros");
//        int par = 0;
//        for (int i = 0; i < numeros.length; i++) {
//            numeros[i] = sc.nextInt();
//            if (numeros[i] % 2 == 0 ){
//                par++;
//
//            }
//        }
//        System.out.println("numeros par: " + par);

//===============================================================================================================

//      6. Buscar um valor no vetor
//      Preencha um vetor com 8 números e permita que o usuário digite um valor.
//      Informe se esse valor está presente no vetor ou não.

        int[]  numero = new int[8];
        numero[0] = 10;
        numero[1] = 20;
        numero[2] = 30;
        numero[3] = 40;
        numero[4] = 50;
        numero[5] = 60;
        numero[6] = 70;
        numero[7] = 80;
        boolean ehVerdadeiro = false;
        System.out.println("digite um numero que esta no vetor: ");
        int valor = sc.nextInt();
        for (int i = 0; i < numero.length; i++) {
            if (valor == numero[i]){
                ehVerdadeiro = true;

            }

        }
        if (ehVerdadeiro == true){
            System.out.println("o valor esta presente");
        }
        else {
            System.out.println("este numero não esta no vetor, tente novamente");
        }
    }

}