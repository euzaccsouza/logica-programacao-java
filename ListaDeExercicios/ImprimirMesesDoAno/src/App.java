import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
            Utilize variáveis finais para representar os meses do ano e 
            imprima o mês correspondente a um número informado pelo usuário.
        */
        final String primeiroMes = "Janeiro";
        final String segundoMes = "Fevereiro";
        final String terceiroMes = "Março";
        final String quartoMes = "Abril";
        final String quintoMes = "Maio";
        final String sextoMes = "Junho";
        final String setimoMes = "Julho";
        final String oitavoMes = "Agosto";
        final String nonoMes = "Setembro";
        final String decimoMes = "Outubro";
        final String decimoPMes = "Novembro";
        final String decimoSMes = "Dezembro";

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o valor pertencete ao mês: ");
        int numeroMes = leitor.nextInt();

        switch (numeroMes) {
            case 1:
                System.out.println("O valor informado é pertencente ao mês de: "+ primeiroMes);
                break;
            case 2:
                System.out.println("O valor informado é pertencente ao mês de: "+ segundoMes);
                break;
            case 3:
                System.out.println("O valor informado é pertencente ao mês de: "+ terceiroMes);
                break;
            case 4:
                System.out.println("O valor informado é pertencente ao mês de: "+ quartoMes);
                break;
            case 5:
                System.out.println("O valor informado é pertencente ao mês de: "+ quintoMes);    
                break;      
            case 6:
                System.out.println("O valor informado é pertencente ao mês de: "+ sextoMes);
                break;      
            case 7:
                System.out.println("O valor informado é pertencente ao mês de: "+ setimoMes);
                break;      
            case 8:
                System.out.println("O valor informado é pertencente ao mês de: "+ oitavoMes);
                break;      
            case 9:
                System.out.println("O valor informado é pertencente ao mês de: "+ nonoMes);
                break;
            case 10:
                System.out.println("O valor informado é pertencente ao mês de: "+ decimoMes);
                break;
            case 11:
                System.out.println("O valor informado é pertencente ao mês de: "+ decimoPMes);
                break;
            case 12:
                System.out.println("O valor informado é pertencente ao mês de: "+ decimoSMes);
                break;
                      
            default:
                System.out.println("Valor Informado Inválido, porfavor tente novamente!");
        }
        leitor.close();

        /*
         * OBS: tém modo mais fácil de resolver e com menos repetição de código, porém
         * iria contra o que foi pedido no desafio.
        */
    }
}
