package capitulo3.exercicios;

public class HealthProfile
{
    private String name;
    private String lastName;
    private String sex;
    private int yearBirth;
    private int monthBirth;
    private int dayBirth;
    private double height;
    private int weight;

    // Contrutor
    public HealthProfile(String name, String lastName, String sex, int yearBirth, int monthBirth, int dayBirth,
                         int height, int weight)
    {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.yearBirth =yearBirth;
        this.monthBirth = monthBirth;
        this.dayBirth = dayBirth;
        this.height = height;
        this.weight = weight;
    }


    // sets and gets -- name
    public void setName(String name)
    {
        this.name = name;
    }


    public String getName()
    {
        return name;
    }


    // set and get -- lastName
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }


    public String getLastName()
    {
        return lastName;
    }


    // set and get -- sex
    public void setSex(String sex)
    {
        this.sex = sex;
    }


    public String getSex()
    {
        return sex;
    }


    // set and get -- yearBirth
    public void setYearBirth(int yearBirth)
    {
        this.yearBirth = yearBirth;
    }


    public int getYearBirth()
    {
        return yearBirth;
    }


    // set and get -- monthBirth
    public void setMonthBirth(int monthBirth)
    {
        this.monthBirth = monthBirth;
    }


    public int getMonthBirth()
    {
        return monthBirth;
    }


    // set and get -- dayBirth
    public void setDayBirth(int dayBirth)
    {
        this.dayBirth = dayBirth;
    }


    public int getDayBirth()
    {
        return dayBirth;
    }


    // set and get -- height
    public void setHeight(double height)
    {
        this.height = height;
    }


    public double getHeight()
    {
        return height;
    }


    // set and get -- weight
    public void setWeight(int weight)
    {
        this.weight = weight;
    }


    public int getWeight()
    {
        return weight;
    }


    // Calcula idade em anos
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


    // Calcula IMC
    public double calcImc()
    {
        return weight / (height * height);
    }


    // Tabela Imc
    public  String tableImc()
    {
       String imc = "BMI VALUES\n";
       String underweight = "Underweight:  less than 18,5\n";
       String normal = "Normal:       between 18,5 and 24,9\n";
       String overweight = "Overweight:   between 25 adn 29,9\n";
       String obese = "Obese =       30 or greater\n";

       return imc + underweight + normal + overweight + obese;

    }
}
