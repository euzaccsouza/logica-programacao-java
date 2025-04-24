import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //  Crie um programa que leia 10 números e armazene apenas os pares em um segundo array.
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] numerosPares = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe o número: ");
            numeros[i] = scanner.nextInt();
        }
        for(int j = 0; j< numerosPares.length; j++){
            if ((numeros[j]%2) == 0) {
                numerosPares[j] = numeros[j];
                System.out.println("Os números pares são: "+ numerosPares[j]);
            }

        }

    }
}
