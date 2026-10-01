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

    public void setNome(String nome){
        if(nome.trim().isEmpty()){    
            System.out.println("Nome deve ser preenchido");
            return;
        }else{
            this.nome = nome;
        }
    }

    public void setCpf(String cpf){
        if(cpf.trim().isEmpty()){
            System.out.println("CPF deve ser preenchido");
            return;
        } else{
            this.cpf = cpf;
        }
    }

    public void setTelefone(String telefone){
        if(telefone.trim().isEmpty()){
            System.out.println("Telefone deve ser preenchido");
            return;

        }
    }
    
    public void setEndereco(String endereco){
        if (endereco.trim().isEmpty()){
            System.out.println("Endereço deve ser preenchido");
            return;
        } else{
            this.endereco = endereco;
        }
    }

    //metodo construtor
    public Responsavel(String nome, String cpf, String telefone, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animais){
        //adiciona animal em animais array
        this.animais.add(animais);
        System.out.println("Animal adicionado a responsavel corretamente");
    }

    public void listarAnimais(){
        for (Animal animal : animais){
            System.out.println("Nome: " + animal.getNome());
        }
    }
}
