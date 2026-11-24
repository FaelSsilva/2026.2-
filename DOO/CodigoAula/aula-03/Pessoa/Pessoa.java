package Pessoa;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String email;
    private String tipo; // cliente ou vendedor

    //getters and setterns
    // Nome
    public String getNome(){ return this.nome; }
    public void setNome(String nome){ this.nome = nome; }

    // CPF
    public String getCpf(){ return this.cpf; }
    public void setCpf(String cpf){ this.cpf = cpf; }

    // Email
    public String getEmail(){ return this.email; }
    public void setEmail(String email){ this.email = email; }
}
