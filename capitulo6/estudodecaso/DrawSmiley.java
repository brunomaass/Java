// Figura 6.11: DrawSmile.java
// Desenhando um rosto sorridente com cores e formas preenchidas
package capitulo6.estudodecaso;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class DrawSmiley extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        // desenha o rosto
        g.setColor(Color.yellow);
        g.fillOval(10, 10, 200, 200);

        // desenha os olhos
        g.setColor(Color.black);
        g.fillOval(55,65,30,30);
        g.fillOval(135,65,30,30);

        // desenha a boca
        g.fillOval(50,110,120,60);

        // "retoca" a boca para criar um sorriso
        g.setColor(Color.YELLOW);
        g.fillRect(50,110,120,30);
        g.fillOval(50,120,120,40);
    }// fim da classe DrawSmiley
}
