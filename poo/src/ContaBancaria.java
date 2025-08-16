public class ContaBancaria {
    private double saldo;
    private String nome;

    public void depositar(double valor){
        saldo += valor;
        System.out.println("deposito realizado com sucesso");
    }
    public void sacar(double valor){

        if (saldo < valor) {
            System.out.println("saldo indisponivel");

        }else {
            System.out.println("saque efetuado -"+valor);
            saldo -= valor;
            System.out.println("saldo da conta:" + saldo);
        }
    }


    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }
    public  ContaBancaria(String nome, double saldo ){
        this.nome = nome;
        this.saldo = saldo;
    }
}
