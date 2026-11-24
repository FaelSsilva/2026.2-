package br.com.pdv.view;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.pdv.model.Produto;

/**
 * Responsável pela interação com o usuário,
 * via terminal, nas operações relacionadas
 * aos produtos.
 */
public class ProdutoView {
    /**
     * Exibe as informações dos produtos.
     * 
     * @param produtos Produtos a serem exibidos.
     */
    public void exibirProdutos(ArrayList<Produto> produtos) {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return; // encerra a execução do método
        }

        System.out.println("=== INFORMAÇÕES DOS PRODUTOS ===");

        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Estoque: " + produto.getEstoque());
            System.out.println("------------------");
        }

    }

    public Produto cadastrarProduto(Scanner scanner) {
        // Declaração múltipla de variáveis
        String nome = "", descricao = "";
        double preco = 0, estoque = 0;
        
        System.out.println("=== CADASTRAR PRODUTO ===");

        System.out.print("Nome: ");
        nome = scanner.nextLine();

        System.out.print("Descrição: ");
        descricao = scanner.nextLine();

        System.out.print("Preço: ");
        preco = Double.parseDouble(scanner.nextLine());

        try {
            System.out.print("Estoque: ");
            estoque = Double.parseDouble(scanner.nextLine());

            if(estoque <= 0){
                throw new Exception("O estoque deve ser um número válido!");
            }

        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite um valor válido! " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return new Produto(nome, descricao, preco, estoque);
    }
}
