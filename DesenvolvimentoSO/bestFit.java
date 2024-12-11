public class bestFit {
    public static void main(String[] args) {
        // Array de memória com 10 posições
        int[] memoria = new int[10];
        // Array com tamanhos dos processos a serem alocados
        int[] processos = {250, 50, 100, 120, 350}; 

        // Percorre cada processo para tentar alocá-lo na memória
        for (int i = 0; i < processos.length; i++) {
            int processo = processos[i];
            int posicao = encontrarMelhorAjuste(memoria, processo);
            if (posicao != -1) {
                memoria[posicao] = processo;
            }
        }
    }

    private static int encontrarMelhorAjuste(int[] memoria, int processo) {   
        // Armazena a posição do melhor ajuste encontrado
        int melhorPosicao = -1;
        // Armazena o tamanho do menor espaço livre encontrado
        int melhorEspaco = Integer.MAX_VALUE;

        // Procura em todas as posições da memória
        for (int i = 0; i < memoria.length; i++) {
            // Verifica se a posição está livre e se o processo cabe no espaço
            int espacoDisponivel = 1000 - i * 100;
            if (memoria[i] == 0 && processo <= espacoDisponivel) {
                if (espacoDisponivel < melhorEspaco) {
                    melhorEspaco = espacoDisponivel;
                    melhorPosicao = i;
                }
            }
        }
        return melhorPosicao;
    }
}
