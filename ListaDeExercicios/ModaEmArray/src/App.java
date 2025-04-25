import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Conte quantas vezes um número específico aparece em um array.
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {1, 2, 3, 2, 4, 2};
        System.out.println("Informe o número:");
        int numero = scanner.nextInt();
        int repete = 0;
        for (int i = 0; i < numeros.length; i++) {
             if(numeros[i] == numero){
                 repete++;
             }
        }
        System.out.println("Número Informado: "+ numero);
        System.out.println("Aparece "+ repete +" vezes.");
        scanner.close();
    }
}
