import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //  Leia um número inteiro informado pelo usuário e mostre o dobro dele.    
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o valor: ");
        int numero = leitor.nextInt();
        numero = numero*2;
        System.out.printf("Valor: %d", numero);
        leitor.close();
    }
}
