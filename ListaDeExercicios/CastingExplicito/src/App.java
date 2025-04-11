public class App {
    public static void main(String[] args) throws Exception {
        // Realize um casting explícito de double para int e mostre a perda de precisão.
        double valorDouble = 324.45;
        int valorInt = (int) valorDouble;
        System.out.println("Valor informado: "+ valorDouble); // Valor Informado
        System.out.println("Valor Pós conversão: " + valorInt); // Valor que ficou depois da conversão
        System.out.println("Valor Perdido na conversão:" + (valorDouble-valorInt)); // Valor que foi perdido pós conversão.
    }
}
