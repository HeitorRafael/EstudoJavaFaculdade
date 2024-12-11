public class processoMF {
    private String id;
    private int tempoExecucao;
    private int tempoRestante;
    private int tempoChegada;
    private int prioridade; // Indica a fila a qual o processo pertence (0 = alta, 1 = média, 2 = baixa)

    public processoMF(String id, int tempoExecucao, int tempoChegada, int prioridade) {
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
}
