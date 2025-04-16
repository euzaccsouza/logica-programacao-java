
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Receba um número N e calcule o fatorial dele.

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor");
        int numero = ler.nextInt();
        int fatorial = 1;
        
        for(int i =1; i < numero; i++){
            fatorial = fatorial * i;
        }

        fatorial = fatorial * numero;
        System.out.printf("Resultado: %d", fatorial);

        ler.close();
    }
}
