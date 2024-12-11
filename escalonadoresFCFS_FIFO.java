import java.util.Scanner;
//FIFO primeiro que entra primeiro que sai (não preemptivo)
public class escalonadoresFCFS_FIFO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos processos: ");
        int numProcess = sc.nextInt();
        int[] TempoProcessos = new int[numProcess];
        // os tempos de cada processo
        for (int i = 0; i <numProcess ; i++) {
            System.out.println("Digite o tempo do processo " + (i+1) + ": ");
            TempoProcessos [i] = sc.nextInt();

        }

        for (int i = 0; i <numProcess ; i++) {
            System.out.println("O processo numero " + (i+1) +" gastou " + TempoProcessos[i]);
        }

    }
}
