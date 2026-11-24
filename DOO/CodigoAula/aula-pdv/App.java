import cliente.Cliente;
import pedido.Pedido;
import produto.Produto;

public class App {
    public static void main(String[] args) {
        Cliente c1 =  new Cliente("Rafael", "123456789");
        Pedido pedido1 = new Pedido("1", "19/10/2026");

        Produto p1 = new Produto("Biscoito", 3.99, 1 );
        Produto p2 = new Produto("Azeite",   52.30, 3);

        pedido1.adicionarProduto(p1);
        pedido1.adicionarProduto(p2);

        c1.adicionarPedido(pedido1);
    }
}
