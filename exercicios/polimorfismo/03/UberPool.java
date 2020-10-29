
public class UberPool extends UberX {
    
    private int numDePassageiros;
    
    public UberPool(double quantidadeDeKm, int numDePassageiros) {
        super(quantidadeDeKm);
        this.numDePassageiros = numDePassageiros;
    }

    @Override
    public double getValor() {
        return (super.getValor()/numDePassageiros);
    }
    
}
