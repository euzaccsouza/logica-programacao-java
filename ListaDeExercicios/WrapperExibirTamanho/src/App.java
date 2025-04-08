import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Ler um Wrapper String e mostre o comprimento.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informar palavra: ");
        String palavra = leitor.nextLine();
        System.out.printf("Comprimento: %s caracteresZa", palavra.length());
        leitor.close();
    }
}
