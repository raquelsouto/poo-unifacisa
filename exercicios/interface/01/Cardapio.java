import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    private List<Bebida> listaDeBebidas;
    private List<Refeicao> listaDeRefeicao;

    public Cardapio() {
        //Fazendo todos as combinações possíveis de Bebida pra adicionar;
        this.listaDeBebidas = new ArrayList<Bebida>();
        SaborDaBebida [] sabores = SaborDaBebida.values();
        Tamanho [] tamanhos = Tamanho.values();
        for(SaborDaBebida sabor : sabores) {
            for (Tamanho tamanho : tamanhos) {
                this.listaDeBebidas.add(new Bebida(tamanho, sabor));
            }
        }
        
      //Fazendo todos as combinações possíveis de Refeição pra adicionar;
        this.listaDeRefeicao = new ArrayList<Refeicao>();
        Proteina [] proteinas = Proteina.values();
        Carboidrato [] carboidratos = Carboidrato.values();
        for(Proteina proteina : proteinas) {
            for(Carboidrato carboidrato : carboidratos) {
                this.listaDeRefeicao.add(new Refeicao(proteina, carboidrato));
            }
        }
    }

    public List<Bebida> getListaDeBebidas() {
        return listaDeBebidas;
    }

    public List<Refeicao> getListaDeRefeicao() {
        return listaDeRefeicao;
    }
    
    public List<Item> Cardapio() {
        List<Item> listaCardapio = new ArrayList<Item>();
        listaCardapio.addAll(listaDeBebidas);
        listaCardapio.addAll(listaDeRefeicao);
        return listaCardapio;
    }
    
}





