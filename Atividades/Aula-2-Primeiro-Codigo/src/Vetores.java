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
        Scanner sc = new Scanner(System.in);
        System.out.println("digite nomes");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = sc.nextLine();
        }
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }

    }
}


