import produto.Produto;
import venda.*;

public class App{
    public static void main(String[] args) {
        //criar 2 produtos
        Produto p1 = new Produto("ESCOVA-DENTE", 22.00);
        Produto p2 = new Produto("PASTA-DENTE", 12.00);

        Venda v1 = new Venda("001");

        ItemVenda item1 = new ItemVenda(p1, 2);
        ItemVenda item2 = new ItemVenda(p2, 3);

        v1.adicionarItem(item1);
        v1.adicionarItem(item2);

        v1.resumo();
    }

}
