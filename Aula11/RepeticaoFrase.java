import java.util.Scanner; // Importa a classe Scanner

public class RepeticaoFrase {
    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a quantidade de vezes
        System.out.print("Digite a quantidade de vezes: ");
        int quantidade = scanner.nextInt(); // Lê a quantidade de repetições

        int contador = 1; // Inicializa o contador

        // Executa o loop enquanto o contador for menor ou igual à quantidade
        while (contador <= quantidade) {
            System.out.printf("Disciplina Lógica de Programação %d%n", contador);
            contador++; // Incrementa o contador
        }

        // Fecha o scanner
        scanner.close();
    }
}