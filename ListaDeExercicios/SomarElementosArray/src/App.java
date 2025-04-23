import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Some todos os elementos de um array de inteiros.
        int[] numeros = {10, 20, 30, 40};
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
        }
        System.out.println("A soma dos valores armazenados foi de: " + soma);
    }
}
