// figura 4.18: DrawPanel.java
// Utilizando DrwLine para conectar os cantos de um painel
package capitulo4;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
    public void paintComponent(Graphics g)
    {
        // chama paintComponent para assegurar que o painel é exibido corretamente
        super.paintComponent(g);

        int width = getWidth(); // largura total
        int height = getHeight(); // altura total

        int count = 0;
        int x = 0;
        int y = 0;

        while (count < 15)
        {

            // desenha uma linha a partir do canto superior esquerdo até o inferior direito
            g.drawLine(0, y, width, height);

            // desenha uma linha a partir do canto inferior esquerdo até o superior direito
            g.drawLine(width, height, x, 0);
            count++;
            x = x + 50;
            y = y + 50;

        }
    }
}// fim da classe DrawPanel
