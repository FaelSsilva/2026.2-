package src.br.com.pdv.controller;
import java.util.ArrayList;

import src.br.com.pdv.model.Produto;

/**
 * 
 * ProdutoCtrl Controla as operacoes relacionadas aos produtos.
 */
public class ProdutoCtrl {
    private ArrayList<Produto> produtos = new ArrayList<>();
    
    /**
     * adicionar produto á lista
     * @param produto Produto a ser adicionado
     * 
     */
    public void adicionarProduto(Produto produto){  
        this.produtos.add(produto);
    }

    /**
     * Rerorna os produtos cadastrados
     * @return Lista de produtos
     */
    public ArrayList<Produto> listarProdutos(){
        return this.produtos;
    }
}
