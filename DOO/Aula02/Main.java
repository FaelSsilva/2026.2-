public class Main {
    public static void main(String[] args){
        
        //carro
        Carro carro1 = new Carro(30000.0,2020, "Toyota", "Corolla", 0,  "Preto");
        //cliente
        Cliente cliente1 = new Cliente("Rafael", "Rafaeldepaulasilvaif22@gmail.com", "102.932.076-40"); 
    
        //vender carros
        Venda venda1 = new Venda();
        //chama o metodo adicionando o carro1 - linha 1
        venda1.adicionarCarro(carro1);

        System.out.println("Total carros: " + venda1.carros.size());

    }
}