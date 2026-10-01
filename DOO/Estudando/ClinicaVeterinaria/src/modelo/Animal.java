package modelo;

public class Animal {
    private String nome;
    private String especie;
    private String raca;
    private String dtNascimento;
    private double peso;
    
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

    public String getDtNascimento(){
        return dtNascimento;
    }

    public double getPeso(){
        return peso;
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
        if(nome.trim().isEmpty()){
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

    public void setDtNascimento(String dtNascimento){
        if(dtNascimento.trim().isEmpty()){
            System.out.println("Data de nascimento não informada");
            return;
        }else{
            this.dtNascimento = dtNascimento;
        }
    }

    public void setPeso(double peso){
        if(peso <= 0){
            System.out.println("Peso não informado");
        }
    }

    public Animal(String nome, String especie, String raca, String dtNascimento, double peso){
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.dtNascimento = dtNascimento;
        this.peso = peso;
    }
}