package Cliente;
import Carro.Carro;
public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private String cnh;
    private String email;

    //metodos get
    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public String getCnh(){
        return this.cnh;
    }

    public String getEmail(){
        return this.email;
    }

    //metodo set
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setCnh(String cnh){
        this.cnh = cnh;
    }

    public void setEmail(String email){
        this.email = email;
    }













    public void escolher(Carro carro){
        System.out.println(this.nome +" escolheu o carro: " + carro.modelo);
    }

    public void comprarAVista(Carro carro){
        System.out.println(this.nome + " comprou o " + carro.modelo + " à vista por R$" + carro.preco);
    }

    public void comprarParcelado(Carro carro){
        System.out.println(this.nome + " comprou o " + carro.modelo + " parcelado por R$" + carro.preco);
    }

    public void fazerTestDrive(Carro carro){
        System.out.println(this.nome + " está fazendo test drive no " + carro.marca + " " + carro.modelo);
        carro.ligar();
    }

    public Cliente(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        //System.out.printf("Nome do cliente: %s, Cpf: %s, Email: %s", nome, cpf, email);
        System.out.println();
    }
}
