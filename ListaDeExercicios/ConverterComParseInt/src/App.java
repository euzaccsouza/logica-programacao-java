
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Utilize o método parseInt da classe Integer para converter uma string em número.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int valorInt = Integer.parseInt(leitor.nextLine());  // Convertendo o próx valor literal(String) para int com parseInt.
        System.out.println("O valor digitado foi: " + valorInt);
        leitor.close();
    }
}
