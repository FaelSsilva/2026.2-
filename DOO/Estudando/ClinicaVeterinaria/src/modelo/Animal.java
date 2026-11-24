package modelo;

import java.time.LocalDate;

public class Animal {
    private String nome;
    private String especie;
    private String raca;
    private LocalDate dtNascimento;
    private double peso;
    private Responsavel responsavel;
    //get
    public String getNome(){
        return nome;
    }

    public String getEspecie(){
        return especie;
    }

    public String getRaca(){
        return raca;
    }

    public LocalDate getDtNascimento(){
        return dtNascimento;
    }

    public double getPeso(){
        return peso;
    }

    public Responsavel getResponsavel(){
        return responsavel;
    }


    public void atribuirResponsavel(Responsavel responsavel){
        this.responsavel = responsavel;
    }

    //set
    public void setNome(String nome){
        if(nome.trim().isEmpty()){
            System.out.println("Nome não informado");
            return;
        }else{
            this.nome = nome;
        }
    }

    public void setEspecie(String especie){
        if(especie.trim().isEmpty()){
            System.out.println("Especie não informada");
            return;
        } else{
            this.especie = especie;
        }
    }

    public void setRaca(String raca){
        if(raca.trim().isEmpty()){
            System.out.println("Raça nao informada");
            return;
        }else{
            this.raca = raca;
        }
    }

    public void setDtNascimento(LocalDate dtNascimento){
            this.dtNascimento = dtNascimento;
    }

    public void setPeso(double peso){
        if(peso <= 0){
            System.out.println("Peso não informado");
        } else{
            this.peso = peso;
        }
    }

    public Animal(String nome, String especie, String raca, LocalDate dtNascimento, double peso){
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.dtNascimento = dtNascimento;
        this.peso = peso;
    }
}
