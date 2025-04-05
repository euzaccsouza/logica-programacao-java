import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Leia um número decimal e mostre a metade desse valor informado.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o valor: ");
        float valorDecimal = leitor.nextFloat();
        valorDecimal = valorDecimal/2;
        System.out.println("A metade do valor é: " + valorDecimal);
        leitor.close();
    }
}
