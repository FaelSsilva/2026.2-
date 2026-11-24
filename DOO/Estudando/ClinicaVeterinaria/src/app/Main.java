package app;
import java.time.LocalDate;
import modelo.Animal;
import modelo.Responsavel;
import modelo.Veterinario;
import modelo.Atendimento;

public class Main{

    public static void main(String[] args){
        Responsavel responsavel1 = new Responsavel("Rafael", "10293207640", "33 99824-6677", "Rua Padre Francisco De Carvalho");
        Animal animal1 = new Animal("Nanico", "Cachorro", "Bace", LocalDate.of(2015, 10, 25), 8.00);
        Animal animal2 = new Animal("Babdi", "Gato", "Domestico", LocalDate.of(2025, 10, 10), 3.2);

        responsavel1.adicionarAnimal(animal1);
        responsavel1.adicionarAnimal(animal2);

        responsavel1.listarAnimais();

        Veterinario veterinario1 = new Veterinario(
                "Dra. Ana", "CRMV-123", LocalDate.of(2022, 3, 1), 4500.00, "Clínica geral");
        Atendimento atendimento = new Atendimento(animal1, veterinario1);
        System.out.println("Responsável pelo atendimento: " + atendimento.getResponsavel().getNome());
    }
}
