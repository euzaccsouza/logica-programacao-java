public class App {
    public static final float TAXA_CAMBIO = 5.62f;
    public static void main(String[] args) throws Exception {
        /*
         * Crie uma constante para armazenar a taxa de conversão de dólares
         * para reais e faça uma conversão
        */
        float dolar = 5000f;
        float real = dolar * TAXA_CAMBIO;
        System.out.printf("O valor convertido em reais é de: %.2f", real);

    }
}
