import java.util.List;

public interface LocadoraDeCarro {
    
    public void adicionarCarro(String modelo, String marcar, int ano, double diaria);
    
    public List<Carro> listarCarrosDaMarca(String marca);
    
    public void removerCarro(String modelo, String marca, int ano) throws CarroInexistenteException;
    
    public double alugarCarro(Carro carro, Data dataInicio, Data dataFim) throws CarroAlugadoException;
}
