import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Solicite ao usuário para informar sua altura e exiba uma mensagem com o valor.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a sua altura: ");
        float alturaUsuario = leitor.nextFloat();
        System.out.print(String.format("Sua altura é de: %.2f cm\n", alturaUsuario));
        leitor.close();
    }
}
