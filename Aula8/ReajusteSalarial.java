import java.util.Scanner; // Importa a classe Scanner

public class ReajusteSalarial {
    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o salário do funcionário
        System.out.print("Digite o salário do funcionário: ");
        double salarioAnterior = scanner.nextDouble(); // Lê o salário anterior

        // Solicita ao usuário o percentual de aumento
        System.out.print("Digite o percentual do aumento: ");
        double percentualAumento = scanner.nextDouble(); // Lê o percentual de aumento

        // Calcula o novo salário
        double aumento = (percentualAumento / 100) * salarioAnterior;
        double salarioNovo = salarioAnterior + aumento;

        // Calcula o desconto do INSS
        double inss = 0.14 * salarioNovo; // 14% do novo salário
        double salarioLiquido = salarioNovo - inss;

        // Exibe os resultados
        System.out.println("**** Cálculo de Reajuste Salarial*****");
        System.out.printf("Seu salário anterior: %.1f%n", salarioAnterior);
        System.out.printf("Percentual de aumento: %.1f%%%n", percentualAumento);
        System.out.printf("Seu novo Salário: %.1f%n", salarioNovo);
        System.out.printf("Desconto do INSS 14%%: %.1f%n", inss);
        System.out.printf("Salário Líquido: %.1f%n", salarioLiquido);

        // Fecha o scanner
        scanner.close();
    }
}