import java.util.List;

public class Motorista extends Pessoa {

    private ContaCorrente contaRecebimento;
    protected List<Corrida> corridas;
    
    public Motorista(String nome, String cpf, ContaCorrente contaRecebimento) {
        super(nome, cpf);
        this.contaRecebimento = contaRecebimento;
    }
    
    public ContaCorrente getContaRecebimento() {
        return contaRecebimento;
    }
    
    public List<Corrida> getCorridas() {
        return corridas;
    }
}
