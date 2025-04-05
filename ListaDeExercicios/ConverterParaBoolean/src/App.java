public class App {
    public static void main(String[] args) throws Exception {
        // Converta um valor primitivo boolean para um objeto Boolean e exiba o resultado

        /*
         * Opção 1 -> Essa é mais rapida porque você faz a conversão via Casting
         * diretamente na atribuição, logo consome menos memória.
        */
        Boolean objBoolean = (boolean) true;
        System.out.println(objBoolean);

        /*
         *  Opção 2 -> Essa é um pouco mais lenta porque teria que criar uma variável
         *  primitiva do tipo boolean, settar o valor nela e depois "converter" ou seja
         *  atribuir a variável(valor) para o tipo Objeto Boolean(Wrapper).
        */
        boolean varLogica = true;
        Boolean objBoolean2 = varLogica;
        System.out.println(objBoolean2);
    }
}
