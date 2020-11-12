import java.util.ArrayList;
import java.util.List;

public class SistemaRestaurante {

    List<Cliente> listaDeClientes;
    private int mesas;

    public SistemaRestaurante() {
        this.mesas = 0;
        this.listaDeClientes = new ArrayList<Cliente>();
    }
    public void adicionarCliente(Cliente c) {
        c.setMesa(mesas);
        this.listaDeClientes.add(c);
        mesas++;
    }

    public void adicionarPedido(int mesa, Item item) {
        this.listaDeClientes.get(mesa).adicionarPedido(item);
    }

    public void removerPedido(int mesa, Item item) {
        Cliente cliente = this.listaDeClientes.get(mesa);
        cliente.removerPedido(item);
    }

    public double computarPagamentoCliente(int mesa) {
        double valorComputado = 0;

        for (int i = 0; i < listaDeClientes.size(); i++) {
            if (listaDeClientes.get(i).getMesa() == mesa) {
                valorComputado = this.listaDeClientes.get(i).getConta();
            }
        }
        return valorComputado;
    }

    public void receberPagamentoCliente(int mesa, double pagamento) {
        double valorAPagar = computarPagamentoCliente(mesa);

        if(pagamento >= valorAPagar) {
            this.listaDeClientes.remove(mesa);
            this.mesas --;
            System.out.println("Pagamento realizado com sucesso!");
            
            while(mesa < this.mesas) {
                Cliente c = this.listaDeClientes.get(mesa);
                int mesaAtual = c.getMesa();
                mesaAtual--;
                c.setMesa(mesaAtual);
                mesa++;
            }
        } else {
            System.out.println("Está faltando dinheiro para o pagamento ser realizado");
        }
    }
    public List<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public int getMesas() {
        return mesas;
    }

    public void setMesas(int mesas) {
        this.mesas = mesas;
    }


}
