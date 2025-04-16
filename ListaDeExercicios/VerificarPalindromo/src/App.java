import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //  Receba e verifique se uma palavra é um palindromo (ex: "arara" ou "ana")

        Scanner ler = new Scanner(System.in);
        System.out.println("Informar palavra: ");
        String palavra = ler.nextLine();
        int tamanho = palavra.length();
        String palavraInvertida = "";

        for(int i = tamanho-1; i >= 0; i--){
            palavraInvertida += palavra.charAt(i);
        }
        
        if(palavra.toLowerCase().equals(palavraInvertida.toLowerCase())){
            System.out.println("É Palindromo!");
        } else {
            System.out.println("Não é Palindromo!");
        }

        ler.close();
    }
}
