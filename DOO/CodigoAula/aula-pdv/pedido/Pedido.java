package pedido;
import java.util.ArrayList;
import produto.Produto;

public class Pedido {
    private String id;
    private String data;
    private ArrayList<Produto> produtos;

    public Pedido(String id, String data){
        this.id = id;
        this.data = data;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    //metodos get e sett
    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getData(){
        return this.data;
    }

    public void setData(String data){
        this.data = data;
    }
}
