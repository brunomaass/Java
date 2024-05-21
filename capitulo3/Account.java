// Figura 3.1: Account.java
// Classe Account que contém uma variável de instância name
package capitulo3;

public class Account
{
    private String name; // variável de instância
    private double balance; // variável de insância

    // Contrutor inicializa sempre com o mesmo nome da classe
    public Account(String name, double balance)// contrutor com 2 parametros
    {
        this.name = name;

        // valida que o balance é maior que 0.0
        // se não for atribui o valor padrão 0.0
        if (balance > 0)
            this.balance = balance;
    }

    // método que deposita (adiciona) apenas uma quantia válida de saldo
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    // método que retorna o saldo da conta
    public double getBalance()
    {
        return balance;
    }

    // Método para definir o nome no objeto
    public void setName (String name)
    {
        this.name = name; // armazena o nome
    }

    // método que retorna o nome para o chamador
    public String getName()
    {
        return name; //retorna valor do nome para o chamador
    }
}
