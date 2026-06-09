package Entities.Cardapio;

import Entities.Produtos.Produtos;

public class Cardapio {
    private Produtos [] cardapioProdutos = {
            //Cadastro de produtos em vetores
            new Produtos("Hambúrguer Artesanal Cheddar Bacon", 20.00),
            new Produtos("Pizza Meio a Meio (Calabresa / Quatro Queijos)", 35.00),
            new Produtos("Combo de Sushi Variado (20 peças)",68.00)
    };


    //Exibição do menu
    public void exibirCardaio () {
        String msg = "";
        System.out.println("========================");
        System.out.println("Cardapio");
        for (Produtos cardapio : cardapioProdutos){
            if (cardapio != null) {
                msg = String.format("\"Produto: %s | Preço produto: R$ %.2f\"",cardapio.getNomeProduto(),
                        cardapio.getPrecoProduto());
                System.out.println(msg);
            }
        }
    }
}
