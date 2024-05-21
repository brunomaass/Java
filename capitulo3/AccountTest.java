// Figura 3.2: AccountTest.java
// Cria e manipula um objeto Account.

package capitulo3;
import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args)
    {
        // Cria um objeto Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        // Cria um objeto Account e o atribui a myaccount
        Account myAccount = new Account();

        // Exibe o valor inicial do nome (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        // solicita e le o nome
        System.out.println("Please enter the name:");
        String theName = input.nextLine(); // Le uma linha de texto
        myAccount.setName(theName);// insere theName em myAccount
        System.out.println(); // gera saida de uma linha em branco

        // exibe o nome armazenado no objeto myAccount
        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());


    }
}
