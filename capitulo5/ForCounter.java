// Figura 4.2: ForCounter.jav
// Repetição controlda por contador com a instrução de repetição for.
package capitulo5;

public class ForCounter
{
    public static void main(String[] args)
    {
        // o cabeçalho da instrução for inclui inicialização,
        // condição de continuação do loop e incremento
        for (int counter = 1; counter <= 10; counter++)
        {
            System.out.printf("%d ", counter);
        }
        System.out.println();
    }// fim da classe ForCounter
}
