package modelo;

public class Profissional {
    private String nome;
    private String registro;
    private String dataAdmissao;
    private double salarioBase;

    public String getNome(){
        return nome;
    }

    public String getRegistro(){
        return registro;
    }

    public String getDataAdimissao(){
        return dataAdmissao;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public void setNome(String nome){
        if(nome.trim().isEmpty()){
            System.out.println("Nome não foi preenchido");
            return;
        } else {
            this.nome = nome;
        }
    }

    public void setRegistro(String registro){
        if(registro.trim().isEmpty()){
            System.out.println("Registro nao foi preenchido");
            return;
        } else {
            this.registro = registro;
        }
    }

    public void setDataAdmissao(String dataAdmissao){
        if(dataAdmissao.trim().isEmpty()){
            System.out.println("Data admissão não foi preenchido");
            return;
        } else {
            this.dataAdmissao = dataAdmissao;
        }
    }

    public void setSalarioBase(double salarioBase){
        if(salarioBase <=0 ){
            System.out.println("Salario infomado incorretamente");
            return;
        } else{
            this.salarioBase = salarioBase;
        }
    }

    public Profissional(String nome, String registro, String dataAdmissao, double salarioBase){
        this.nome = nome;
        this.registro = registro;
        this.dataAdmissao = dataAdmissao;
        this.salarioBase = salarioBase;
    }
}
