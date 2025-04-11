import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Crie um programa que receba a nota de 4 provas e mostre a média.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a nota da primeira prova: ");
        float primeraProva = leitor.nextFloat();
        System.out.println("Informe a nota da segunda prova: ");
        float segundaProva = leitor.nextFloat();
        System.out.println("Informe a nota da terceira prova: ");
        float terceiraProva = leitor.nextFloat();
        System.out.println("Informe a nota da quarta prova: ");
        float quartaProva = leitor.nextFloat();
        float media = (primeraProva+segundaProva+terceiraProva+quartaProva)/4;
        System.out.printf("A média é: %.2f", media );
        leitor.close();
    }
}
