import java.util.List;

public class CorridaPool extends Corrida {
    
    private int contaPassageiros = 0;

    public CorridaPool(Data dataInicialCorrida, Data dataFinalCorrida, double quantidadeKm, List<Passageiro> listaPassageiros) {
        super(dataInicialCorrida, dataFinalCorrida, quantidadeKm, listaPassageiros);
        super.precoBase = 4.5;
    }
    
    @Override
    public double precoDoKm() {
        return 1.3;
    }
    
    @Override
    public double PrecoBase() {
        return 4.5;
    }
    
    public int checkQuantidadePassageiros() {
        for (int i = 0; i < listaPassageiros.size(); i++) {
            contaPassageiros++;
        }
        return contaPassageiros - 1 ;
    }
    
    public double valorFinalDaCorrida () {
        if (contaPassageiros > 1) {
            return precoBase + (precoDoKm() * quantidadeKm);
        }
         double custo = (precoBase + (precoDoKm() * quantidadeKm) - (contaPassageiros*10))/listaPassageiros.size();
         return custo;
    }
}
