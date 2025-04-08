
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
            Crie um programa que leia o nome, 
            a idade e o salário de um funcionário e exiba as informações.
        */
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nomeFunc =  leitor.nextLine(); 
        System.out.println("Informe sua idade: ");
        int idadeFunc = leitor.nextInt();
        System.out.println("Informe seu Salario: ");
        float salarioFunc = leitor.nextFloat();
        System.out.println("------Informações Funcionário------\n");
        System.out.printf("Nome: %s\nidade: %d anos\nsalario: %.2f", nomeFunc, idadeFunc, salarioFunc);
        leitor.close();
    }
}
