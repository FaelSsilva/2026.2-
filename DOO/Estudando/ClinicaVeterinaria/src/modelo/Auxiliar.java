package modelo;

public class Auxiliar extends Profissional {
    private String turno;

    public String getTurno(){
        return turno;
    }

    public void setTurno(String turno){
        if(turno.trim().isEmpty()){
            System.out.println("Turno deve ser preenchido");
            return;
        } else {
            this.turno = turno;
        }
    }

    public Auxiliar(String nome, String registro, String dataAdmissao, double peso, String turno){
        super(nome, registro, dataAdmissao, peso);
        this.turno = turno;
    }
}
