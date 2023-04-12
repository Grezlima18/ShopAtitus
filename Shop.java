import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {

        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao Shop Atitus!");

        while (true) {
            System.out.println("Para continuar digite a opção desejada:");
            System.out.println("1 - Listar produtos");
            System.out.println("2 - Adicionar ao carrinho");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            int opcao = lerTeclado.nextInt();
            if (opcao == 3) {
                break;
            } else {
                switch (opcao) {
                    case 1:

                        System.out.println("Nossos produtos são:");
                        System.out.println("1 - ZOTAC RTX 2060 6GB - R$ 2.500,00 ");
                        System.out.println("2 - ZOTAC RTX 3060 Ti 8GB - R$ 3.282,34");
                        System.out.println("3 - ZOTAC RTX 4070 Ti 12GB - R$ 8.235,28");
                        break;

                    case 2:
                        System.out.println("Qual produto você deseja adicionar ao carrinho?");
                        System.out.println("Favor indicar o número do produto (1,2 ou 3)");
                        System.out.print("Número do produto: ");
                        int produto = lerTeclado.nextInt();
                        break;

                    default:
                        System.out.println("Número inválido!");
                        break;
                }
            }
        }
    }

}
