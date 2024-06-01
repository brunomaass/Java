package capitulo4.exercicios;

public class CreditLimit
{
    private int numeroDaConta;
    private double saldoInicial;
    private double totalItensCobrados;
    private double totalCreditosAplicados;
    private double limiteDeCredito;
    private double totalFinal;


    public CreditLimit(int numeroDaConta, double saldoInicial, double totalItensCobrados, double totalCreditosAplicados,
                       double limiteDeCredito)
    {
        this.numeroDaConta = numeroDaConta;
        this.saldoInicial = saldoInicial;
        this.totalItensCobrados = totalItensCobrados;
        this. totalCreditosAplicados = totalCreditosAplicados;
        this.limiteDeCredito = limiteDeCredito;
    }

    public void setNumeroDaConta(int numeroDaConta)
    {
        this.numeroDaConta = numeroDaConta;
    }

    public int getNumeroDaConta()
    {
        return numeroDaConta;
    }

    public void setSaldoInicial(double saldoInicial)
    {
        this.saldoInicial = saldoInicial;
    }

    public double getSaldoInicial()
    {
        return saldoInicial;
    }

    public void setTotalItensCobrados(double itensCobrados)
    {
        this.totalItensCobrados = itensCobrados;
    }

    public double getTotalItensCobrados()
    {
        return totalItensCobrados;
    }

    public void setTotalCreditosAplicados(double creditosAplicados)
    {
        this.totalCreditosAplicados = creditosAplicados;
    }

    public double getTotalCreditosAplicados()
    {
        return totalCreditosAplicados;
    }

    public void setLimiteDeCredito(double limiteDeCredito)
    {
        this.limiteDeCredito = limiteDeCredito;
    }

    public double getLimiteDeCredito()
    {

        return limiteDeCredito;
    }

    public String getCalculaLimite() {

        totalFinal = saldoInicial + limiteDeCredito  + totalCreditosAplicados;
        return (totalFinal < totalItensCobrados) ? "Limite de crédito excedito" : "conta ok";
    }

}
