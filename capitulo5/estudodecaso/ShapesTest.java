// Figura 5.28: ShapeTest.java
// Obtendo a entrada de usuário e criando um JFrame para exibir Shapes
package capitulo5.estudodecaso;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
;


public class ShapesTest
{
    public static void main(String[] args)
    {
        // obtém a escolha do usuário
        String input = JOptionPane.showInputDialog(
                "Enter 1 to draw rectangles\n" +
                "Enter 2 to drawn ovals");

        int choice = Integer.parseInt(input); // converte a entrada em int

        // cria o painel com a entrada do usuário
        Shapes panel = new Shapes(choice);

        JFrame application = new JFrame(); // cria um novo frame

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300,300);
        application.setVisible(true);

    }
}
