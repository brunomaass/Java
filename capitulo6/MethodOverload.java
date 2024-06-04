// Figura 6.10: MethodOverload.java
// Declarações de métodos sobrecarregados
package capitulo6;

public class MethodOverload
{
    public static void main(String[] args)
    {
        // teste de méthods square sobrecarregados
        System.out.printf("Square of integer 7 is %d%n", square(7));
        System.out.printf("Square of double 7.5 is %f%n", square(7.5));
    }

    // método square com argumento de int
    public static int square(int intValue)
    {
        System.out.printf("%nCalled square with int argument: %d%n", intValue);
        return intValue * intValue;
    }

    // método square com argumento double
    public static double square(double doubleValue)
    {
        System.out.printf("%nCalled square with double argument", doubleValue);
        return doubleValue * doubleValue;
    }
}
