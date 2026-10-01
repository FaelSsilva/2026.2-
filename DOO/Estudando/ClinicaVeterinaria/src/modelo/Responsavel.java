package modelo;
import java.util.ArrayList;

public class Responsavel {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private ArrayList<Animal> animais = new ArrayList<>();

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getEndereco(){
        return endereco;
    }

    public Responsavel(String nome, String cpf, String telefone, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animais){
        //adiciona animal em animais
        this.animais.add(animais);
        System.out.println("Animal adicionado a responsavel corretamente");
    }

    // public void listarAnimais(){
    //     for animal : 
    // }
}
