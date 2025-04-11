import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Calcule o salário líquido de um funcionário considerando os descontos de impostos.
         * Obs: Geralmente é descontado o IRFF(Imposto de Renda) e INSS porém estarei usando
         * o salário minimo como báse, porque ainda não estudei Estruturas condicionais.
        */
        Scanner ler = new Scanner(System.in);
        //final float irrf = ; <- Calculo baseado no salario minimo logo está isento de IRRF.
        final float inss  = 113.85f;
        System.out.println("Informe seu salário minimo: ");
        float salarioBrutoM = ler.nextFloat();              // M = Minimo
        float salarioLiquidoM = salarioBrutoM - inss;
        System.out.printf("Em 2025 o salário liquido é de: R$ %.2f ", salarioLiquidoM);
        ler.close();
    }
}
