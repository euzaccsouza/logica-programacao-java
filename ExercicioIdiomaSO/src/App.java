import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale locale = Locale.getDefault();
        System.out.println("O meu sistema está em: " + locale.getDisplayLanguage());
    }
}
