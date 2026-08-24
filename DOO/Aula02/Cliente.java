class Cliente{
    String nome;
    String email;
    String cpf;
    
    Cliente(String nome, String email, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;

        System.out.println("---------------------------");
        System.out.println("Novo cliente cadastrado!");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
        System.out.println("---------------------------");
    }
}