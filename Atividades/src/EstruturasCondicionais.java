import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {
//        ### **Exercícios Fundamentais**
//
//        1. Verificador de Maioridade
//        Crie um programa que declare uma variável **`idade`**.
//        Use uma estrutura **`if/else`** para verificar se a idade é **maior ou igual a 18**.
//        O programa deve imprimir "*Você é maior de idade*" se a condição
//        for verdadeira, e "*Você é menor de idade*" caso contrário
        Scanner scanner = new Scanner(System.in);

        int idade = 20;

        if (idade > 18) {
            System.out.println("Maior de Idade");
        }
        else {
            System.out.println("Menor de Idade");
        }
//        2. Verificador de Número (Positivo, Negativo ou Zero)
//        Crie um programa que declare uma variável **`numero`**;
//        Utilize uma estrutura **`if/else if/else`** para verificar e imprimir
//        uma das seguintes mensagens: "*O número é positivo.*", "*O número
//        é negativo.*" ou "*O número é zero.*".
        int numero = 5;

        if (numero > 0) {
            System.out.println("O numero é positivo");
        }
        else if(numero < 0) {
            System.out.println("O numero é negativo");
        }
        else {
            System.out.println("O numero é zero");
        }
//        3. Classificação de Aluno**
//        Crie um programa que use a classe **`Scanner`** para pedir ao usuário
//        que digite a nota de um aluno (um valor **`double`**).
//        Em seguida, use uma estrutura **`if/else`** simples para
//        imprimir "Aprovado" se a nota for maior ou igual a 7.0, e "Reprovado" caso contrário
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();
        if (nota >= 7.0) {
            System.out.println("Resultado: Aprovado");
        } else {
            System.out.println("Resultado: Reprovado");
        }

    }
}
