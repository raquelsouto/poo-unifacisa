import java.util.ArrayList;
import java.util.List;

public class SistemaInterpol {

    private List<String> procurados = new ArrayList<String>();
    
    
    public void adicionarProcurado(String nome) {
        procurados.add(nome);
    }
    
    public boolean ehProcurado(String nome) {
        for (int i = 0; i < procurados.size(); i++) {
            if(procurados.get(i).equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public String toString() {
        String output = "";
        
        output += "Lista dos nomes dos procurados\n";
        for (int i = 0; i < procurados.size(); i++) {
            output+= procurados.get(i) + "\n";
        }
        return output;
    }
    
}
