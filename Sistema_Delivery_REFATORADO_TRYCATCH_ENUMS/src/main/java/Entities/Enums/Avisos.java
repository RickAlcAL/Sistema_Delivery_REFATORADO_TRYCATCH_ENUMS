package Entities.Enums;

public enum Avisos {
    BEM_VINDO("=== Bem-vindo ao Sistema de Delivery ==="),
    PEDIDO_CONFIRMADO("Sucesso: Seu pedido foi confirmado e enviado para a cozinha!"),
    CARRINHO_VAZIO("Aviso: Seu carrinho está vazio. Adicione itens antes de finalizar."),
    OPCAO_INVALIDA("Erro: Opção inválida! Tente novamente."),
    SISTEMA_ENCERRADO("Sistema encerrado. Obrigado pela preferência!");

    private final String mensagem;

    Avisos(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}