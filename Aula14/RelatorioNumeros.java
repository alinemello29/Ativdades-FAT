import java.util.Scanner; // Importa a classe Scanner

public class RelatorioNumeros {
    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar os dados
        int somaPares = 0, somaImpares = 0;
        int quantidadePares = 0, quantidadeImpares = 0;
        int numero;

        // Loop para coletar os números
        while (true) {
            System.out.print("Digite um número ou -1 para ver o resultado: ");
            numero = scanner.nextInt(); // Lê o número

            if (numero == -1) { // Verifica se o usuário quer encerrar
                break; // Sai do loop
            }

            // Verifica se o número é par ou ímpar
            if (numero % 2 == 0) { // Se o número é par
                somaPares += numero; // Adiciona à soma dos pares
                quantidadePares++; // Incrementa a quantidade de pares
            } else { // Se o número é ímpar
                somaImpares += numero; // Adiciona à soma dos ímpares
                quantidadeImpares++; // Incrementa a quantidade de ímpares
            }
        }

        // Exibe o relatório dos números pares
        System.out.println("**** Relatório dos Números Pares ****");
        if (quantidadePares > 0) {
            System.out.printf("A quantidade de números pares: %d%n", quantidadePares);
            System.out.printf("A soma dos números pares é: %d%n", somaPares);
            System.out.printf("A média de números pares: %.2f%n", (double) somaPares / quantidadePares);
        } else {
            System.out.println("Nenhum número par foi digitado.");
        }

        // Exibe o relatório dos números ímpares
        System.out.println("**** Relatório dos Números Ímpares ****");
        if (quantidadeImpares > 0) {
            System.out.printf("A quantidade de números ímpares: %d%n", quantidadeImpares);
            System.out.printf("A soma dos números ímpares é: %d%n", somaImpares);
            System.out.printf("A média de números ímpares: %.2f%n", (double) somaImpares / quantidadeImpares);
        } else {
            System.out.println("Nenhum número ímpar foi digitado.");
        }

        // Fecha o scanner
        scanner.close();
    }
}