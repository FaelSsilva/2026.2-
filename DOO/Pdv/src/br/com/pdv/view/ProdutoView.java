package src.br.com.pdv.view;
import java.util.ArrayList;

import src.br.com.pdv.model.Produto;

/**
 * Responsável pela interação com o usuário, via terminal,
 * nas operações relacionadas aos produtos.
 */
public class ProdutoView {
    /**
     * Exibe as informacoes dos produtos.
     * @param produto produtos a ser exibidos.
     */
    public void exibirProdutos(ArrayList<Produto> produtos){ 
        if(produtos.isEmpty()){
                System.out.println("Nenhum produto cadastrado");
                return;
        }else{
            System.out.println("====== Informações dos produtos ======");
            for(Produto produto : produtos){
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Descrição: " + produto.getDescricao());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("Estoque: " + produto.getEstoque());
                System.out.println("----------------------------");
            }
        }    
    }
    
}
