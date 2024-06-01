package capitulo4.exercicios;
import java.util.Scanner;

public class CalculaCombustivel
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        CalculaMediaCombustivel media = new CalculaMediaCombustivel(0,0);

        System.out.print("Please enter the distance: ");
        media.setDistancia(input.nextInt());
        System.out.print("Please enter amount of fuel: ");
        media.setQuantCombustivel(input.nextInt());

        System.out.printf("For distance %d you have used %d liters of fuel. %n", media.getDistancia(), media.getQuantCombustivel());
        System.out.printf("The average of fuel is: %.2f ", media.calculadorMedia());
    }
}
