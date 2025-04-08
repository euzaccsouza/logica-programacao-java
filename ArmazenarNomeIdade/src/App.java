import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Crie um programa que receba o nome e a idade de uma pessoa e armazene em variáveis.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome =  leitor.nextLine();
        System.out.println("Informe sua idade: ");
        int idade = leitor.nextInt();
        System.out.println("Informações salvas com sucesso!");
        leitor.close();
    }
}
