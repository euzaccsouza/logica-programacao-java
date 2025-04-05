public class App {
    public static void main(String[] args) throws Exception {
        // Converta um número em hexadecimal para um inteiro usando a classe Integer

        //  Opção 1
        Integer objInteger = (int) 0x65; //número 101 em hexadecimal
        System.out.println(objInteger);

        // Opção 2
        int valorHex= 0x65; 
        Integer obj2 = valorHex; // Sendo convertido automaticamente pelo autoboxing do java
        System.out.println(obj2);

        //OBS: Autoboxing é o processo automático de conversão de tipos no java.
    }
}
