
public class Carro {
    
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double diaria;
    protected boolean alugado;
    
    public Carro(String marca, String modelo, int ano, double diaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.diaria = diaria;
        this.alugado = false;
    }
    
    public int getAno() {
        return ano;
    }
    
    public double getDiaria() {
        return diaria;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public boolean isAlugado() {
        return alugado;
    }
    
    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    
    public boolean comparaCarro(Carro carro) {
        if (carro.getMarca().equals(this.marca) && 
            carro.getModelo().equals(this.modelo) &&
            carro.getAno() == this.ano &&
            carro.getDiaria() == this.diaria) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        String output="";
        output+= "Marca: " + this.marca + "| Modelo: " + this.modelo + "| Ano: " + this.ano + "\n";
        return output;
    }

}
