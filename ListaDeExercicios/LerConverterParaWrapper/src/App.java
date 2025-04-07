import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Leia um valor double, converta para um wrapper Double e exiba o seu valor.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o valor: ");
        double valor = leitor.nextDouble();
        Double objDouble = valor;
        System.out.println("Valor armazenado no Wrapper: " + objDouble);
        leitor.close();
    }
}
