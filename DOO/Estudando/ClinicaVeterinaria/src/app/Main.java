package app;
import modelo.Animal;
import modelo.Responsavel;

public class Main{

    public static void main(String[] args){
        Animal animal1 = new Animal("Nanico", "Cachorro", "Bace","25/10/2015", 8.00);
        Animal animal2 = new Animal("Babdi", "Gato", "Domestico", "10/10/2025", 3.2);

        Responsavel responsavel1 = new Responsavel("Rafael", "10293207640", "33 99824-6677", "Rua Padre Francisco De Carvalho");

        responsavel1.adicionarAnimal(animal1);
        responsavel1.adicionarAnimal(animal2);
    
        responsavel1.listarAnimais();
    }
}