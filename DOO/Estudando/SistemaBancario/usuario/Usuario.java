package usuario;
import conta.Conta;

public class Usuario{
    private String nome;
    private final String CPF;
    protected static int quantidade;
    private Conta conta;
    
    public Usuario(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
        ++quantidade;
    }

    public String getNome(){
        return nome;
    }

    public String getCPF(){
        return CPF;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public Conta getConta(){
        return this.conta;
    }
}