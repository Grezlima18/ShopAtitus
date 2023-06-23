package views.produto;

import java.util.List;
import java.util.Scanner;

import entities.Produto;
import services.ProdutoService;

public class ProdutoView {
    private static ProdutoService produtoService = new ProdutoService();

    public static void listaTodosProdutos() {
        System.out.print("\033[H\033[2J"); // Limpa terminal
        System.out.println("Produtos em Estoque: ");
        List<Produto> lista = produtoService.findAll();
        for (Produto produto : lista) {
            System.out.println(produto);
        }
    }
}
