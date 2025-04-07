import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Leia dois números e mostre a soma, diferença, produto e divisão entre eles.
        Scanner leitor = new Scanner(System.in);
        float soma, diferenca, produto, divisao;
        System.out.println("Informar 1º valor:  ");
        int primeiroValor = leitor.nextInt();
        System.out.println("Informar 2º valor: ");
        int segundoValor = leitor.nextInt();
        soma = primeiroValor + segundoValor;
        System.out.printf("Soma: %.2f",soma);
        leitor.close();
    }
}
