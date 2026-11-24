import venda.*;

public class App {
    public static void main(String[] args) {
        // criar dois produtos informando no construtor nome e preço
        Produto produto1 = new Produto("Teclado", 100);
        Produto produto2 = new Produto("Mouse", 50);

        // criar uma venda informando no construtor um id
        Venda venda1 = new Venda("002");

        // criar 2 ItemVenda informando o produto e qunatidade
        ItemVenda item1 = new ItemVenda(produto1, 2);
        ItemVenda item2 = new ItemVenda(produto2, 3);

        // adicionar itens à venda 
        venda1.adicionarItem(item1);
        venda1.adicionarItem(item2);

        // mostrar o resumo da venda
        venda1.resumo();
    }
}
