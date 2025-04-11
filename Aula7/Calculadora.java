import java.util.Scanner; 

public class Calculadora {
    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        double numero1, numero2;

        // Solicita ao usuário o primeiro número
        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble(); // Lê o primeiro número

        // Solicita ao usuário o segundo número
        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble(); // Lê o segundo número

        // Realiza as operações
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        // Exibe os resultados
        System.out.printf("O resultado da soma de: %.1f + %.1f = %.1f%n", numero1, numero2, soma);
        System.out.printf("O resultado da subtração de: %.1f - %.1f = %.1f%n", numero1, numero2, subtracao);
        System.out.printf("O resultado da multiplicação de: %.1f x %.1f = %.1f%n", numero1, numero2, multiplicacao);
        System.out.printf("O resultado da divisão de: %.1f / %.1f = %.1f%n", numero1, numero2, divisao);

        // Fecha o scanner
        scanner.close();
    }
}