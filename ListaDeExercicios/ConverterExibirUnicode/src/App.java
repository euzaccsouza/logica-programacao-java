import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Leia um caractere, coverta para um wrapper Character e exiba seu códico unicode.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o caracter: ");
        char caracter = leitor.next().charAt(0);
        Character objCharacter = caracter;
        int unicode = objCharacter;
        System.out.println("O valor em unicode é: " + unicode);
        leitor.close();

    }
}
