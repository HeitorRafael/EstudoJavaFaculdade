public class processoRR {
    private String id;
    private int tempoExecucao;
    private int tempoRestante;
    private int tempoChegada;

    public processoRR(String id, int tempoExecucao, int tempoChegada) {
        this.id = id;
        this.tempoExecucao = tempoExecucao;
        this.tempoRestante = tempoExecucao;
        this.tempoChegada = tempoChegada;
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

    public boolean estaConcluido() {
        return tempoRestante == 0;
    }
}
