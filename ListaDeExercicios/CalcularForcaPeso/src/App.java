public class App {
    public static final float GRAVIDADE = 9.8F; 
    public static void main(String[] args) throws Exception {
        /*
            Declare uma constante para representar a gravidade da terra
            e use-a para calcular o peso de um objeto.
        */ 
        float massaObjeto = 10f;
        float pesoObjeto = massaObjeto * GRAVIDADE;
        int prov = (int) pesoObjeto; // Usei essa prov para forçar um casting, e assim perder as casas decimais
        System.out.printf("O peso do objeto é de: %d N", prov);

    }
}
