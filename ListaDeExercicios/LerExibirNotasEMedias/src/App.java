import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Crie um programa que leia três notas de um aluno e exiba a média.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        float primeiraNota = leitor.nextFloat();
        System.out.println("Informe a segunda nota: ");
        float segundaNota = leitor.nextFloat();
        System.out.println("Informe a terceira nota: ");
        float terceiraNota = leitor.nextFloat();
        float media = (primeiraNota+segundaNota+terceiraNota) / 3;
        System.out.printf("Á média foi de: %.2f", media);
        leitor.close();
    }
}
