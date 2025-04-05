
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Peça ao usuário para digitar seu nome e idade, e exiba uma saudação personalizada.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nomeUsuario = leitor.nextLine();
        System.out.println("Informe sua idade");
        int idadeUsuario = leitor.nextInt();

        System.out.printf("Olá, %s seja muito bem vindo, e aliás parabéns pelos seus %d anos !!", nomeUsuario, idadeUsuario);
        leitor.close();
    }
}
