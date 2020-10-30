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

    @Override
    public double valorDaCorridaFinal() {
        double desconto = contaPassageiros * 0.10;
        
        if (contaPassageiros > 1) {
            return ((super.valorDaCorridaFinal() - (super.valorDaCorridaFinal() * desconto)))/contaPassageiros;
        } else {
            return super.valorDaCorridaFinal();
        }
    }
}

