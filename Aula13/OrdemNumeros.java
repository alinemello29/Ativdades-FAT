import java.util.Scanner; // Importa a classe Scanner

public class OrdemNumeros {
    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário os limites
        System.out.print("Informe o Limite Mínimo: ");
        int limiteMinimo = scanner.nextInt(); // Lê o limite mínimo

        System.out.print("Informe o Limite Máximo: ");
        int limiteMaximo = scanner.nextInt(); // Lê o limite máximo

        // Exibe a ordem crescente
        System.out.println("***** ORDEM CRESCENTE **** ENTRE: " + limiteMinimo + " até " + limiteMaximo);
        for (int i = limiteMinimo; i <= limiteMaximo; i++) {
            System.out.println(i); // Imprime cada número na ordem crescente
        }

        // Exibe a ordem decrescente
        System.out.println("***** ORDEM DECRESCENTE **** ENTRE: " + limiteMaximo + " até " + limiteMinimo);
        for (int i = limiteMaximo; i >= limiteMinimo; i--) {
            System.out.println(i); // Imprime cada número na ordem decrescente
        }

        // Fecha o scanner
        scanner.close();
    }
}