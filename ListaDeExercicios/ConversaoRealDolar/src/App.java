import java.util.Scanner;

public class App {
    public static final float COTACAO_DOLAR = 6.01f;
    public static void main(String[] args) throws Exception {
        // Faça um programa que leia um valor em reais e exiba o valor convertido em dolar.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o valor em Reais a ser convertido: ");
        float valorEmReais = leitor.nextFloat();
        float valorConvertido = valorEmReais * COTACAO_DOLAR;
        System.out.printf("O valor convertido é de: %.2f", valorConvertido);
        leitor.close();
    }
}
