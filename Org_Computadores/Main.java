import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero_alunos;
        System.out.println("DIgite um numero: ");
        numero_alunos = scanner.nextInt();

        System.out.println("O numero digitado foi: " + numero_alunos);
        scanner.close();
    }
}
