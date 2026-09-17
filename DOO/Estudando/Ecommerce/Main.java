public class Main {
        public static void main(String[] args) {
        CriarProduto produto1 = new CriarProduto("Escova de dente", 12.50, 120 );
        CriarProduto produto2 = new CriarProduto("Pasta de dente", 22.50, 231);
        CriarProduto produto3 = new CriarProduto("Fio-dental", 7.00,122);

        Carrinho venda1 = new Carrinho();
        venda1.addCarrinho(produto1);
        venda1.addCarrinho(produto2);
        venda1.addCarrinho(produto3);
        
        //for each sempre é a variavel primeiro e a lista depois
        for (CriarProduto produto : venda1.Carrinho) {
            System.out.println(produto.nome + " - R$ " + produto.preco);
        }
        System.out.println("-----------------------------");


        //chama o metodo e informa qual produto deseja que seja excluido
        venda1.ExcluirProduto();
        System.out.println("Total no carrinho: R$ " + venda1.calcularTotal());


        //for após exclusão
        for (CriarProduto produto : venda1.Carrinho) {
            System.out.println(produto.nome + " - R$ " + produto.preco);
        }

    }
}