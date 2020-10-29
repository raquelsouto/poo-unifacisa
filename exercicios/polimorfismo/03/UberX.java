
public class UberX extends Corrida {

    public UberX(double quantidadeDeKm) {
        super(quantidadeDeKm, 4, 1.2);
    }

    @Override
    public double getValor() {
        return super.precoBaseDaCorrida + (super.quantidadeDeKm * super.precoDoKm);
    }

}
