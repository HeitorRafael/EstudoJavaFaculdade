public class firstFit {
    public static void main(String[] args) {
        // Cria um array de memória com 10 posições
        int[] memoria = new int[10];
        // Define os tamanhos dos processos a serem alocados
        int[] processos = {250, 50, 100, 120, 350};
        
        // Percorre cada processo tentando alocá-lo na memória
        for (int i = 0; i < processos.length; i++) {
            int processo = processos[i];
            // Busca a primeira posição disponível para o processo
            int posicao = encontrarPosicao(memoria, processo);
            // Se encontrou uma posição válida, aloca o processo
            if (posicao != -1) {
                memoria[posicao] = processo;                
            }
        }
    }   

    private static int encontrarPosicao(int[] memoria, int processo) {
        // Percorre a memória procurando o primeiro espaço livre
        for (int i = 0; i < memoria.length; i++) {
            // Verifica se a posição está vazia (0) e se o processo cabe no espaço
            // O espaço disponível em cada posição é 1000 - i * 100
            if (memoria[i] == 0 && processo <= 1000 - i * 100) {
                return i; // Retorna a primeira posição adequada encontrada
            }
        }
        return -1; // Retorna -1 se não encontrou nenhuma posição adequada
    }
}
