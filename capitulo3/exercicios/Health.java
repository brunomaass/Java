package capitulo3.exercicios;
import java.util.Scanner;

public class Health
{
    public static void main(String[] args) {
        // inicia o scanner
        Scanner input = new Scanner(System.in);

        HeartHates health = new HeartHates("", "", 0, 0, 0);

        // recebe entrada do usuário
        System.out.println("Please type your first name: ");
        health.setFirstName(input.nextLine());
        System.out.println("Please type your last name: ");
        health.setLastName(input.nextLine());
        System.out.println("Please enter the year of your birth: ");
        health.setYearBirth(input.nextInt());
        System.out.println("Please enter the month of your birth: ");
        health.setMonthBirth(input.nextInt());
        System.out.println("Please enter the day of your birth: ");
        health.setDayBirth(input.nextInt());

        // Saída dos dados
        System.out.printf("Hello %s %s%n", health.getFirstName(), health.getLastName());
        System.out.printf("Your birth date is: %d/%d/%d%n", health.getDayBirth(), health.getMonthBirth(), health.getYearBirth());
        System.out.printf("Your age is %d years old.%n", health.calcAge());
        System.out.printf("Your max hearth frequency is %d%n", health.calcMaxHeathFrequency());
        System.out.printf("Your ideal hearth frequency is something between of: %.2f and %.2f%n", health.minIdealFrequency(), health.maxIdealFrequency());

    }
}
