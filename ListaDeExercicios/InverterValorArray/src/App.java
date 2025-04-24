public class App {
    public static void main(String[] args) {
        //  Inverta elementos de um array.
        int[] valores = {1, 2, 3, 4, 5};
        int[] auxArray = new int[5];
        int aux = 0;
        for (int i = valores.length - 1; i >= 0 ; i--) {
            auxArray[aux] = valores[i];     // Preenche auxArray com os elementos de valores em ordem inversa.
            aux++;      // Incrementa o índice(contador) auxiliar.
        }
        for (int j = 0; j < auxArray.length; j++) {
            valores[j] = auxArray[j];       // Copia os elementos invertidos de volta para o array original.
            System.out.print(valores[j]+" ");
        }


    }
}
