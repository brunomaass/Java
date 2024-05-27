package capitulo4.exercices;
import java.time.temporal.IsoFields;
import java.util.Objects;
import java.util.Scanner;

public class CalculadorComissaoFinal
{
    public static void main(String[] args) {

        CalculadorComissao comissao = new CalculadorComissao(0, 0);

        Scanner input = new Scanner(System.in);
        String teste = "";
        double valor = 0;
        int item = 0;


       while (!teste.equalsIgnoreCase("sair"))
       {
           System.out.println("Digite o valor do item ou 'sair para terminar: ");
           teste = input.nextLine();
           if (!teste.equalsIgnoreCase("sair"))
               comissao.setValor(valor += Double.parseDouble(teste));;
           comissao.setItem(item++);
       }
        System.out.printf("Valor total dos itens: %.2f%n", comissao.getValor());
        System.out.printf("Quantidade de itens: %d%n", comissao.getItem());
        System.out.printf("Valor total da comissão + fixo: %.2f",comissao.comissao());


    }
}
