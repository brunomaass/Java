
//Figura 4.8: ClassAverage.java
// Resolvendo o problema da média da classe usando a repetição controlada
package capitulo4;
import java.util.Scanner;

public class ClassAverage
{
    public static void main(String[] args)
    {
        // cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        //fase de inicialização
        int total = 0; // inicia as notas inseridas pelo usuário
        int gradeCounter = 0; // inicializa nº da nota a se inserida em seguida

        // fase de prccessamento utiliza repetição controlada por contador
        // solicita a primeira entrada e lê a nota do usuário
        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();

        //faz um loop até ler o valor de sentinela inserido pelo usuário
        while (grade != -1)
        {
            total = total + grade; // adiciona grade ao total
            gradeCounter = gradeCounter + 1; // incrementa o contador por 1

            System.out.print("Enter grade or -1 to quit : "); // prompt
            grade = input.nextInt(); // insere a proxima nota
        }

        // fase de término
        // se usuário inseriu pelo menos uma nota...
        if (gradeCounter != 0) {

            // usa número com ponto decimal para calcular a média das notas
            double average = (double) total / gradeCounter;
            // exibe o total e a média das notas
            System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is: %.2f%n", average);
        }
        else //nenhuma nota foi inserida, assim gera a saída da mensagem apropriada
            System.out.println("No grades were entered");


    }
}
