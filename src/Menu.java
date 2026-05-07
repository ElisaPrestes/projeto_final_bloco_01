import controller.LivroController;
import model.Livro;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        LivroController controller = new LivroController();

        // Populando com os livros iniciais
        // (você pode remover isso depois se quiser cadastrar pelo menu)
        Livro PHB = new Livro("Player's Handbook", 250.00, "Wizards of the Coast", "D&D 5e");
        Livro T20 = new Livro("Tormenta20 - Livro Básico", 180.00, "Jambô Editora", "Tormenta20");
        Livro Pathfinder2e = new Livro("Pathfinder 2e - Core Rulebook", 220.00, "Paizo", "Pathfinder 2e");

        System.out.println("===========================================");
        System.out.println("   Bem-vindo ao Martelo & Moeda!");
        System.out.println("   Sua loja online de artigos de RPG");
        System.out.println("===========================================");

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Listar Livros");
            System.out.println("2. Buscar Livro");
            System.out.println("3. Cadastrar Livro");
            System.out.println("4. Atualizar Livro");
            System.out.println("5. Deletar Livro");
            System.out.println("0. Sair");
            System.out.print("\nEscolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    controller.listarLivros();
                    break;
                case 2:
                    controller.buscarLivro();
                    break;
                case 3:
                    controller.cadastrarLivro();
                    break;
                case 4:
                    controller.atualizarLivro();
                    break;
                case 5:
                    controller.deletarLivro();
                    break;
                case 0:
                    System.out.println("\nObrigado por visitar o Martelo & Moeda! Até logo.");
                    break;
                default:
                    System.out.println("\nOpção inválida. Digite um número entre 0 e 5.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}