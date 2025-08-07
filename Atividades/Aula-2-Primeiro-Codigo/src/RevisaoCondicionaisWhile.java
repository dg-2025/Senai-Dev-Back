import java.util.Scanner;

public class RevisaoCondicionaisWhile {
    public static void main(String[] args) {
//       Fundamentais
//
//       1. Senha simples
//       Peça ao usuário uma senha. Se for igual a "1234", exiba "Acesso concedido",
//       senão, "Acesso negado".
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        String senha = scanner.next();

        if (senha.equals("1234")) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }

//        2. Número dentro de intervalo
//        Pergunte um número e diga se ele está entre 10 e 20 (inclusive).
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 10 && numero <= 20) {
            System.out.println("O número " + numero + " está entre 10 e 20 (inclusive).");
        } else {
            System.out.println("O número " + numero + " não está no intervalo.");
        }

//      3. **Par ou Ímpar**
//      Peça ao usuário que digite um número inteiro e diga se ele é par ou ímpar.
//      Usa: `if` e operador `%`.

        System.out.print("Digite um número inteiro: ");

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

    }
}
