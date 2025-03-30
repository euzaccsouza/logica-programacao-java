
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) tela.getWidth();
        int altura = (int) tela.getHeight();
        System.out.println("A resolução é: "+ largura+ "x" + altura);
    }
}
