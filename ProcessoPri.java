public class ProcessoPri implements Comparable<ProcessoPri> {
    private String id;
    private int tempoExecucao;
    private int tempoRestante;
    private int tempoChegada;
    private int prioridade; // Quanto menor o valor, maior a prioridade

    public ProcessoPri(String id, int tempoExecucao, int tempoChegada, int prioridade) {
        this.id = id;
        this.tempoExecucao = tempoExecucao;
        this.tempoRestante = tempoExecucao;
        this.tempoChegada = tempoChegada;
        this.prioridade = prioridade;
    }

    public String getId() {
        return id;
    }

    public int getTempoExecucao() {
        return tempoExecucao;
    }

    public int getTempoRestante() {
        return tempoRestante;
    }

    public void setTempoRestante(int tempoRestante) {
        this.tempoRestante = tempoRestante;
    }

    public int getTempoChegada() {
        return tempoChegada;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public boolean estaConcluido() {
        return tempoRestante == 0;
    }

    @Override
    public int compareTo(ProcessoPri outro) {
        // Processos de maior prioridade (menor valor numérico) vêm primeiro
        if (this.prioridade == outro.prioridade) {
            // Desempatar por tempo de chegada
            return Integer.compare(this.tempoChegada, outro.tempoChegada);
        }
        return Integer.compare(this.prioridade, outro.prioridade);
    }
}
