package capitulo3.exercicios;

public class HeartHates
{
    private String firstName;
    private String lastName;
    private int yearBirth;
    private int monthBirth;
    private int dayBirth;

    // contrutor da classe com parametros
    public HeartHates(String firstName, String lastName, int yearBirth, int monthBirth, int dayBirth)
    {
     this.firstName = firstName;
     this.lastName = lastName;
     this.yearBirth = yearBirth;
     this.monthBirth = monthBirth;
     this.dayBirth = dayBirth;
    }

    // recebe o primeiro nome e atribui à variavel
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    // retorna o primeiro nome para o chamador
    public String getFirstName()
    {
        return firstName;
    }
    // recebe o segundo nome e atribui à variavel
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    // retorna o segundo nome para o chamador
    public String getLastName()
    {
        return lastName;
    }
    // recebe o ano do aniversário
    public void setYearBirth(int yearBirth)
    {
        this. yearBirth= yearBirth;
    }
    // retorna o mes no
    public int getYearBirth() {
        return yearBirth;
    }
    // recebe o mes do nacimento
    public void setMonthBirth(int monthBirth) {
        this.monthBirth = monthBirth;
    }
    // retorna o ano do aniversário
    public int getMonthBirth() {
        return monthBirth;
    }
    // recebe a data de aniversário
    public void setDayBirth(int dayBirth) {
        this.dayBirth = dayBirth;
    }
    // retorna o dia do aniversário
    public int getDayBirth() {
        return dayBirth;
    }
    // clcula a idade em anos
    public int calcAge()
    {

        return (this.yearBirth - 2024) * -1;
    }
    // calcula a frequencia cardíaca
    public int calcMaxHeathFrequency()
    {
        return 220 - calcAge();
    }
    // caclcula o valor mínimo do intervalo da frequencia ideal
    public double minIdealFrequency()
    {
        return calcMaxHeathFrequency() * 0.5;
    }
    // calcula o valor maximo do intervalo da frequencia cardiaca ideal.
    public double maxIdealFrequency()
    {
        return calcMaxHeathFrequency() * 0.85;
    }

}
