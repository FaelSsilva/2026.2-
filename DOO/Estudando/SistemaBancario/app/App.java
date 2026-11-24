package app;
import conta.Conta;
import usuario.*;

public class App {
    public static void main(String[] args){
        //cria conta
        Conta conta1 = new  Conta("Corrente", 1.000);
        //correntista extends usuario
        //criar usuario recebendo conta que foi criada no parametro
        Correntista c1 = new Correntista("Rafael De Paula Silva", "10293207640", conta1);
        
        
        

    }
}
