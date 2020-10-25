import java.util.List;

public class Corrida {

    private Data dataInicial;
    private Data dataFinal;
    protected double quantidadeKm;
    protected double precoBase;
    protected List<Passageiro> listaPassageiros;
    
    public Corrida(Data dataInicialCorrida, Data dataFinalCorrida, double quantidadeKm, List<Passageiro> listaPassageiros) {
        dataInicialCorrida = dataInicial;
        dataFinalCorrida = dataFinal;
        this.quantidadeKm = quantidadeKm;
        this.listaPassageiros = listaPassageiros;
    }
    
    public double PrecoBase() {
        return this.precoBase;
    }
    
    public Data getDataFinal() {
        return dataFinal;
    }
    
    public Data getDataInicial() {
        return dataInicial;
    }
    
    public double precoDoKm() {
        return quantidadeKm;
    }
    
    public String toString() {
        String output = "";
        for (int i = 0; i < listaPassageiros.size(); i++) {
            output+= listaPassageiros.get(i) + "|";
        }
        output+= getDataInicial().toString();
        output+= getDataFinal().toString();
        return output;
    }
}
