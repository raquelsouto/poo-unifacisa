import java.util.List;

public class CorridaVIP extends Corrida {

    public CorridaVIP(Data dataInicialCorrida, Data dataFinalCorrida, double quantidadeKm, List<Passageiro> listaPassageiros) {
        super(dataInicialCorrida, dataFinalCorrida, quantidadeKm, listaPassageiros);
        super.precoBase = 5;
    }

    @Override
    public double precoDoKm() {
        return 2.3;
    }
    
    @Override
    public double valorDaCorridaFinal() {
        return super.valorDaCorridaFinal();
    }

}
