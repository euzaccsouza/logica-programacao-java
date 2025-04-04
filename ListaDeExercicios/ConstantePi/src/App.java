public class App {
    public static final double PI = 3.14159;
    public static void main(String[] args) throws Exception {
        // Declare uma constante para representar o valor de PI e calcule a área de um círculo.
        double areaDoCirculo;
        int raioDoCirculo = 12;
        areaDoCirculo = PI * (raioDoCirculo*raioDoCirculo);
        
        System.out.printf("A área total do círculo é: %.2f",areaDoCirculo);

    }
}
