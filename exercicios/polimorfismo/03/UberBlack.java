
public class UberBlack extends UberX {

    public UberBlack(double quantidadeDeKm) {
        super(quantidadeDeKm);
    }
    
    @Override
    public double getValor() {
        return 1.1 * super.getValor() ;
    }

}
