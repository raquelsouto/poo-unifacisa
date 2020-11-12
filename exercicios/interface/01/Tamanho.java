
public enum Tamanho {

    PEQUENO(0.0),
    MEDIO(2.0),
    GRANDE(2.8);
    
    private double valorDoTamanho;
    
    Tamanho(double valorDoTamanho) {
        this.valorDoTamanho = valorDoTamanho;
    }
    
    public double getValorDoTamanho() {
        return valorDoTamanho;
    }
}
