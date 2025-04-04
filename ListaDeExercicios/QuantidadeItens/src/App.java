public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Declare uma variável para armazenar a quantidade de itens em um
         * estoque e exiba seu valor inicial, depois atualize com uma nova 
         * quantidade e exiba novamente.
        */

        int qtItensEstoque = 20;
        System.out.println("Quantidade de itens no estoque atual: " + qtItensEstoque);
        qtItensEstoque = 1000;
        System.out.println("O estoque foi renovado: " + qtItensEstoque);

    }
}
