import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class escalonadoresSFJ {
    //- Escolhe o MENOR TEMPO DE ESPERA mínimo (não preemptivo)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de processos: ");
        int numProcess = sc.nextInt();
        int[] timeProcess = new int[numProcess];

        for (int i = 0; i <numProcess ; i++) {
            System.out.println("Tempo do processo numero: " + (i+1));
            timeProcess[i] = sc.nextInt();
        }

        System.out.println("PROCESSOS A SEREM FEITOS");
        for (int i = 0; i < numProcess; i++) {
            System.out.println("Precesso numero " + (i+1) + " Tempo: " + timeProcess[i]);

        }
        System.out.println();


        Arrays.sort(timeProcess);
        System.out.println("PROCESSOS REORGANIZADOS");
        for (int i = 0; i <numProcess ; i++) {
            System.out.println("Precesso numero " + (i+1) + " Tempo: " + timeProcess[i]);
        }
    }
}
