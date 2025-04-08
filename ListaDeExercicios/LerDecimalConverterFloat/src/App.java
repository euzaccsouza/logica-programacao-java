
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Leia um número decimal e converta para um wrapper float.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o número: ");
        double numeroDecimal = leitor.nextDouble();
        Float objFloat = (float) numeroDecimal;
        System.out.printf("O número é: %.2f", objFloat);
        leitor.close();
    }
}
