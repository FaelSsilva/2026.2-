package cliente;
import java.util.ArrayList;
import pedido.Pedido;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<Pedido> pedidos;


    public Cliente(String nome, String CPF){
        this.nome = nome;
        this.cpf = CPF;
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }

    public ArrayList<Pedido> getPedidos(){
        return new ArrayList<>(this.pedidos);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCPF(){
        return this.cpf;
    }

    public void setCPF(String CPF){
        this.cpf = CPF;
    }
}
