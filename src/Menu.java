import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        Livro PHB = new Livro("Player's Handbook", 250.00, "Wizards of the Coast", "D&D 5e");
        Livro T20 = new Livro("Tormenta20 - Livro Básico", 180.00, "Jambô Editora", "Tormenta20");
        Livro Pathfinder2e = new Livro("Pathfinder 2e - Core Rulebook", 220.00,  "Paizo", "Pathfinder 2e");


        System.out.println("===========================================");
        System.out.println("   Bem-vindo ao Martelo & Moeda!");
        System.out.println("   Sua loja online de artigos de RPG");
        System.out.println("===========================================");

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Ver Livros");
            System.out.println("2. Ver Kits de Dados");
            System.out.println("3. Realizar uma compra");
            System.out.println("4. Ver meu carrinho");
            System.out.println("5. Finalizar pedido");
            System.out.println("0. Sair");
            System.out.print("\nEscolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nLivros Disponíveis");
                    System.out.println("---------------------");
                    System.out.println("\n[1]");
                    PHB.exibirDetalhes();
                    System.out.println("\n[2]");
                    T20.exibirDetalhes();
                    System.out.println("\n[3]");
                    Pathfinder2e.exibirDetalhes();
                    break;

                case 2:
                    System.out.println("\nKits de dados");
                    System.out.println("-----------------------------");
                    System.out.println("[1] Kit Básico (7 dados)    | R$ 45,00");
                    System.out.println("[2] Kit Metálico (7 dados)  | R$ 120,00");
                    System.out.println("[3] Kit Colecionador (14 dados) | R$ 200,00");
                    break;

                case 3:
                    System.out.println("\nRealizar compra");
                    System.out.println("Em qual categoria deseja comprar?");
                    System.out.println("1 - Livros  |  2 - Kits de Dados");
                    System.out.print("Opção: ");
                    int categoria = scanner.nextInt();

                    if (categoria == 1) {
                        System.out.println("Você escolheu a categoria: Livros");
                    } else if (categoria == 2) {
                        System.out.println("Você escolheu a categoria: Kits de Dados");
                    } else {
                        System.out.println("Categoria inválida.");
                    }
                    break;

                case 4:
                    System.out.println("\nMeu carrinho");
                    System.out.println("Em desenvolvimento");
                    break;

                case 5:
                    System.out.println("\nFinalizar pedido");
                    System.out.println("Em desenvolvimento");
                    break;

                case 0:
                    System.out.println("\nObrigado por visitar o E-commerce Materlo & Moeda! Até logo.");
                    break;

                default:
                    System.out.println("\nOpção inválida. Digite um número entre 0 e 5");
            }

        } while (opcao != 0);

        scanner.close();
    }
}