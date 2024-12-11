import java.util.LinkedList;
import java.util.Queue;

public class roundRobin {
    private Queue<processoRR> filaProcessos;
    private int quantum;

    public roundRobin(int quantum) {
        this.quantum = quantum;
        this.filaProcessos = new LinkedList<>();
    }

    public void adicionarProcesso(processoRR processo) {
        filaProcessos.add(processo);
    }

    public void escalonar() {
        int tempoTotal = 0;
        while (!filaProcessos.isEmpty()) {
            processoRR processoAtual = filaProcessos.poll();

            System.out.println("Executando processo: " + processoAtual.getId());

            int tempoExecucao = Math.min(processoAtual.getTempoRestante(), quantum);
            processoAtual.setTempoRestante(processoAtual.getTempoRestante() - tempoExecucao);
            tempoTotal += tempoExecucao;

            System.out.println("Tempo total: " + tempoTotal + ", Tempo restante do processo "
                    + processoAtual.getId() + ": " + processoAtual.getTempoRestante());

            if (!processoAtual.estaConcluido()) {
                filaProcessos.add(processoAtual);
            } else {
                System.out.println("Processo " + processoAtual.getId() + " concluído.");
            }
        }
    }

    public static void main(String[] args) {
        roundRobin escalonador = new roundRobin(4); // Quantum de 4 unidades de tempo

        escalonador.adicionarProcesso(new processoRR("P1", 10, 0));
        escalonador.adicionarProcesso(new processoRR("P2", 6, 1));
        escalonador.adicionarProcesso(new processoRR("P3", 8, 2));

        escalonador.escalonar();
    }
}
