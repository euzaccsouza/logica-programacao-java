import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //  Imprima os N primeiros termos da sequencia Fibonacci.

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor: ");
        int valor = ler.nextInt();
        int num, numA, numB;

        numA = 1;
        numB = 0;

        int contador = 0;
        do { 
            System.out.printf("%d", numA);
            num = numA + numB;
            numB = numA;
            numA = num;
            
            contador++;
        } while (contador < valor);

        ler.close();

    }
}
