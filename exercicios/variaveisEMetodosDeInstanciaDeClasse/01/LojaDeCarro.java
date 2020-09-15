public class LojaDeCarro {
    
    public static void main(String[] args) {
        //VALORES DOS CARROS SEM PROMOÇÃO
        Carro.promocao = false; 
        
        Carro carro1 = new Carro("Pálio", "Fiat", 35000);
        Carro carro2 = new Carro("Pálio", "Fiat", CorDoCarro.PRATEADO, 2, false, false, false, false, 35000);
        Carro carro3 = new Carro("Civic", "Honda", CorDoCarro.PRETA, 2, true, true, true, true, 110000);
        Carro carro4 = new Carro("Corolla", "Toyota", CorDoCarro.AZUL, 2, true, true, false, true, 110000);
        Carro carro5 = new Carro("Gol", "Volkswagen", CorDoCarro.VERMELHA, 2, true, true, true, true, 55000);
        
        System.out.println(carro1.toString());
        System.out.println(carro2.toString());
        System.out.println(carro3.toString());
        System.out.println(carro4.toString());
        System.out.println(carro5.toString());
        
        
        //VALORES DOS CARROS COM PROMOÇÃO 
        Carro.promocao = true;
        
        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
        System.out.println(carro4);
        System.out.println(carro5);

    }
}
