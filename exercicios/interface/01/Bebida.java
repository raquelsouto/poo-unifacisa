
public class Bebida implements Item {

    Tamanho tamanho;
    SaborDaBebida sabor;
    
    Bebida(Tamanho tamanho, SaborDaBebida sabor) {
        this.tamanho = tamanho;
        this.sabor = sabor;
    }
    
    @Override
    public double getPreco() {
        return tamanho.getValorDoTamanho() + sabor.getValorDaBebida();
    }

    @Override
    public String getDescricao() {
        return tamanho.name() + " - " + sabor.name();
    }
    
    public SaborDaBebida getBebida() {
        return sabor;
    }
    
    public Tamanho getTamanho() {
        return tamanho;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            if(obj instanceof Bebida) {
                Bebida bebida = (Bebida) obj;
                if(bebida.sabor.equals(this.sabor) && bebida.tamanho.equals(this.tamanho)) {
                    return true;
                }
            }
        }
        return false;
    }
    

}
