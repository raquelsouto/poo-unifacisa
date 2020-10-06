public class TestaSistemaInterpol {

    public static void main(String[] args) {

        //Testando nome dos procurados 
        
        SistemaInterpol nome1 = new SistemaInterpol();
        nome1.adicionarProcurados("Phulano Syckrano Bheltranno");
        System.out.println(nome1.toString());
        

        
        System.out.println("Digite o nome para saber se é procurado: ");
        System.out.println(nome1.ehProcurado("Fulano"));
        System.out.println(nome1.ehProcurado("Syckrano"));
        
        
        
        
            
    }

}
