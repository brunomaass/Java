// Figura 6.12: DrawnSmiley.java
// Aplicativo de teste que exibe um rosto sorridente
package capitulo6.estudodecaso;
import javax.swing.JFrame;

public class DrawSmileyTest
{
    public static void main(String[] args)
    {
        DrawSmiley panel = new DrawSmiley();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(230,250);
        application.setVisible(true);
    }
}
