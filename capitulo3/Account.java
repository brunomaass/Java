// Figura 3.1: Account.java
// Classe Account que contém uma variável de instância name
package capitulo3;

public class Account
{
    private String name; // variável de instância

    // Método para definir o nome no objeto
    public void setName (String name)
    {
        this.name = name; // armazena o nome
    }

    public String getName()
    {
        return name; //retorna valor do nome para o chamador
    }
}
