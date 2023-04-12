import java.util.Scanner;
import java.util.ArrayList;

public class Shop {
    public static void main(String[] args) {

        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao Shop Atitus!");
        ArrayList<Double> listaProdutos = new ArrayList<>();
        listaProdutos.add(2500.00);
        listaProdutos.add(3282.34);
        listaProdutos.add(8235.28);

        ArrayList<Double> carrinho = new ArrayList<>();

        while (true) {
            System.out.println("Para continuar digite a opção desejada:");
            System.out.println("1 - Listar produtos");
            System.out.println("2 - Adicionar ao carrinho");
            System.out.println("3 - Consultar carrinho");
            System.out.println("4 - Finalizar compra");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            int opcao = lerTeclado.nextInt();
            if (opcao == 5) {
                break;
            } else {
                switch (opcao) {
                    case 1:

                        System.out.println("Nossos produtos são:");
                        System.out.println("1 - ZOTAC RTX 2060 6GB - R$ 2.500,00 ");
                        System.out.println("2 - ZOTAC RTX 3060 Ti 8GB - R$ 3.282,34");
                        System.out.println("3 - ZOTAC RTX 4070 Ti 12GB - R$ 8.235,28");
                        System.out.println(listaProdutos);
                        break;

                    case 2:
                        System.out.println("Qual produto você deseja adicionar ao carrinho?");
                        System.out.println("Favor indicar o número do produto (1,2 ou 3)");
                        System.out.print("Número do produto: ");
                        int produto = lerTeclado.nextInt();
                        carrinho.add(listaProdutos.get(produto - 1));
                        break;
                    
                    case 3:
                        System.out.println(carrinho);
                        break;

                    case 4:
                        // Corrigir a quebra do Switch e descobrir metodo de somar uma lista inteira
                        opcao = 5;
                        break;

                    default:
                        System.out.println("Número inválido!");
                        break;
                }
            }
        }
    }

}
