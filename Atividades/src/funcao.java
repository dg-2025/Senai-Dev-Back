import java.util.Scanner;

public class funcao {
    public static void darBomDia() {
        System.out.println("bom dia");
    }

    public static void darBoaNoite() {
        System.out.println("boa noite");
    }

    public static void saudar(String nome) {
        System.out.println("Ola! " + nome );

    }

    public static void subtrair(int num1, int num2) {
        System.out.println(num1 - num2);

    }

    public static int somar (int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;

    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("oque vc deseja, bom dia( dia ) ou boa noite ( noite )");
//        String resposta = sc.nextLine();
//        if (!resposta.equals("dia") && !resposta.equals("noite")) {
//            System.out.println("selecione uma resposta valida");
//
//        } else if (resposta.equals("dia")) {
//            darBomDia();
//        } else if (resposta.equals("noite")) {
//            darBoaNoite();
//        }
        saudar("daniel");
        subtrair(4, 2);
    }
}
