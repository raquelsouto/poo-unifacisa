
public class UberXVIP extends UberX {

    public UberXVIP(double quantidadeDeKm) {
        super(quantidadeDeKm);
    }
    
    @Override
    public double getValor() {
        return 0.9 * super.getValor();
        
    }

}
