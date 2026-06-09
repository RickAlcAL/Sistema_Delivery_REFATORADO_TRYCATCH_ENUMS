package Applications.Menu;

import Entities.Cardapio.Cardapio;
import Entities.InformacoesUsuario.InformacoesUsuario;
import Entities.Produtos.Produtos;
import Entities.Enums.Avisos;
import java.util.Scanner;
import java.util.InputMismatchException; // Importação necessária para capturar o erro de digitação

public class MenuUsuario {

    public void iniciarSistema() {
        Scanner scanner = new Scanner(System.in);
        Cardapio cardapio = new Cardapio();

        System.out.println(Avisos.BEM_VINDO.getMensagem());

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu endereço de entrega: ");
        String endereco = scanner.nextLine();

        InformacoesUsuario usuario = new InformacoesUsuario(nome, endereco);

        int opcao = 0;
        do {
            System.out.println("\n========= MENU PRINCIPAL =========");
            System.out.println("1 - Visualizar Cardápio");
            System.out.println("2 - Adicionar Hambúrguer ao Carrinho");
            System.out.println("3 - Adicionar Pizza ao Carrinho");
            System.out.println("4 - Adicionar Combo Sushi ao Carrinho");
            System.out.println("5 - Finalizar Pedido");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            // O Bloco try-catch envolve a leitura e o processamento da opção do usuário
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer do teclado após ler o número

                switch (opcao) {
                    case 1:
                        System.out.println("\n--- CARDÁPIO DISPONÍVEL ---");
                        cardapio.exibirCardaio();
                        break;

                    case 2:
                        usuario.adicionarAoCarrinho(new Produtos("Hambúrguer Artesanal Cheddar Bacon", 20.00));
                        break;

                    case 3:
                        usuario.adicionarAoCarrinho(new Produtos("Pizza Meio a Meio (Calabresa / Quatro Queijos)", 35.00));
                        break;

                    case 4:
                        usuario.adicionarAoCarrinho(new Produtos("Combo de Sushi Variado (20 peças)", 68.00));
                        break;

                    case 5:
                        if (usuario.getCarrinho().isEmpty()) {
                            System.out.println(Avisos.CARRINHO_VAZIO.getMensagem());
                        } else {
                            System.out.println("\n==================================");
                            System.out.println("RESUMO DO PEDIDO");
                            System.out.println("Cliente: " + usuario.getNomeCliente());
                            System.out.println("Entrega em: " + usuario.getEndereco());
                            System.out.println("----------------------------------");
                            System.out.printf("Total a pagar: R$ %.2f\n", usuario.calcularTotal());
                            System.out.println(Avisos.PEDIDO_CONFIRMADO.getMensagem());
                            System.out.println("==================================");
                            opcao = 6; // Força a saída do loop de forma segura
                        }
                        break;

                    case 6:
                        System.out.println(Avisos.SISTEMA_ENCERRADO.getMensagem());
                        break;

                    default:
                        System.out.println(Avisos.OPCAO_INVALIDA.getMensagem());
                        break;
                }

            } catch (InputMismatchException e) {
                // Caso o usuário digite texto/letras onde deveria ser um número:
                System.out.println("\n[ERRO]: Entrada inválida! Por favor, digite apenas números inteiros.");
                scanner.nextLine();
                opcao = 0; // Reseta a opção para continuar no laço do menu
            }

        } while (opcao != 6);

        scanner.close();
    }
}