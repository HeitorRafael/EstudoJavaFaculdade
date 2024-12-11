import java.util.PriorityQueue;

public class AlgoritmoPrioridade {
    private PriorityQueue<ProcessoPri> filaProcessos;

    public AlgoritmoPrioridade() {
        // A fila é uma PriorityQueue que ordena os processos de acordo com sua prioridade
        filaProcessos = new PriorityQueue<>();
    }

    public void adicionarProcesso(ProcessoPri processo) {
        filaProcessos.add(processo);
    }

    public void escalonar() {
        int tempoTotal = 0;

        while (!filaProcessos.isEmpty()) {
            ProcessoPri processoAtual = filaProcessos.poll();

            System.out.println("Executando processo: " + processoAtual.getId()
                    + " com prioridade " + processoAtual.getPrioridade());

            int tempoExecucao = processoAtual.getTempoRestante();
            tempoTotal += tempoExecucao;
            processoAtual.setTempoRestante(0); // O processo é concluído no tempo restante

            System.out.println("Tempo total: " + tempoTotal + ", Processo "
                    + processoAtual.getId() + " concluído.");
        }
    }

    public static void main(String[] args) {
        AlgoritmoPrioridade escalonador = new AlgoritmoPrioridade();

        // Adicionando processos com diferentes prioridades
        escalonador.adicionarProcesso(new ProcessoPri("P1", 10, 0, 2)); // Prioridade 2
        escalonador.adicionarProcesso(new ProcessoPri("P2", 5, 1, 1));  // Prioridade 1 (mais alta)
        escalonador.adicionarProcesso(new ProcessoPri("P3", 8, 2, 3));  // Prioridade 3

        escalonador.escalonar();
    }
}
