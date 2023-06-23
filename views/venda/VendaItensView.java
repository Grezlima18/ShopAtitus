package views.venda;

import java.util.Scanner;

import entities.ItemVenda;
import entities.Produto;
import entities.Venda;
import services.ProdutoService;
import services.VendaService;
import views.produto.ProdutoView;

public class VendaItensView {

    private static ProdutoService produtoService = new ProdutoService();

    public static void imprimeItens(Venda venda) {
        VendaService vendaService = new VendaService();
        System.out.println("Produtos no Carrinho: ");
        int i = 1;
        for (ItemVenda item : venda.getItens()) {
            System.out.println("Item " + i++);
            System.out.println("Produto: " + item.getProduto());
            System.out.println("Quantidade: " + item.getQuantidade());
            System.out.println("Valor: " + item.getQuantidade() * item.getProduto().getValorUnitario());

        }
        System.out.println("Valor Total: " + vendaService.calculaValorTotal(venda));
    }

    public static ItemVenda imprimeTelaAdd() {
        Scanner scanner = new Scanner(System.in);

        Produto produto = null;
        do {
            System.out.print("\033[H\033[2J"); // Limpa terminal
            ProdutoView.listaTodosProdutos();
            System.out.println("Digite o código do produto que você deseja adicionar");
            int codigoProduto = scanner.nextInt();
            scanner.nextLine();
            produto = produtoService.findById(codigoProduto);
            if (produto == null) {
                System.out.println("Código informado inválido");
                System.out.println("Pressione Enter para continuar");
                scanner.nextLine();
            }
        } while (produto == null);
        System.out.println("Digite a quantidade de produto que você deseja");
        int quantidade = scanner.nextInt();

        ItemVenda item = new ItemVenda();
        item.setProduto(produto);
        item.setQuantidade(quantidade);

        return item;
    }

    public static void imprimeTelaDel(Venda venda) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); // Limpa terminal
        imprimeItens(venda);
        System.out.print("Informe qual item você deseja remover: ");
        int item = scanner.nextInt();
        venda.getItens().remove(item - 1);
    }
}
