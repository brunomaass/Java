// Figura 3.2: AccountTest.java
// Cria e manipula um objeto Account.

package capitulo3;
import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Cria dois objetos Account
        Account account1 = new Account("Bruno Maass", 5);
        Account account2 = new Account("Polyane Maass", -366);

        // Exibe o valor inicial de para cada Account e o saldo
        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("The initial account1 balance is: %s%n", account1.getBalance());
        System.out.printf("account2 name is: %s%n", account2.getName());
        System.out.printf("The initial account2 balance is: %s%n%n", account2.getBalance());

        // deposita na account1
        System.out.println("Enter the valor of deposit of account1: ");
        double depositAmount = input.nextDouble(); // obtem a entrada do usuário
        System.out.printf("%nAdditing %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // adiciona o saldo de account

        // exibe os saldos
        System.out.printf("The account1 balance is: %s%n", account1.getBalance());
        System.out.printf("The account2 balance is: %s%n%n", account2.getBalance());

        // deposita na account2
        System.out.println("Enter the valor of deposit of account2: ");
        depositAmount = input.nextDouble(); // obtem a entrada do usuário
        System.out.printf("%nAdditing %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // adiciona o saldo de account

        // exibe o saldo atualizado
        System.out.printf("The account1 balance is: %s%n", account1.getBalance());
        System.out.printf("The account2 balance is: %s%n%n", account2.getBalance());

    }
}
