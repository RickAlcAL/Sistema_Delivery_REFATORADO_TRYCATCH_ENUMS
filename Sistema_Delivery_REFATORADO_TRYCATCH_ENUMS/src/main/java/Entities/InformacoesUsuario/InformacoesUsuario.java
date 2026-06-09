package Entities.InformacoesUsuario;

import Entities.Produtos.Produtos;
import java.util.ArrayList;
import java.util.List;

public class InformacoesUsuario {
    private String nomeCliente;
    private String endereco;
    private List<Produtos> carrinho;

    // Construtor
    public InformacoesUsuario(String nomeCliente, String endereco) {
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.carrinho = new ArrayList<>();
    }

    // Método para adicionar um produto ao carrinho
    public void adicionarAoCarrinho(Produtos produto) {
        if (produto != null) {
            this.carrinho.add(produto);
            System.out.println(produto.getNomeProduto() + " adicionado ao carrinho!");
        }
    }

    // Método para calcular o valor total dos produtos no carrinho
    public double calcularTotal() {
        double total = 0.0;
        for (Produtos p : carrinho) {
            total += p.getPrecoProduto();
        }
        return total;
    }

    // Getters e Setters
    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Produtos> getCarrinho() {
        return carrinho;
    }
}