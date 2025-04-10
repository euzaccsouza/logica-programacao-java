import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Leia um valor booleano e inverta o valor antes de exibi-lo.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Responda com true ou false.\nEsta quente hoje? ");
        boolean estaQuente = leitor.nextBoolean();
        estaQuente = !estaQuente; // Uso do sinal !->not, inverte o valor lido
        System.out.println(estaQuente);
        leitor.close();
    }
}
