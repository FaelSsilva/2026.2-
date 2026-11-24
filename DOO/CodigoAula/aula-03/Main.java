import java.util.ArrayList;

import Carro.Carro;
import Pessoa.Cliente;
import Pessoa.Vendedor;
import Venda.Venda;

public class Main {
    public static void main(String[] args) {
        // instanciando um objeto da classe Carro
        Carro carro1 = new Carro(50000.0, 2020, "Toyota", "Corolla", 15000.0, "Prata");

        // chamando métodos do objeto carro1
        carro1.ligar();

        carro1.desligar();

        // outro carro
        Carro carro2 = new Carro(30000.0, 2018, "Honda", "Civic", 30000.0, "Preto");

        // Cliente
        Cliente cliente1 = new Cliente();
        cliente1.setNome("José das Couves");
        cliente1.setCpf("1234567890");
        cliente1.setEmail("josedascouves@gmail.com");

        // Vendedor
        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Maria das Flores");
        vendedor1.setCpf("0987654321");
        vendedor1.setEmail("mariadasflores@gmail.com");
        vendedor1.setSalario(2000.0);

        // Vender carros
        Venda venda1 = new Venda();
        venda1.adicionarCarro(carro1);

        System.out.println("Total carros: "+ venda1.getCarros().size());

        // como usar o setCarros(???) ????
        ArrayList<Carro> novalista = new ArrayList<>();
        novalista.add(carro1);
        novalista.add(carro2);

        venda1.setCarros(novalista);

        System.out.println("Total carros: "+ venda1.getCarros().size());

        venda1.adicionarCliente(cliente1);
        venda1.adicionarVendedor(vendedor1);

        System.out.println(venda1.mostrarInformacoes());
    }
}
