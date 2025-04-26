import java.util.Scanner; // Importa a classe Scanner

public class CalculadoraInterativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para leitura de dados
        String operacao; // Variável para armazenar a operação escolhida

        while (true) {
            // Exibe o menu
            System.out.println("********* MENU CALCULADORA **************");
            System.out.println("Digite a opção: + para Adição");
            System.out.println("Digite a opção: - para Subtração");
            System.out.println("Digite a opção: * para Multiplicação");
            System.out.println("Digite 'sair' para encerrar o programa.");
            operacao = scanner.nextLine(); // Lê a operação escolhida

            if (operacao.equals("sair")) {
                break; // Sai do loop se o usuário digitar 'sair'
            }

            // Inicializa a variável para armazenar o resultado
            double resultado = (operacao.equals("-")) ? 0 : 0; // Para subtração, iniciará com 0
            boolean primeiraEntrada = true;

            if (operacao.equals("+")) {
                System.out.println("****** Operação Escolhida: Adição *******");
            } else if (operacao.equals("-")) {
                System.out.println("****** Operação Escolhida: Subtração *******");
                System.out.print("Digite o número ou = para ver o resultado: ");
                resultado = scanner.nextDouble(); // Lê o primeiro número
                primeiraEntrada = false;
                scanner.nextLine(); // Limpa o buffer
            } else if (operacao.equals("*")) {
                System.out.println("****** Operação Escolhida: Multiplicação *******");
            } else {
                System.out.println("Operação inválida. Tente novamente.");
                continue; // Reinicia o loop
            }

            // Loop para receber os números
            while (true) {
                System.out.print("Digite o número ou = para ver o resultado: ");
                String entrada = scanner.nextLine(); // Lê a entrada do usuário

                if (entrada.equals("=")) {
                    break; // Sai do loop se o usuário digitar '='
                }

                double numero = Double.parseDouble(entrada); // Converte a entrada para double

                // Realiza a operação escolhida
                if (operacao.equals("+")) {
                    resultado += numero; // Adiciona o número
                } else if (operacao.equals("-")) {
                    if (primeiraEntrada) {
                        resultado = numero; // Para subtração, o primeiro número é o resultado inicial
                        primeiraEntrada = false;
                    } else {
                        resultado -= numero; // Subtrai o número
                    }
                } else if (operacao.equals("*")) {
                    if (primeiraEntrada) {
                        resultado = 1; // Para multiplicação, inicia com 1
                        primeiraEntrada = false;
                    }
                    resultado *= numero; // Multiplica o número
                }
            }

            // Exibe o resultado da operação
            if (operacao.equals("+")) {
                System.out.printf("O resultado da soma é: %.2f%n", resultado);
            } else if (operacao.equals("-")) {
                System.out.printf("O resultado da subtração é: %.2f%n", resultado);
            } else if (operacao.equals("*")) {
                System.out.printf("O resultado da multiplicação é: %.2f%n", resultado);
            }
        }

        // Fecha o scanner
        scanner.close();
    }
}