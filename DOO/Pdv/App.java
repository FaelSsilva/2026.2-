import src.br.com.pdv.controller.ProdutoCtrl;
import src.br.com.pdv.model.Produto;
import src.br.com.pdv.view.ProdutoView;

public class App{
    public static void main(String[] args) {
        //Instanciar View e Controleler de Produto
        ProdutoView produtoView = new ProdutoView();
        ProdutoCtrl produtoCtrl = new ProdutoCtrl();
        
        
        //Criando um produto
        produtoCtrl.adicionarProduto(
            new Produto(
                "Arroz", 
                "Arroz Sepé 5kg", 
                25.99, 
                100
            )
        );

        //Criando um produto
        produtoCtrl.adicionarProduto(
            new Produto(
                "Feijão", 
                "Feijão Sepé 1kg", 
                11.99, 
                50
            )
        );

        //Mostrar o produto na tela
        //criar uma variavel da lista de produto
        produtoView.exibirProdutos(
            produtoCtrl.listarProdutos()
        );

    }
}

