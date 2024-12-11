import java.util.Scanner;

public class escalonadoresPrioridade {
//- Definido pelo usurário, tendo como prioridade as
// prioridades que o usuário decidiu.(Não preemptivo)
public static void main(String[] args) {
    int process1 = 18;
    int process2 = 1300;
    int process3 = 80;
    int process4 = 125;
    int process5 = 12;
    int[] arrayProcess = {process1, process2, process3, process4, process5};

    System.out.println("Com os seguintes processos:\n Processo 1 :" + process1 +"\n Processo 2 :" + process2 +"\n Processo 3 :" + process3 +"\n Processo 4 :" + process4 +"\n Processo 5 :" + process5);


    System.out.println("Em qual ordem devem ocorrer?");
    Scanner sc = new Scanner(System.in);
    int[] response = new int [5];
    for (int i = 1; i <= 5 ; i++) {
        if (sc.nextInt() > 0 && sc.nextInt() < 6) {
            response[i] = sc.nextInt();
        } else {
            System.out.println("Ordem inexistente!!");
            i--;
        }
    }
}

}
