import java.util.Scanner;

public class Aluno {

    public String nome;
    public double nota;

    public void verificarStatus() {
        System.out.println("digite a nota do aluno");
        Scanner sc = new Scanner(System.in);
        double enNota = sc.nextDouble();
        if (nota > 10 && nota < 0) {
            System.out.println("digite uma nota valida !");
            //verificar em casa..................................................................
        }
    }
}
