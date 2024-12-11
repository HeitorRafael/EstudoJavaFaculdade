public class worstFit {
    public static void main(String[] args) {
        // Cria um array de memória com 10 posições
        int[] memoria = new int[10];
        // Define os tamanhos dos processos a serem alocados
        int[] processos = {250, 50, 100, 120, 350};

        // Percorre cada processo tentando alocá-lo na memória
        for (int i = 0; i < processos.length; i++) {
            int processo = processos[i];
            // Busca a posição com o maior espaço disponível (pior ajuste)
            int posicao = encontrarPiorAjuste(memoria, processo);
            // Se encontrou uma posição válida, aloca o processo
            if (posicao != -1) {
                memoria[posicao] = processo;
            }
        }   
    }       

    private static int encontrarPiorAjuste(int[] memoria, int processo) {
        // Armazena a posição do pior ajuste encontrado
        int piorPosicao = -1;
        // Armazena o maior espaço livre encontrado
        int piorEspaco = -1;

        // Percorre todas as posições da memória
        for (int i = 0; i < memoria.length; i++) {
            // Calcula o espaço disponível na posição atual
            // O espaço total é 1000 - i * 100, subtraindo o tamanho do processo já alocado
            int espacoDisponivel = 1000 - i * 100 - memoria[i];
            // Verifica se a posição está vazia, se o processo cabe e se é o maior espaço encontrado até agora
            if (memoria[i] == 0 && processo <= espacoDisponivel && espacoDisponivel > piorEspaco) {
                piorPosicao = i;      // Atualiza a posição do pior ajuste
                piorEspaco = espacoDisponivel;  // Atualiza o maior espaço encontrado
            }
        }
        return piorPosicao; // Retorna a posição com o maior espaço (-1 se não encontrou)
    }   
}
