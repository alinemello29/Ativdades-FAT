import java.util.Scanner;

public class RelatorioFinal {
    public static void main(String[] args) {
        // Cria um objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        String nomeAluno, nomeProfessor, nomeDisciplina;
        double notaA1, notaA2, media;

        // Solicita ao usuário as informações
        System.out.print("Digite o nome do aluno: ");
        nomeAluno = scanner.nextLine(); // Lê o nome do aluno

        System.out.print("Digite o nome do professor: ");
        nomeProfessor = scanner.nextLine(); // Lê o nome do professor

        System.out.print("Digite o nome da disciplina: ");
        nomeDisciplina = scanner.nextLine(); // Lê o nome da disciplina

        System.out.print("Digite o valor da primeira nota: ");
        notaA1 = scanner.nextDouble(); // Lê a primeira nota

        System.out.print("Digite o valor da segunda nota: ");
        notaA2 = scanner.nextDouble(); // Lê a segunda nota

        // Calcula a média
        media = (notaA1 + notaA2) / 2;

        // Exibe o relatório final
        System.out.println("************RELATÓRIO FINAL*******");
        System.out.println("Nome d(o/a) Alun(o/a): " + nomeAluno);
        System.out.println("Nome d(o/a) Professor(a): " + nomeProfessor);
        System.out.println("Nome da Disciplina: " + nomeDisciplina);
        System.out.println("Nota A1: " + notaA1);
        System.out.println("Nota A2: " + notaA2);
        System.out.println("Média: " + media);
        System.out.println("************FIM DO RELATÓRIO*******");

        // Fecha o scanner
        scanner.close();
    }
}