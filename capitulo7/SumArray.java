// figura 7.5: SumArray.java
// Calculando a soma dos elementos de um array
package capitulo7;


public class SumArray
{
    public static void main(String[] args) {


        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        // adiciona o valor de cada elemnto ao total
        for (int counter = 0; counter < array.length; counter++)
            total += array[counter];

        System.out.printf("Total of array elements: %d%n", total);

    }
}
