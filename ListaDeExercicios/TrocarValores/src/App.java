public class App {
    public static void main(String[] args) throws Exception {
        // Troque os valores de duas variáveis inteiras sem usar uma variável auxiliar.
        int primeiroValor = 25;
        int segundoValor = 33;

        System.out.println("Primeiro Valor Informado: " + primeiroValor); // 25
        System.out.println("Segundo Valor Informado: "+ segundoValor); // 33

        segundoValor = primeiroValor + segundoValor; 
        primeiroValor = segundoValor - primeiroValor;
        System.out.println("Primeiro Valor Final: " + primeiroValor); //33
        segundoValor = segundoValor - primeiroValor;
        System.out.println("Segundo Valor Final: "+ segundoValor); //25
    }    
}
