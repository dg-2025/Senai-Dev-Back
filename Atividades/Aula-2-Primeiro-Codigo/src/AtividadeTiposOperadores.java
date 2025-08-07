import java.util.Scanner;

public class AtividadeTiposOperadores {
    public static void main(String[] args) {
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
