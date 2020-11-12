
public class Refeicao implements Item {

    private Proteina proteina;
    private Carboidrato carboidrato;
    
    Refeicao(Proteina proteina, Carboidrato carboidrato) {
        this.proteina = proteina;
        this.carboidrato = carboidrato;
    }
    
    @Override
    public double getPreco() {
        return proteina.getPreco() + carboidrato.getValorDoCarboidrato();
    }
    
    @Override
    public String getDescricao() {
        return proteina.name() + " - " + carboidrato.name();
    }
    
    public Carboidrato getCarboidrato() {
        return carboidrato;
    }
    
    public Proteina getProteina() {
        return proteina;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            if(obj instanceof Refeicao) {
                Refeicao refeicao = (Refeicao) obj;
                if(refeicao.carboidrato.equals(this.carboidrato) && refeicao.proteina.equals(this.proteina)) {
                    return true;
                }
            }
        }
        return false;
    }
    
}
