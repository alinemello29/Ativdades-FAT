import java.util.Scanner; // Importa a classe Scanner

public class ComparacaoNumeros {
    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite os dois números
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt(); // Lê o primeiro número

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt(); // Lê o segundo número

        // Compara os números
        if (numero1 == numero2) {
            // Se os números forem iguais
            System.out.printf("Os números são iguais: %d , %d%n", numero1, numero2);
        } else {
            // Se os números forem diferentes
            System.out.printf("Os números são diferentes: %d , %d%n", numero1, numero2);
            if (numero1 > numero2) {
                // Se o primeiro número for maior
                System.out.printf("O número %d é maior e %d é o menor.%n", numero1, numero2);
            } else {
                // Se o segundo número for maior
                System.out.printf("O número %d é maior e %d é o menor.%n", numero2, numero1);
            }
        }

        // Fecha o scanner
        scanner.close();
    }
}