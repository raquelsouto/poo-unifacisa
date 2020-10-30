import java.util.ArrayList;
import java.util.List;

public class Motorista extends Pessoa {

    private ContaCorrente contaRecebimento;
    protected List<Corrida> listaCorridas = new ArrayList<>();
    
    public Motorista(String nome, String cpf, ContaCorrente contaRecebimento) {
        super(nome, cpf);
        this.contaRecebimento = contaRecebimento;
    }
    
    public void adicionaCorridaAoHistorico(Corrida corrida) {
        listaCorridas.add(corrida);
    }
    
    public ContaCorrente getContaRecebimento() {
        return contaRecebimento;
    }
    
    public List<Corrida> getCorridas() {
        return listaCorridas;
    }
}
