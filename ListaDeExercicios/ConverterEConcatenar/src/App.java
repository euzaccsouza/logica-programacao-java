public class App {
    public static void main(String[] args) throws Exception {
        // Converta um valor int para uma String e exiba a concatenação com outra String.
        int idade = 29;
        String idadeLiteral = String.valueOf(idade); // Convertendo um int para String usando o método valueOf;
        String txt = "Sua idade é: ";
        System.out.println(txt + idadeLiteral);
    }
}
