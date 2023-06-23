package views.venda;

import java.util.Scanner;

import entities.ItemVenda;
import entities.Venda;
import services.VendaService;

public class VendaMainView {

    private static VendaService vendaService = new VendaService();

    public static void telaDeVenda() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); // Limpa terminal
        Venda venda = new Venda();
        int opcao = 0;
        do {
            System.out.print("\033[H\033[2J"); // Limpa terminal
            System.out.println("Para continuar digite a opção desejada:");
            System.out.println("1 - Adicionar ao carrinho");
            System.out.println("2 - Consultar carrinho");
            System.out.println("3 - Remover do carrinho");
            System.out.println("4 - Finalizar compra");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    ItemVenda item = VendaItensView.imprimeTelaAdd();
                    venda.getItens().add(item);
                    break;
                case 2:
                    System.out.print("\033[H\033[2J"); // Limpa terminal
                    VendaItensView.imprimeItens(venda);
                    System.out.println("Pressione Enter para continuar");
                    scanner.nextLine();
                    break;
                case 3:
                    VendaItensView.imprimeTelaDel(venda);
                    System.out.println("Pressione Enter para continuar");
                    scanner.nextLine();
                    break;
                case 4:
                    VendaFinalizacaoView.imprimeTelaFinalizacao(venda);
                    System.out.println("Deseja realmente finalizar a compra? [S] [N]");
                    String resposta = scanner.nextLine();
                    if (resposta.equals("S") || resposta.equals("s")) {
                        venda = vendaService.finalizar(venda);
                        if (venda != null) {
                            System.out.println("Venda finalizada com sucesso!");
                            opcao = 0;
                        } else
                            System.out.println("Não foi possível finalizar a venda!");
                        System.out.println("Pressione Enter para continuar");
                        scanner.nextLine();
                    }

                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    if (opcao != 0) {
                        System.out.println("Opção Inválida!");
                        System.out.println("Pressione Enter para continuar");
                        scanner.nextLine();
                    }
                    break;
            }
        } while (opcao != 0);
    }
}
