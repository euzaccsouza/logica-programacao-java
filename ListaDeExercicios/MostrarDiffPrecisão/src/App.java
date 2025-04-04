public class App {
    public static void main(String[] args) throws Exception {
        // Crie variáveis dos tipos float e double e mostre a diferença de precisão.
        float preciso = 3.14159265358979323846f;  
        double dobroPreciso = 3.14159265358979323846; 

        System.out.println(preciso +" -> Precisão de 7 casas decimais"); //Precisão Maxima de 7 casas decimais pós o ponto; 
        System.out.println(dobroPreciso + " -> Precisão Maxima de 15 casas decimais"); //Precisão Maxima de 15 casas decimais pós o ponto;
    }
}
