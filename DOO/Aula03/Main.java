import java.util.ArrayList;

import Carro.Carro;
import Cliente.Cliente;
import Venda.Venda;

class Main {
    public static void main(String[] args){
        // instanciando um objeto da classe Carro com um método >CONSTRUTOR<
        Carro carro1 = new Carro("Corolla", "Toyota", 2020, 120000, "Branco", 119.999);

        // outro carro
        Carro carro2 = new Carro("Civic","Honda", 2018, 90000, "Preto", 109.999);

        // instanciando um objeto da classe Cliente com um metodo >CONSTRUTOR<
        Cliente cliente1 = new Cliente("Fulano", "123.456.789-11", "fulano@gmail");

        // definindo o estado do objeto da classe Cliente (AINDA FALTA IMPLEMENTAR NO CONSTRUTOR DE CLIENTE, BATEU PREGUIÇA)
        cliente1.setTelefone("33 99999-9999");
        cliente1.setEndereco("Rua Das Couve");
        cliente1.setCnh("123456789");   

        //Vender carros
        Venda venda1 = new Venda();
        venda1.adicionarCarro(carro1);
        venda1.adicionarCarro(carro2);

        System.out.println("Total carros: " + venda1.getCarros().size());

        ArrayList<Carro> novalista = new ArrayList<>();
        novalista.add(carro1);
        novalista.add(carro2);

        venda1.setCarros(novalista);

        System.out.println("Total carros: " + venda1.getCarros().size());
    }
}
