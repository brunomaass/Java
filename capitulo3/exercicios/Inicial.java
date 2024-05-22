package capitulo3.exercicios;
import java.util.Scanner;

public class Inicial {
    public static void main(String[] args) {
        HealthProfile profile = new HealthProfile("", "", "", 0, 0,
                0, 0, 0);

        // Iniciando scanner
        Scanner input = new Scanner(System.in);

        // Entrando com os dados do usuário
        System.out.println("Digite seu primeiro nome:");
        profile.setName(input.nextLine());

        System.out.println("Digite se sobrenome:");
        profile.setLastName(input.nextLine());

        System.out.println("Digite seu sexo (masculino ou feminino):");
        profile.setSex(input.nextLine());

        System.out.println("Digite o dia do seu nascimento: ");
        profile.setDayBirth(input.nextInt());

        System.out.println("Digite o mes do seu nascimento: ");
        profile.setMonthBirth(input.nextInt());

        System.out.println("Digite o ano do seu nascimento: ");
        profile.setYearBirth(input.nextInt());

        System.out.println("Digite a sua altura em metros:");
        profile.setHeight(input.nextDouble());

        System.out.println("Digite o seu peso em quilos: ");
        profile.setWeight(input.nextInt());

        // Saida dos dados
        System.out.printf("%nNome completo: %s %s%n", profile.getName(), profile.getLastName());
        System.out.printf("Idade em anos: %d%n", profile.calcAge());
        System.out.printf("Sexo: %s%n", profile.getSex());
        System.out.printf("Sua frequência cardíaca máxima é: %d%n", profile.calcMaxHeathFrequency());
        System.out.printf("Sua frequência cardiaca ideal é entre: %.2f e %.2f%n", profile.minIdealFrequency(), profile.maxIdealFrequency());
        System.out.printf("Seu IMC é %.2f%n%n", profile.calcImc());
        System.out.println("---------------------------------------");
        System.out.printf("%s", profile.tableImc());

    }
}
