package modelo;
import java.util.ArrayList;

public class Atendimento {
    private Animal animal;
    private Veterinario veterinario;
    private Responsavel responsavel;
    private ArrayList<Auxiliar> auxiliares;
    
    private String diagnostico;
    private String tratamento;

    public Atendimento(Animal animal, Veterinario veterinario){
        this.animal = animal;
        this.veterinario = veterinario;
        this.responsavel = animal.getResponsavel();
        this.auxiliares = new ArrayList<>();
    }

    public Responsavel getResponsavel(){
        return responsavel;
    }

    public void registrarDiagnostico(String diagnostico){
        this.diagnostico = diagnostico;
    }

    public void preescreverTratamento(String tratamento){
        this.tratamento = tratamento;
    }
}
