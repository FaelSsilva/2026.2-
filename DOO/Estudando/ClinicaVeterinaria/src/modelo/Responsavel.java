package modelo;
import java.util.ArrayList;

public class Responsavel {
    private String nome;
    private String cpf;
    private double telefone;
    private String endereco;
    private Responsavel responsavel;

    public Responsavel getResponsavel() {
    return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public double getTelefone(){
        return telefone;
    }

    public String getEndereco(){
        return endereco;
    }
}
