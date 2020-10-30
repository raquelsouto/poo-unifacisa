import java.util.List;

public class CorridaUberX extends Corrida {

    public CorridaUberX(Data dataInicialCorrida, Data dataFinalCorrida, double quantidadeKm, List<Passageiro> listaPassageiros) {
        super(dataInicialCorrida, dataFinalCorrida, quantidadeKm, listaPassageiros);
        super.precoBase = 5;
    }
    
    @Override
    public double valorDaCorridaFinal() {
        return super.valorDaCorridaFinal();
    }
    
    @Override
    public double PrecoBase() {
        return 5;
    }
    
    @Override
    public double precoDoKm() {
        return 1.6;
    }

}
