import java.util.ArrayList;

class Carrinho {   
    ArrayList<CriarProduto> Carrinho = new ArrayList<>();
    
    //metodo para adicionar produtos no carrinho
    void addCarrinho(CriarProduto carrinho){
        Carrinho.add(carrinho);
    }

     void ExcluirProduto() {
        Carrinho.remove(0);
    }

    double calcularTotal(){
        double soma = 0;
        for (CriarProduto produto : Carrinho) {
            soma += produto.preco;
        }
        return soma;
    }
}
