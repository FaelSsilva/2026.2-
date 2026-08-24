class contaBancaria{
    String nomeTitular;
    int numeroConta;
    double saldo;

    // Construtor da classe contaBancaria usado para criar a conta e oq ela espera
    contaBancaria(String nomeTitular, int numeroConta, double saldo){
    this.nomeTitular = nomeTitular;
    this.numeroConta = numeroConta;
    this.saldo = saldo; 

    System.out.println("Conta criada com sucesso!");
    System.out.println("Nome do titular: " + nomeTitular);
    System.out.println("Número da conta: " + numeroConta);
    System.out.println("------------------------------------------");
    }

}