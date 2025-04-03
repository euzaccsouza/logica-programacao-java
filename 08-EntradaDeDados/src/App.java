// Está "chamando/importando" aquivos de uma classe de fora do meu diretorio.
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*  Para fazer a leitura de dados do console no Java, é necessário criar(instanciar)
            um objeto da classe Scanner, e passar como parametro via contrutor o System.in.
            
            E depois fazer uso dos métodos .next da classe, existe um método .next para
            para cada tipo primitivo. Esse método pega a próxima coisa que for digita no console
            e joga para um espaço na memória(Variável).
        */ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = sc.nextLine();
        System.out.println("Seu nome é: "+nome);
        sc.close();
    }
}
