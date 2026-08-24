class Carro {
    double preco;
    int ano;
    String marca;
    String modelo;
    double km;
    String cor;
    
    Carro(double preco, int ano, String marca, String modelo, double km, String cor){
        this.preco = preco;
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
        this.cor = cor;

        this.mostrarInformacoes();
    }

    void mostrarInformacoes(){
           System.out.println("Informações do carro");
        System.out.println("Preço: " + preco);
        System.out.println("Ano: " + ano);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("KM: " + km);
        System.out.println("Cor: " + cor);
    }

    
}
