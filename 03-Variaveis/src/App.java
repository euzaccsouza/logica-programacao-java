public class App {
    public static void main(String[] args) throws Exception {
        /*Sintaxe da criação de uma variável 
         é caracterizada por: <tipoDaVariavel> + <nomeDaVariavel> */

        char inicialNome = 'Z'; // <- Criação e Inicialização da variável na mesma linha

        int idade;  //<- Criação da variável
        idade = 29; //<- Inicialização da variável(ou seja, atribuição de um valor/dados)

        float altura = (float) 1.87; //<- Criação e Inicialização com casting.

        //  OBS:Casting: é a conversão de um tipo de dado para outro. 

        System.out.println("Letra inicial do meu nome: " + inicialNome);
        System.out.printf("Minha idade: %d anos \n", idade);
        System.out.println("Minha altura: " + altura);
    }
}
