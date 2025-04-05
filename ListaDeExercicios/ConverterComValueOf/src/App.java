public class App {
    public static void main(String[] args) throws Exception {
        // Utilize o método valueOf para converter uma String númerica para um objeto Integer
        
        //Opção 1
        Integer qtEmEstoque = Integer.valueOf("5542");
        System.out.println(qtEmEstoque);

        // Opção 2
        String qtProdEstoque = "3432";
        Integer objInteger = Integer.valueOf(qtProdEstoque);
        System.out.println(objInteger);
    }
}