package capitulo4.exercicios;

public class CalculaMediaCombustivel
{
    private int distancia;
    private int quantCombustivel;

    CalculaMediaCombustivel(int distancia, int quantCombustivel)
    {
        this.distancia = distancia;
        this.quantCombustivel = quantCombustivel;
    }

    public void setDistancia(int distancia)
    {
        this.distancia = distancia;
    }

    public int getDistancia()
    {
        return distancia;
    }

    public void setQuantCombustivel(int quantCombustivel)
    {
        this.quantCombustivel = quantCombustivel;
    }

    public int getQuantCombustivel()
    {
        return quantCombustivel;
    }

    public double calculadorMedia()
    {
        return (double) distancia / quantCombustivel;
    }
}
