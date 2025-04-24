public class App {
    public static void main(String[] args) {
        // Estrutura de Repetição For Each -> Sintaxe
        /*
        * É uma estrutura de iteração derivada da Estrutura FOR,
        * geralmente é utilizada para percorrer a cada iteração
        * item a item de uma array.
        */
        String[] nomes = {"Zaqueu", "João", "Pedro"};
        for(String nome : nomes){
            System.out.printf("Nomes: %s \n", nome);
        }
    }
}
