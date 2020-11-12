
public class TesteRestaurante {

    public static void main(String[] args) {

        SistemaRestaurante sistemaRestaurante = new SistemaRestaurante();

        //Criando clientes
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();

        System.out.println("Adicionando cliente à Lista de cliente");
        sistemaRestaurante.adicionarCliente(c1);
        sistemaRestaurante.adicionarCliente(c2);
        sistemaRestaurante.adicionarCliente(c3);

        System.out.println("-=-------------------------------------------------------------=-");
        
        System.out.println("Anotando pedido cliente");
        Item item1 = new Refeicao(Proteina.PICANHA, Carboidrato.ARROZ);
        Item item2 = new Bebida(Tamanho.GRANDE, SaborDaBebida.WHISKY);
        Item item3 = new Refeicao(Proteina.FRANGO, Carboidrato.PURE);

        System.out.println("-=-------------------------------------------------------------=-");
        
        System.out.println("Realizando pedido cliente");
        sistemaRestaurante.adicionarPedido(c1.getMesa(), item1);
        sistemaRestaurante.adicionarPedido(c2.getMesa(), item2);
        sistemaRestaurante.adicionarPedido(c3.getMesa(), item3);
        // TERMINOU DE COMER

        System.out.println("-=-------------------------------------------------------------=-");
        System.out.println("Computando a conta do cliente..");
        System.out.println("\tO valor da conta do cliente 1 é de R$ " + sistemaRestaurante.computarPagamentoCliente(c1.getMesa()));
        
        System.out.println("\tO valor da conta do cliente 2 é de R$ " + sistemaRestaurante.computarPagamentoCliente(c2.getMesa()));
        sistemaRestaurante.computarPagamentoCliente(c2.getMesa());
        
        System.out.println("\tO valor da conta do cliente 3 é de R$ " + sistemaRestaurante.computarPagamentoCliente(c3.getMesa()));
        sistemaRestaurante.computarPagamentoCliente(c3.getMesa());

        
        System.out.println("-=-------------------------------------------------------------=-");
     // GARÇOM, POR FAVOR ME VÊ A CONTA!
        System.out.println("Recebendo pagamento da conta do cliente 1.. ");
        double valorContaCliente1 = sistemaRestaurante.computarPagamentoCliente(sistemaRestaurante.getMesas());
        sistemaRestaurante.receberPagamentoCliente(c1.getMesa(), valorContaCliente1);
        
        System.out.println("Recebendo pagamento da conta do cliente 2..");
        double valorContaCliente2 = sistemaRestaurante.computarPagamentoCliente(sistemaRestaurante.getMesas());
        sistemaRestaurante.receberPagamentoCliente(c2.getMesa(), valorContaCliente2);
        
        System.out.println("Recebendo pagamento da conta do cliente 3..");
        double valorContaCliente3 = sistemaRestaurante.computarPagamentoCliente(sistemaRestaurante.getMesas());
        sistemaRestaurante.receberPagamentoCliente(c3.getMesa(), valorContaCliente3);
        
        System.out.println("-=-------------------------------------------------------------=-");
      //REMOVE MESA
        System.out.println("Removendo cliente 1 da mesa..");
        sistemaRestaurante.removerPedido(c1.getMesa(), item1);
        
        System.out.println("Removendo cliente 2 da mesa..");
        sistemaRestaurante.removerPedido(c2.getMesa(), item1);
        
        System.out.println("Removendo cliente 3 da mesa..");
        sistemaRestaurante.removerPedido(c3.getMesa(), item1);
        



    }

}
