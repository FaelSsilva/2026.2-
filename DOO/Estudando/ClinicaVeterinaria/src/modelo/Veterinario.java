package modelo;

public class Veterinario extends Profissional {
    private String especialidade;

    public String getEspecialidade(){
        return especialidade;
    }

    public void setEspecialidade(String especialidade){
        if(especialidade.trim().isEmpty()){
            System.out.println("Especialidade nao foi informada");
            return;
        } else{
            this.especialidade = especialidade;
        }
    }

    public Veterinario(String nome, String registro, String dataAdmissao, double salarioBase, String especialidade){
        //uso de construtor passando dados comuns de profissional
        super(nome, registro, dataAdmissao, salarioBase);
        this.especialidade = especialidade;
    }
}
