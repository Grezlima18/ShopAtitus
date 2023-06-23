package views;

import java.util.Scanner;

import views.produto.ProdutoView;
import views.venda.VendaMainView;

public class MainView {
    public static void comecar() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Para continuar digite a opção desejada:");
            System.out.println("1 - Listar produtos");
            System.out.println("2 - Adicionar ao carrinho");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    ProdutoView.listaTodosProdutos();
                    System.out.println("Pressione Enter para continuar");
                    scanner.nextLine();
                    break;
                case 2:
                    VendaMainView.telaDeVenda();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (true);
    }
}
