package views.venda;

import entities.Venda;

public class VendaFinalizacaoView {
    public static void imprimeTelaFinalizacao(Venda venda) {
        System.out.print("\033[H\033[2J"); // Limpa terminal
        System.out.println("Suas compras:");
        VendaItensView.imprimeItens(venda);
    }
}
