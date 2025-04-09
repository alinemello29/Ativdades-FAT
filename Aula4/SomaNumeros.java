import java.util.Scanner; 

public class SomaNumeros {
    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numero1, numero2, soma;

        // Solicita ao usuário o primeiro número
        System.out.print("Digite o valor do primeiro número: ");
        numero1 = scanner.nextInt(); // Lê o primeiro número

        // Solicita ao usuário o segundo número
        System.out.print("Digite o valor do segundo número: ");
        numero2 = scanner.nextInt(); // Lê o segundo número

        // Calcula a soma
        soma = numero1 + numero2;

        // Exibe o resultado
        System.out.println("A soma de " + numero1 + " com " + numero2 + " resulta em " + soma);

        // Fecha o scanner
        scanner.close();
    }
}