import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Calcule o tempo necessário para percorrer uma distância com uma determinada velocidade.
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a distância(Km): ");
        float distanciaPercorrida = ler.nextFloat();
        System.out.println("Informe a velocidade(km/h):  ");
        float velocidadeMedia =  ler.nextFloat();
        float tempo = distanciaPercorrida / velocidadeMedia;
        System.out.printf("O tempo necessário é de: %.0f horas", tempo);
        ler.close();

    }
}
