// Figura 3.13: NameDialog.java
// Obtendo a entrada de usuário a partir de um diálogo.
package capitulo3;
import javax.swing.JOptionPane;

public class NameDialog
{
    public static void main(String[] args) {
        // Pede par o usuário inserir seu nome
        String name = JOptionPane.showInputDialog("What is your name?");

        // cria a mensagem
        String message = String.format("Welcome, %s, to Java Programing", name);

        // exibe a mensagem para cumprimentar o usuário pelo nome
        JOptionPane.showMessageDialog(null, message);
    }
}
