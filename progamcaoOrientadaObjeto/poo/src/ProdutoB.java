
public class ProdutoB {
    private String produto;
    private double preco;
    private int estoque;


    public void adcEstoque(int quantidade){
        estoque +=  quantidade;
        System.out.println("itens adicionado com sucesso");
    }

    public void remEstoque(int quantidade){
        if (estoque < quantidade){
            System.out.println("saldo indisponivel");
        } else {
            System.out.println("saque efetuado -"+quantidade);
        }

    }

    public ProdutoB(String produto, double preco, int estoque) {
        this.produto = produto;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0 ){
            System.out.println("digite um valor valido !!");
        } else {
            this.preco = preco;
        }
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
