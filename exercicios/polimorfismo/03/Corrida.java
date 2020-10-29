
public abstract class Corrida {
    
    protected double quantidadeDeKm;
    protected double precoBaseDaCorrida;
    protected double precoDoKm;
    
    public Corrida(double quantidadeDeKm, double precoBaseDaCorrida, double precoDoKm) {
        this.quantidadeDeKm = quantidadeDeKm;
        this.precoBaseDaCorrida = precoBaseDaCorrida;
        this.precoDoKm = precoDoKm;
    }
    
    public abstract double getValor();
        

}
