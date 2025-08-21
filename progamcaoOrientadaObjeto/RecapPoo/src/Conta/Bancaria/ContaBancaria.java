package Conta.Bancaria;

public class ContaBancaria implements OperacoesConta {
    private String numeroConta;
    private double saldo;

    @Override
    public void depositar(double valor){
        saldo += valor;
        consultarSaldo();
    }
    @Override
    public void sacar(double valor){
        if (saldo < valor){
            System.out.println("Saldo Insuficiente !!!");
        }
        else {
            saldo -= valor;
        }
    consultarSaldo();
    }
    @Override
    public double consultarSaldo(){

        System.out.println("Sua conta é: ");
        System.out.println(numeroConta);
        System.out.println("Seu saldo é: ");
        System.out.println(saldo);
        return saldo;
    }

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
