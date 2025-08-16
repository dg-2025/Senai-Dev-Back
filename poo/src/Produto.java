public class Produto {

    private String nome;
    private double tamnaho;
    private double preco;
    private String cor;
    private int unidade;
    private String marca;

//        GET - PEGAR
    public String getNome()                   {
        return nome;
    }

//        SET - MUDAR, DEFINIR

    public void setNome(String nome){
        this.nome = nome;

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
