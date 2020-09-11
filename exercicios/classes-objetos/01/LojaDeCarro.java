public class LojaDeCarro {
    
    public static void main(String[] args) {
        Carro carro1 = new Carro("Pálio", "Fiat", 35000);
        System.out.println(carro1.toString());
        
        Carro carro2 = new Carro("Pálio", "Fiat", CorDoCarro.PRATEADO, 2, false, false, false, false, 35000);
        System.out.println(carro2.toString());
        
        Carro carro3 = new Carro("Civic", "Honda", CorDoCarro.PRETA, 2, true, true, true, true, 110000);
        System.out.println(carro3.toString());
        
        Carro carro4 = new Carro("Corolla", "Toyota", CorDoCarro.AZUL, 2, true, true, false, true, 110000);
        System.out.println(carro4.toString());
        
        Carro carro5 = new Carro();
        System.out.println(carro5.toString());
    }
}
