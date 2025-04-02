public class App {
    public static void main(String[] args) throws Exception {
        /*  Os Wrappers(Resvestimento) assim como diz a tradução do termo
            são revestimento dos tipos primitivos, os fazendo assim terem acessos
            a métodos.
        */
        
        Integer idade = 29;
        /*  O método compareTo, está comparando o valor da variavel idade com o valor passado
            via parametro.
            caso retorno seja = 1 - Diferente(falso)
            caso retorno seja = 0 - Igual "comparavél" (verdadeiro)
        */ 
        System.out.println(idade.compareTo(27));

    }
}
