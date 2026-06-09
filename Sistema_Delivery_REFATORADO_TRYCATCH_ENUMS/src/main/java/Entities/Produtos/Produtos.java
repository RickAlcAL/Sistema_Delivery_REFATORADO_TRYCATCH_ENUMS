package Entities.Produtos;

public class Produtos {
    //Adicionando atributos
    private String nomeProduto;
    private Double precoProduto;
    //Construtor
    public Produtos (String nomeProduto, Double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }
}
