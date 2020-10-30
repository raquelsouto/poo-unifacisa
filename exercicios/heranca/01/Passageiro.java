import java.util.List;

public class Passageiro extends Pessoa {

    private ContaCorrente contaPagamento;
    private Data dataDeIngresso;
    private List<Corrida> listaCorridas;

    public Passageiro(String nome, String cpf, ContaCorrente contaPagamento, Data dataDeIngresso) {
        super(nome, cpf);
        this.contaPagamento = contaPagamento;
        this.dataDeIngresso = dataDeIngresso;
    }
    
    public void adicionaCorridaAoHistorico(Corrida corrida) {
        listaCorridas.add(corrida);
    }
    
    public Data getDataDeIngresso() {
        return dataDeIngresso;
    }
       
    public ContaCorrente getContaPagamento() {
        return contaPagamento;
    }

    public List<Corrida> getCorridas() {
        return listaCorridas;
    }
}
