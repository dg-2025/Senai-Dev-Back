public class Produto {

    public String nome;
    public double tamnaho;
    private double preco;
    public String cor;
    public int unidade;
    public String marca;

//        GET - PEGAR
    public String getNome()                   {
        return nome;
    }

    public void setNome(String nome){


    }

    public Produto (String nome, double preco,
                   String marca, double tamnaho)
    {   this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.tamnaho =  tamnaho;


    }

    public void mostrarInformacoes(){
        System.out.println("nome: " + nome);
        System.out.println("preco: " + preco);
        System.out.println("marca: " + marca);

    }

}
