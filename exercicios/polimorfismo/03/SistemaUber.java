import java.util.ArrayList;
import java.util.List;

public class SistemaUber {

    private List<Corrida> corridas;
    
    public SistemaUber() {
        this.corridas = new ArrayList<Corrida>();
    }
    
    public void adicionarCorrida(Corrida c) {
        this.corridas.add(c);
    }
    
    public double valorDasCorridas() {
        double valorFinal = 0;
        
        for (int i = 0; i < corridas.size(); i++) {
           valorFinal += corridas.get(i).getValor();
            
        }
        return valorFinal;
    }
}
