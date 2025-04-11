
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Crie um programa que calcule a raiz quadrada de um número usando a classe Math.
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        int valorRaiz = ler.nextInt();
        System.out.println(String.format("%.2f",Math.sqrt(valorRaiz)));
        ler.close();
    }
}
