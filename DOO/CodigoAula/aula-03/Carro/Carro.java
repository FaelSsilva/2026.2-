package Carro;

public class Carro {
    // atributos do carro
    private double preco;
    private int ano;
    private String marca;
    private String modelo;
    private double km;
    private String cor;

    public Carro(double preco, int ano, String marca, String modelo, double km, String cor){
        // Definir o estado
        this.preco = preco;
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
        this.cor = cor;

        // Mostro as informacoes
        this.mostrarInformacoes();
    }

    // Getters e Setters
    public double getPreco() {
      return this.preco;
    }
    public void setPreco(double value) {
      this.preco = value;
    }

    public int getAno() {
      return this.ano;
    }
    public void setAno(int value) {
      this.ano = value;
    }

    public String getMarca() {
      return this.marca;
    }
    public void setMarca(String value) {
      this.marca = value;
    }

    public String getModelo() {
      return this.modelo;
    }
    public void setModelo(String value) {
      this.modelo = value;
    }

    public double getKm() {
      return this.km;
    }
    public void setKm(double value) {
      this.km = value;
    }

    public String getCor() {
      return this.cor;
    }
    public void setCor(String value) {
      this.cor = value;
    }

    // métodos
    public void ligar(){
        System.out.println("O carro está ligado.");
    }
    
    public void desligar(){
        System.out.println("O carro está desligado.");
    }
    
    public String mostrarInformacoes(){
        String info = "";

        info += "Marca: " + this.marca + "\n";
        info += "Modelo: " + this.modelo + "\n";
        info += "Ano: " + this.ano + "\n";
        info += "Preço: " + this.preco + "\n";
        info += "Quilometragem: " + this.km + "\n";
        info += "Cor: " + this.cor + "\n";

        return info;
    }
    
    public void fazerTestDrive(){}

}