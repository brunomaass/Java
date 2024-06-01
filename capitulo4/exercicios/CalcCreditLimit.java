package capitulo4.exercicios;
import java.util.Scanner;

public class CalcCreditLimit
{

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        CreditLimit credit = new CreditLimit(0, 0, 0, 0,
                0);

        System.out.print("Número da conta: ");
        credit.setNumeroDaConta(input.nextInt());
        System.out.print("Saldo inicial: ");
        credit.setSaldoInicial(input.nextDouble());
        System.out.print("Creditos extras: ");
        credit.setTotalCreditosAplicados(input.nextDouble());
        System.out.print("Limite de crédito: ");
        credit.setLimiteDeCredito(input.nextDouble());
        System.out.print("Total de despesas: ");
        credit.setTotalItensCobrados(input.nextDouble());


        System.out.printf("%nConta: %d", credit.getNumeroDaConta());
        System.out.printf("%nSaldo inicial: %.2f", credit.getSaldoInicial());
        System.out.printf("%nDespesas: %.2f", credit.getTotalItensCobrados());
        System.out.printf("%nCréditos extras: %.2f", credit.getTotalCreditosAplicados());
        System.out.printf("%nLimite de crédito: %.2f%n", credit.getLimiteDeCredito());

        System.out.printf("Status limite: %s", credit.getCalculaLimite());


    }
}
