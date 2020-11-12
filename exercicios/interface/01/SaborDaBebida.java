
public enum SaborDaBebida {

    REFRIGERANTE(5.0),
    AGUACOMGAS(4.5),
    AGUA(4.0),
    SUCO(6.5),
    CAFE(3.0),
    AGUADECOCO(3.5),
    WHISKY(7.0);
    
    private double valorDaBebida;
    
    SaborDaBebida(double valorDaBebida) {
        this.valorDaBebida = valorDaBebida;
    }
    
    public double getValorDaBebida() {
        return valorDaBebida;
    }
    
}
