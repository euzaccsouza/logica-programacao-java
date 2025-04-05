import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Solicite ao usuário para informar seu peso e altura, e calcule o IMC.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe seu peso: ");
        float peso = leitor.nextFloat();
        System.out.println("Informe sua altura: ");
        float altura = leitor.nextFloat();
        peso = peso/(altura*altura);
        System.out.printf("Seu IMC é de: %.2f kg/m2", peso);
        leitor.close();
    }
}
