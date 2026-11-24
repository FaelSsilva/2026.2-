package modelo;

import java.time.LocalDate;

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

    public Auxiliar(String nome, String registro, LocalDate dataAdmissao, double salarioBase, String turno){
        super(nome, registro, dataAdmissao, salarioBase);
        this.turno = turno;
    }
}
