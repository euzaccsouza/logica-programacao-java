
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Receba um valor N e calcule a soma de todos os inteiros de 1 até N.
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor: ");
        int valorInteiro = ler.nextInt();
        int soma = 0;
        
        for(int i=0; i < valorInteiro; i++){
            soma = soma + i;
        }

        soma = soma + valorInteiro;
        System.out.println(soma);

        ler.close();
    }
}
   
 