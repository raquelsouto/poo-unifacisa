public class LojaDeCarro {
    
    public static void main(String[] args) {
        Carro carro1 = new Carro("Pálio", "Fiat", 35000);
        Carro carro2 = new Carro("Pálio", "Fiat", CorDoCarro.PRATEADO, 2, false, false, false, false, 35000);
        Carro carro3 = new Carro("Civic", "Honda", CorDoCarro.PRETA, 2, true, true, true, true, 110000);
        Carro carro4 = new Carro("Corolla", "Toyota", CorDoCarro.AZUL, 2, true, true, false, true, 110000);
        Carro carro5 = new Carro("Gol", "Volkswagen", CorDoCarro.VERMELHA, 2, true, true, true, true, 55000);
        
        //VALORES DOS CARROS SEM PROMOÇÃO
        System.out.println(carro1.toString());
        System.out.println(carro2.toString());
        System.out.println(carro3.toString());
        System.out.println(carro4.toString());
        System.out.println(carro5.toString());
        
        
        //VALORES DOS CARROS COM PROMOÇÃO
        System.out.println(carro1.promocao = true);
        System.out.println(carro1);
        
        System.out.println(carro2.promocao = true);
        System.out.println(carro2);
                
        System.out.println(carro3.promocao = true);
        System.out.println(carro3);
        
        System.out.println(carro4.promocao = true);
        System.out.println(carro4);
        
        System.out.println(carro5.promocao = true);
        System.out.println(carro5);

    }
}
