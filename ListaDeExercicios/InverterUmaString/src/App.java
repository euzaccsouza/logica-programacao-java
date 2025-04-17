
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Inverter uma String sem usar o método reverse();
        Scanner ler = new Scanner(System.in);
        System.out.println("Palavra: ");
        String palavra = ler.nextLine();
        int qtLetras = palavra.length();
        String temporaria = "";
        System.out.printf("A palavra informada foi: %s\n", palavra);
        
        for(int i = qtLetras-1; i >= 0; i--){
            temporaria += palavra.charAt(i);
        }
        palavra = temporaria;
        System.out.printf("A palavra invertida é: %s",palavra);

        ler.close();
    }
}
