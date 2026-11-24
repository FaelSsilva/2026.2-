package Venda;

import java.util.ArrayList;

import Carro.Carro;
import Pessoa.Cliente;
import Pessoa.Vendedor;

public class Venda {
    // lista de carros em uma venda
    private ArrayList<Carro> carros = new ArrayList<>();
    private Cliente cliente;
    private Vendedor vendedor;

    // getters e setters
    // get Carros: retorna o atributo carros
    public ArrayList<Carro> getCarros(){
        return this.carros;
    }

    // set Carros: atribuir um valor ao atributo carros
    public void setCarros(ArrayList<Carro> carros){
        this.carros = carros;
    }

    public Cliente getCliente(){ return this.cliente; }

    public Vendedor getVendedor(){ return this.vendedor; }

    // metodo para vender um carro
    public void adicionarCarro(Carro carro){
       carros.add(carro); 
    }

    public void adicionarCliente(Cliente cliente){ this.cliente = cliente; }

    public void adicionarVendedor(Vendedor vendedor){ this.vendedor = vendedor; }

    public String mostrarInformacoes() {
        String info = "";
        
        // validacoes
        if( this.cliente != null && this.vendedor != null ){
            info += "VENDA:\n";

            info += "Cliente: " + this.cliente.getNome() + "\n";
            info += "Vendedor: " + this.vendedor.getNome() + "\n";

            // mostrar os carros
            info += "Carros:";
            for ( Carro carro : this.carros ) {
                info += "\t" + carro.mostrarInformacoes();
            }
            info += "\t\n------------\n";
        }

        return info;
    }
}
