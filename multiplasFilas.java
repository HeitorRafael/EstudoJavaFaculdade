import java.util.LinkedList;
import java.util.Queue;

public class multiplasFilas {
    private Queue<processoMF>[] filas;
    private int quantum; // Quantum padrão para todas as filas

    public multiplasFilas(int quantum) {
        this.quantum = quantum;
        // Inicializando 3 filas (0 = alta, 1 = média, 2 = baixa prioridade)
        filas = new Queue[3];
        for (int i = 0; i < filas.length; i++) {
            filas[i] = new LinkedList<>();
        }
    }

    public void adicionarProcesso(processoMF processo) {
        int prioridade = processo.getPrioridade();
        if (prioridade >= 0 && prioridade < filas.length) {
            filas[prioridade].add(processo);
        } else {
            System.out.println("Prioridade inválida para o processo: " + processo.getId());
        }
    }

    public void escalonar() {
        int tempoTotal = 0;
        boolean processosPendentes = true;

        // Enquanto houver processos em qualquer fila
        while (processosPendentes) {
            processosPendentes = false;

            // Prioridade mais alta para mais baixa
            for (int i = 0; i < filas.length; i++) {
                Queue<processoMF> fila = filas[i];

                if (!fila.isEmpty()) {
                    processosPendentes = true; // Ainda há processos para serem executados
                    processoMF processoAtual = fila.poll();
                    System.out.println("Executando processo: " + processoAtual.getId() + " da fila de prioridade " + i);

                    // Executa o processo com o quantum
                    int tempoExecucao = Math.min(processoAtual.getTempoRestante(), quantum);
                    processoAtual.setTempoRestante(processoAtual.getTempoRestante() - tempoExecucao);
                    tempoTotal += tempoExecucao;

                    System.out.println("Tempo total: " + tempoTotal + ", Tempo restante do processo "
                            + processoAtual.getId() + ": " + processoAtual.getTempoRestante());

                    if (!processoAtual.estaConcluido()) {
                        fila.add(processoAtual); // Reinsere o processo na mesma fila se ainda não terminou
                    } else {
                        System.out.println("Processo " + processoAtual.getId() + " concluído.");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        multiplasFilas escalonador = new multiplasFilas(4); // Quantum de 4 unidades de tempo

        // Adicionando processos com diferentes prioridades
        escalonador.adicionarProcesso(new processoMF("P1", 10, 0, 0)); // Alta prioridade
        escalonador.adicionarProcesso(new processoMF("P2", 6, 1, 1));  // Média prioridade
        escalonador.adicionarProcesso(new processoMF("P3", 8, 2, 2));  // Baixa prioridade

        escalonador.escalonar();
    }
}

