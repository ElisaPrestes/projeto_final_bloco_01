package controller;

import model.Livro;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LivroController {

    private ArrayList<Livro> listaLivros = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void cadastrarLivro() {
        try {
            System.out.print("\nNome do livro: ");
            String nome = scanner.nextLine();

            System.out.print("Preço: R$ ");
            double preco = scanner.nextDouble();

            System.out.print("Autor: ");
            scanner.nextLine();
            String autor = scanner.nextLine();

            System.out.print("Sistema de RPG: ");
            String sistemaRPG = scanner.nextLine();

            Livro livro = new Livro(nome, preco, autor, sistemaRPG);
            listaLivros.add(livro);
            System.out.println("\nLivro cadastrado com sucesso!");

        } catch (InputMismatchException e) {
            System.out.println("\nErro: valor inválido para o preço.");
            scanner.nextLine();
        }
    }

    public void listarLivros() {
        if (listaLivros.isEmpty()) {
            System.out.println("\nNenhum livro cadastrado.");
            return;
        }

        System.out.println("\n--- Lista de Livros ---");
        for (int i = 0; i < listaLivros.size(); i++) {
            System.out.println("\n[" + (i + 1) + "]");
            listaLivros.get(i).exibirDetalhes();
        }
    }

    public void buscarLivro() {
        try {
            System.out.print("\nDigite o número do livro: ");
            int indice = scanner.nextInt() - 1;

            if (indice < 0 || indice >= listaLivros.size()) {
                throw new IndexOutOfBoundsException();
            }

            System.out.println("\n--- Livro encontrado ---");
            listaLivros.get(indice).exibirDetalhes();

        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nErro: livro não encontrado.");
        } catch (InputMismatchException e) {
            System.out.println("\nErro: digite um número válido.");
            scanner.nextLine();
        }
    }

    public void atualizarLivro() {
        try {
            listarLivros();
            if (listaLivros.isEmpty()) return;

            System.out.print("\nDigite o número do livro a atualizar: ");
            int indice = scanner.nextInt() - 1;

            if (indice < 0 || indice >= listaLivros.size()) {
                throw new IndexOutOfBoundsException();
            }

            System.out.print("Novo preço: R$ ");
            double novoPreco = scanner.nextDouble();
            listaLivros.get(indice).preco = novoPreco;
            System.out.println("\nPreço atualizado com sucesso!");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nErro: livro não encontrado.");
        } catch (InputMismatchException e) {
            System.out.println("\nErro: valor inválido.");
            scanner.nextLine();
        }
    }

    public void deletarLivro() {
        try {
            listarLivros();
            if (listaLivros.isEmpty()) return;

            System.out.print("\nDigite o número do livro a remover: ");
            int indice = scanner.nextInt() - 1;

            if (indice < 0 || indice >= listaLivros.size()) {
                throw new IndexOutOfBoundsException();
            }

            String nome = listaLivros.get(indice).nome;
            listaLivros.remove(indice);
            System.out.println("\nLivro \"" + nome + "\" removido com sucesso!");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nErro: livro não encontrado.");
        } catch (InputMismatchException e) {
            System.out.println("\nErro: digite um número válido.");
            scanner.nextLine();
        }
    }
}