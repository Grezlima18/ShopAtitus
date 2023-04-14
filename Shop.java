import java.util.Scanner;
import java.util.ArrayList;

public class Shop {
    public static void main(String[] args) {

        Scanner lerTeclado = new Scanner(System.in);
        ArrayList<Double> listaProdutos = new ArrayList<>();
        ArrayList<Integer> guardaNumero = new ArrayList<>();
        listaProdutos.add(2500.00);
        listaProdutos.add(3282.34);
        listaProdutos.add(8235.28);


        System.out.println("Seja bem-vindo ao Shop Atitus!");

        ArrayList<Double> carrinho = new ArrayList<>();

        int finalizador = 0;

        while (finalizador != 1) {
            System.out.println("Para continuar digite a opção desejada:");
            System.out.println("1 - Listar produtos");
            System.out.println("2 - Adicionar ao carrinho");
            System.out.println("3 - Consultar carrinho");
            System.out.println("4 - Finalizar compra");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");

            int opcao = lerTeclado.nextInt();
            double somaFinal = 0;

            if (opcao == 5) {
                break;
            } else {
                switch (opcao) {
                    case 1:

                        System.out.println("Nossos produtos são:");
                        System.out.println("1 - ZOTAC RTX 2060 6GB - R$ 2.500,00 ");
                        System.out.println("2 - ZOTAC RTX 3060 Ti 8GB - R$ 3.282,34");
                        System.out.println("3 - ZOTAC RTX 4070 Ti 12GB - R$ 8.235,28");
                        System.out.print("Pressione OK para continuar...");
                        lerTeclado.next();
                        break;

                    case 2:
                        System.out.println("Qual produto você deseja adicionar ao carrinho?");
                        System.out.println("Favor indicar o número do produto (1,2 ou 3)");
                        System.out.print("Número do produto: ");
                        int produto = lerTeclado.nextInt();
                        guardaNumero.add(produto);
                        carrinho.add(listaProdutos.get(produto - 1));
                        break;

                    case 3:
                        if(carrinho.size() == 0){

                            System.out.println("Sua lista está vazia!");
                        }
                        for (int n = 0; n < guardaNumero.size(); n++) {

                            if (guardaNumero.get(n) == 1) {

                                System.out.println("ZOTAC RTX 2060 6GB");
                            } else if (guardaNumero.get(n) == 2) {
                                System.out.println("ZOTAC RTX 3060 Ti 8GB");
                            } else if (guardaNumero.get(n) == 3) {
                                System.out.println("ZOTAC RTX 4070 Ti 12GB");
                            }
                        }
                        break;

                    case 4:
                        for (int n = 0; n < carrinho.size(); n++) {
                            somaFinal = somaFinal + carrinho.get(n);
                        }
                        if(carrinho.size() > 0){
                            System.out.printf("O total de sua compra é de R$ %.2f \n", somaFinal);
                            System.out.println("Agradeçemos sua compra, volte sempre!");
                            finalizador = 1;
                            break;

                        } else {
                            System.out.println("Você não possuí nenhum item em seu carrinho, caso deseje sair da loja digite 5!");
                            break;
                            
                        }

                    default:
                        System.out.println("Número inválido!");
                        break;
                }
            }
        }
    }
}
