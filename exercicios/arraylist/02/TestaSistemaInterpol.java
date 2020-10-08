public class TestaSistemaInterpol {

    public static void main(String[] args) {

        SistemaInterpol p1 = new SistemaInterpol();
        p1.adicionarProcurado("Raquel");
        p1.adicionarProcurado("Eduardo");
        p1.adicionarProcurado("Susy");
        p1.adicionarProcurado("Antonio");
        p1.adicionarProcurado("Bruno");
      //Imprimir a lista de procurados
        System.out.println(p1.toString());
        
        
        //Saber se está na lista de procurados
        System.out.println("Essa pessoa está sendo procurada? ");
        System.out.println(p1.ehProcurado("Susy"));
        
        
    }

}
