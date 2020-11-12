
public enum Proteina {
    
    PICANHA(20), 
    MAMINHA(15),
    FRANGO(15),
    LINGUICA(10);
    
    private double valorDaProteina;
    
    Proteina(double valorDaProteina) {
        this.valorDaProteina = valorDaProteina;
    }
    
    public double getPreco() {
        return valorDaProteina;
    }

}
