public class App {
    public static void main(String[] args) throws Exception {
        // Declare um tipo byte e short, atribua valores e exiba no console.
        
        byte microValor = 127; //Atribuido o valor Max suportado por uma variável desse tipo.
        short menorValor = 32767; //Atribuido o valor Max suportado por uma variável desse tipo.

        System.out.println("O valor Max suportado é de: " + microValor);
        System.out.println("O valor Max suportado é de: " + menorValor);
    }
}
