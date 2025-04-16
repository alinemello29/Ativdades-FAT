import java.util.Scanner; // Importa a classe Scanner

public class MediaNotas {
    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);
        
        double soma = 0; // Inicializa a soma das notas
        int contador = 0; // Inicializa o contador de notas

        int nota; // Variável para armazenar a nota informada

        // Loop do...while para ler as notas
        do {
            System.out.print("Digite a nota ou -1 para ver a média: ");
            nota = scanner.nextInt(); // Lê a nota

            if (nota != -1) { // Verifica se a nota não é -1
                soma += nota; // Adiciona a nota à soma
                contador++; // Incrementa o contador
            }
        } while (nota != -1); // Continua até que o usuário digite -1

        // Exibe os resultados
        if (contador > 0) { // Verifica se foram digitadas notas
            System.out.println("**** Calculando a Média *****");
            System.out.printf("Total de notas digitadas: %d%n", contador);
            System.out.printf("A média de notas é: %.2f%n", soma / contador); // Calcula e exibe a média
        } else {
            System.out.println("Nenhuma nota foi digitada.");
        }

        // Fecha o scanner
        scanner.close();
    }
}