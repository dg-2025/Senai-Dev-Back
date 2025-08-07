import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Mostra uma mensagem na tela
        System.out.println("Olá!");

        // VARIÁVEIS
        // TIPO nome;
        // NUMEROS INTEIROS
        int idade = 37;
        long populacao = 80000000000L;

        // NUMEROS DECIMAIS
        double preco = 20.90;
        float altura = 1.76f;

        // TEXTOS
        String nome = "Sianga";
        char letra = 'A';

        // BOOLEANO - Valor que tem a informacao de SIM ou NAO
        boolean maiorDeIdade = true; // false

        // OPERADORES
        // = - Atribuicao

        // ARITMETICOS - Faz Conta
        int soma = 8 + 5;
        int subtracao = 10 - 3;
        int multiplicao = 2 * 5;
        int divisao = 10 / 2;
        int resto = 10 % 3;

        // OPERADORES COMPARACAO
        System.out.println(10 == 6); // igual
        System.out.println(10 != 6); // diferente
        System.out.println(10 > 6); // maior
        System.out.println(10 < 6); // menor
        System.out.println(10 >= 6); // maior ou igual


        int valor;

        valor = 10;

        int calculo = valor + 2;

        System.out.println(calculo);

        // CONCATENACAO
        System.out.println("Resultado: " + calculo);


        //Exercicios Aula2
        // **************** Fundamentais ****************

        // 1. Exibir uma Mensagem**
        //Escreva um programa que use o comando `System.out.println()` para exibir a frase "Olá, Mundo!"
        // no console.

        //2. Declarar e Usar uma Variável**
        //Crie um programa que declare uma variável inteira chamada numero com o valor 10.
        // Em seguida, imprima o valor dessa variável no console.

        //3. Fazer uma Soma**
        //Escreva um programa que declare duas variáveis inteiras, a = 5 e b = 3.
        // Calcule a soma das duas e imprima o resultado.

        // 4. Produto de dois números
        // Declare duas variáveis, num1 = 8 e num2 = 7.
        // Calcule o produto (multiplicação) entre elas e imprima o resultado.

        int num1 = 5;
        int num2 = 2;

        int produto = num1 * num2;
        System.out.println(produto);


        // *************** Intermediários *********************

        // 5. Saudação Personalizada
        // Crie um programa que declare uma variável String chamada nome com o valor "Ana".
        // Depois, exiba uma mensagem de boas-vindas, como "Olá, Ana!".

        String nome2 = "Ana";

        System.out.println("Olá, " + nome2);

        //6. Calcular o Dobro**
        //Declare uma variável inteira `valor`.
        // Em seguida, calcule o dobro desse número utilizando a variável e exiba o resultado.

        //7. Média de três números**
        //Escreva um programa que recebe três números e imprime a média aritmética deles.

        int numero1 = 5;
        int numero2 = 3;
        int numero3 = 2;

        double resultado = (numero1 + numero2 + numero3);

        resultado = resultado / 3;

        System.out.println(resultado);

        //ou
        //CASTING
        double resultado1 = (double) (numero1 + numero2 + numero3) / 3;

        System.out.println(resultado1);

        //8. Comparar Dois Números**
        //Escreva um programa que declare duas variáveis inteiras, x = 10 e y = 20.
        // O programa deve comparar se `x` é menor que `y` (`<`) e imprimir o resultado (`true` ou `false`) no console.

        // *********************** Avançados *************************

        //9. Verificação de Idade para Votar**
        //Peça ao usuário para digitar sua idade. O programa deve usar um operador de
        // comparação para verificar se a idade é maior ou igual a 16 e imprimir o resultado (`true` ou `false`).
        //- **Extra:** Adicione um comentário de uma linha (`//`) explicando o que a comparação faz.

        //10. Usando o Operador Lógico "E" (&&)**
        //Declare uma variável int temperatura = 28. Escreva uma expressão lógica que verifique se a
        //`temperatura` é maior que 25 **E** menor que 30. Imprima o resultado `true` ou `false` no console.

        //11. Usando o Operador Lógico "OU" (||)**
        //Declare uma variável booleana temCartao = true e uma variável double compra = 50.0.
        // O cliente ganha um desconto se temCartao for verdadeiro OU se o valor da compra for maior que 100.0.
        // Escreva a expressão lógica e imprima o resultado (`true` ou `false`).


        //Escrevo coisas
        //System.out.println();

        //Leio coisas - imputar informação no terminar...ler arquivos etc.
        Scanner scanner = new Scanner(System.in);


        //Perguntar o nome
        System.out.println("Digite seu nome:");
        String meuNome = scanner.nextLine();

        //Perguntar idade
        System.out.println("Digite sua idade:");
        int minhaIdade = scanner.nextInt();


        // Condicionais
        // Se a pessoa é maior de idade "pode  passar"
        // Senao "não pode passar"

        if (minhaIdade >= 18) {
            System.out.println("Pode passar");
        } else {
            System.out.println("Não pode passar");
        }

        if (minhaIdade > 60) {
            System.out.println("Você é idoso");
        } else if (minhaIdade > 16) {
            System.out.println("Você é Adulto");
        } else {
            System.out.println("Você é  Criança");
        }
    }
}
