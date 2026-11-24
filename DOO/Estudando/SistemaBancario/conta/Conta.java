package conta;

public class Conta {
    public static final int LIMITE_SAQUES = 3;
    private final String numero;
    private double saldo = 0;

    public Conta(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
