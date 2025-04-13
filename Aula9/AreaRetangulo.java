import java.util.Scanner; // Importa a classe Scanner

public class AreaRetangulo {
    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite a base e a altura
        System.out.print("Digite o tamanho da base: ");
        double base = scanner.nextDouble(); // Lê a base

        System.out.print("Digite o tamanho da altura: ");
        double altura = scanner.nextDouble(); // Lê a altura

        // Calcula a área
        double area = base * altura;

        // Verifica se é um quadrado ou um retângulo
        if (base == altura) {
            // Se for quadrado
            System.out.printf("O quadrado com base %.1f e altura %.1f tem área: %.1f%n", base, altura, area);
        } else {
            // Se for retângulo
            System.out.printf("O retângulo com base %.1f e altura %.1f tem área: %.1f%n", base, altura, area);
        }

        // Fecha o scanner
        scanner.close();
    }
}