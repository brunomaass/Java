// Figura 4.19: draw PanelTest.java
// Criando Jframe para exibir um DrawPanel.
package capitulo4;
import javax.swing.JFrame;

public class DrawPanelTest
{
    public static void main(String[] args)
    {
        // cria um painel que contém nosso desenho
        DrawPanel panel = new DrawPanel();

        // cria um novo quadro para armazenar o painel
        JFrame application = new JFrame();

        // configura o frame para ser encerrado quando ele é fechado
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel); // adiciona o painel ao frame
        application.setSize(500, 500); // configura o tamanho do frame
        application.setVisible(true); // torna o frame visivel

    }

}// fim da classe DrwPanelTest
