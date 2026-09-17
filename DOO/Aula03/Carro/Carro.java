package Carro;

public class Carro { 
    //atributos do carro
    public double preco;
    public int ano;
    public String marca;
    public String modelo;
    public double km;
    public String cor;

    //métodos
    public void ligar(){
        System.out.println("O carro está ligando...");
    }
    public void desligar(){
        System.out.println("O carro está desligando...");
    }
    public void mostrarInformacoes(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
        System.out.println("Quilometragem: " + this.km);
        System.out.println("Cor: " + this.cor);
        System.out.println("Preço: " + this.preco);
        System.out.println();
    }
    public void fazerTestDrive(){
        System.out.println("Fazendo o teste drive..");
    }
    public Carro(String modelo, String marca, int ano, double km, String cor, double preco){
        //defini o estado
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.km = km;
        this.cor = cor;
        this.preco = preco;
        //mostrei as informações
        //this.mostrarInformacoes();
    }
}
