
public class Localiza extends Locadora {
    
    private double fatorDeAcrescimoLocaliza = 1.2;

    
    public double alugarCarro(Carro carro, Data dataInicio, Data dataFim) throws CarroAlugadoException {
        int qtddDias = getCalculaDuracaoEmDias(dataInicio, dataFim);
        double valorTotal = 0.0;

        int index = checkCarroAlugado(carro);
        System.out.println(index);
        if (index >= 0) {
            listaDeCarros.get(index).setAlugado(true);
            valorTotal = listaDeCarros.get(index).getDiaria() * qtddDias * fatorDeAcrescimoLocaliza;
        } else {
            throw new CarroAlugadoException("[Locadora] O carro já está alugado.");
        }
        
        return valorTotal;
    }
    
}
