import java.util.Scanner; // Importa a classe Scanner

public class EstatisticasPessoas {
    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Variáveis para os cálculos
        int totalPessoas = 5;
        int contadorMais50Menos60 = 0;
        int contadorAlturaMenos150 = 0;
        int somaIdadesMenos150 = 0;
        int contadorPesoMais100 = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Dados da Pessoa: " + i);
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt(); // Lê a idade

            System.out.print("Digite o peso: ");
            double peso = scanner.nextDouble(); // Lê o peso

            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble(); // Lê a altura

            // Verifica condições para cálculos
            if (idade > 50 && peso < 60) {
                contadorMais50Menos60++;
            }
            if (altura < 1.50) {
                somaIdadesMenos150 += idade;
                contadorAlturaMenos150++;
            }
            if (peso > 100) {
                contadorPesoMais100++;
            }
        }

        // Cálculos e saídas
        double percentualMais50Menos60 = (contadorMais50Menos60 / (double) totalPessoas) * 100;
        double mediaIdadeMenos150 = (contadorAlturaMenos150 > 0) ? (double) somaIdadesMenos150 / contadorAlturaMenos150 : 0;
        double percentualPesoMais100 = (contadorPesoMais100 / (double) totalPessoas) * 100;

        // Exibe os resultados
        System.out.printf("A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg é: %.1f%n", (double) contadorMais50Menos60);
        System.out.printf("A porcentagem de pessoas com idade superior a 50 anos e peso inferior a 60 kg é: %.1f%%%n", percentualMais50Menos60);
        System.out.printf("A média de idade das pessoas com altura inferior a 1.50m é: %.1f%n", mediaIdadeMenos150);
        System.out.printf("A porcentagem de pessoas com peso superior a 100 kg é: %.1f%%%n", percentualPesoMais100);

        // Fecha o scanner
        scanner.close();
    }
}