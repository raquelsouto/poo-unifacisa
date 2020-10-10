public class TestaLojaDeCarro {

    public static void main(String[] args) {

        Carro carro1 = new Carro("Pálio", "Fiat", 2, CorDoCarro.BRANCA, false, false, false, false, 35000);
        Carro carro2 = new Carro("Civic", "Honda", 4, CorDoCarro.PRATEADO, true, true, true, true, 110000);
        Carro carro3 = new Carro("Corolla", "Toyota", 4, CorDoCarro.PRETA, true, true, false, true, 110000);
        
        LojaDeCarro loja1 = new LojaDeCarro();
        //Check se o id gerado é único e adiciona o carro na lista
        loja1.adicionarCarro(carro1);
        loja1.adicionarCarro(carro2);
        loja1.adicionarCarro(carro3);
        
        System.out.println("-========== Valores dos carros em promoção ==============-");
        //Colocando um carro em promoção 
        loja1.adicionarPromocao(carro1.getId());

        //Exibir a lista de carros disponíveis
        System.out.println("\n" + "-========== Carros Disponíveis ==============-");
        loja1.exibirCarrosDisponíveis();
        
        System.out.println("\n" + "-======= Quantidade de carros vendidos =========-");
        //Exibir a quantidade de carros vendidos
        loja1.venderCarro(carro2.getId());
        loja1.venderCarro(carro3.getId());
        System.out.println(loja1.venderCarro(carro2.getId()));
        
        
        System.out.println("\n" + "-======= Valor acumulado de vendas =========-");
        //Exibe o total de vendas acumulados
       
        System.out.println("R$ " + loja1.computaApuradoDasVendas());
        
        
    }

}
