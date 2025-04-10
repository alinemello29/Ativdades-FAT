import javax.swing.JOptionPane;

public class ExibicaoNome {
    public static void main(String[] args) {
        // Solicita ao usuário que digite seu nome
        String nome = JOptionPane.showInputDialog("Digite seu nome:");

        // Exibe a mensagem com o nome informado
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "! Seja bem-vindo!");

        // Exibe um agradecimento final
        JOptionPane.showMessageDialog(null, "Obrigado por usar o programa!");
    }
}