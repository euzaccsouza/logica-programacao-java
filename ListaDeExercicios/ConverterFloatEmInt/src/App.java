import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Converta um valor float para int e mostre o resultado.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informar o valor:");
        int valorInt = (int) leitor.nextFloat();
        System.out.println("O valor convertido é: "+valorInt);
        leitor.close();
    }
}
