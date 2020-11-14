import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private int mesa;
    private String nome;
    private List<Item> listaDePedidos; 

    Cliente(String nome) {
        this.nome = nome;
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
    
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        String output = "";
        output += "Nome: " + getNome()+ "\n";
        output += "Mesa: " + getMesa()+ "\n";
        for (int i = 0; i < listaDePedidos.size(); i++) {
            output+= "Pedido: " + this.listaDePedidos.get(i).getDescricao()+ "\n";
        }
        
        return output;
    }

}
