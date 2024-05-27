package capitulo4.exercices;

public class CalculadorComissao
{
    private int item;
    private double valor;
    private double fixo = 200;

    public CalculadorComissao(int item, double valor)
    {
        this.item = item;
        this.valor = valor;
    }

    public void setItem(int item)
    {
        this.item = item;
    }

    public int getItem()
    {
        return item;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }

    public double getValor()
    {
        return valor;
    }

    public double comissao()
    {
        return (valor * 0.09) + fixo;
    }

}
