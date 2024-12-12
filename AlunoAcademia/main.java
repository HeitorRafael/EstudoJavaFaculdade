package AlunoAcademia;

public class main {
    public static void main(String[] args) {
        // Locale.setDefault(Locale.US);

        alunoAcademia A = new alunoAcademia();
        alunoBolsa B = new alunoBolsa();
        alunoSpin C = new alunoSpin();

        A.set_nome("Heitor");
        A.set_qtModalidade(10);
        A.set_valorModalidade(200.00F);
        B.set_nome("Heitor");
        B.set_qtModalidade(10);
        B.set_valorModalidade(200.00F);
        B.set_percentual(10.00F);
        C.set_nome("Heitor");
        C.set_qtModalidade(10);
        C.set_valorModalidade(200.00F);
        C.set_sessoes(20);
        C.set_valorSessao(15);

        System.out.printf("Aluno Padrão:%nNome: %s%nValor da mensalidade: %.2f%n%n", A.get_nome(), A.get_mensalidade());
        System.out.printf("Aluno Bolsista:%nNome: %s%nPercentual de desconto: %.2f%nValor da mensalidade: %.2f%n%n",
                B.get_nome(), B.get_percentual(), B.get_mensalidade());
        System.out.printf(
                "Aluno Spinning:%nNome: %s%nQuantidade de sessões: %d%nValor de cada sessao: %.2f%nValor da mensalidade: %.2f%n%n",
                C.get_nome(), C.get_sessoes(), C.get_valorSessao(), C.get_mensalidade());
    }
}
