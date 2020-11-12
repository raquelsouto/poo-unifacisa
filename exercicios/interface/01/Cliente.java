import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private int mesa;
    private List<Item> listaDePedidos; 

    Cliente() {
        this.listaDePedidos = new ArrayList<Item>();
    }

    public void adicionarPedido(Item item) {
        listaDePedidos.add(item);
    }

    public void removerPedido(Item item) {
        listaDePedidos.remove(item);

    }

    public double getConta() {
        double total = 0;
        for (int i = 0; i < listaDePedidos.size(); i++) {
            total+= listaDePedidos.get(i).getPreco();
        }
        return total;
    }

    public List<Item> getListaDePedidos() {
        return listaDePedidos;
    }
    
    public int getMesa() {
        return mesa;
    }
    
    public void setMesa(int mesa) {
        this.mesa = mesa;
    }


}
