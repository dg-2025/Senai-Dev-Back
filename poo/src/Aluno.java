import java.util.Scanner;

public class Aluno {

    public double nota;
    public Aluno (double nota){
        this.nota = nota;

    }
    public void verificarStatus(double nota) {

        if (nota < 7) {
            System.out.println("reprovado");
        } else {
            System.out.println("aprovado");
        }
    }
}
