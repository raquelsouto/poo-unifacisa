public class TestaCorrida {

    public static void main(String[] args) {

        Corrida c1 = new UberBlack(5);
        Corrida c2 = new UberPool(8, 3);
        Corrida c3 = new UberXVIP(6);
        Corrida c4 = new UberX(7);
        
        SistemaUber uber = new SistemaUber();
        uber.adicionarCorrida(c1);
        uber.adicionarCorrida(c2);
        uber.adicionarCorrida(c3);
        uber.adicionarCorrida(c4);
        
        System.out.println("O valor da corrida ficou R$ " + uber.valorDasCorridas());
        
        
    }

}
