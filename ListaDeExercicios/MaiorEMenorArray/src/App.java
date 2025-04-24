public class App {
    public static void main(String[] args) {
        //  Encontre o maior e o menor valor de um array de inteiros.
        int[] valores = {30, 20, 40, 10};
        int maior = valores[0];
        int menor = valores[0];
        for (int valor : valores) {
            if (valor > valores[0]) {
                maior = valor;
            }
            if (valor < valores[0]) {
                menor = valor;
            }
        }
        System.out.println("Maior valor: "+maior);
        System.out.println("Menor Valor: "+menor);
    }
}
