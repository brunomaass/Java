// Figura 7.2: IntArray.java
// Inicializando os elementos de um array como valores padrão de zero
package capitulo7;

public class IntArray
{
    public static void main(String[] args)
    {

        // A lista de inicializador especifica o valor inicial de cada elemento
        int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

        System.out.printf("%s%8s%n", "Index", "Value"); // titulo de coluna

        // gera saida do valor de cada elemento do array
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }
}
