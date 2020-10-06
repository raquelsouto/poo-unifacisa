public class SistemaInterpol {

    public String procurados [];
    int quantidadeProcurados = 0;

    public SistemaInterpol() {
        this.procurados = new String [10];
    }

    void adicionarProcurados(String nome) {
        String[] aux = nome.split(" ");
        
        for (int i = 0; i < aux.length; i++) {
            if(aux[i] != null) {
                procurados[quantidadeProcurados] = aux[i];
                quantidadeProcurados++;
            }
        } 
        
        String [] novaListaProcurados = new String [quantidadeProcurados];
        for (int i = 0; i < quantidadeProcurados; i++) {
            if(procurados[i] != null) {
                novaListaProcurados[i] = procurados[i];
            }
        }
        novaListaProcurados = procurados;
    }
    
    boolean ehProcurado(String nome) {
        
        for (int i = 0; i < quantidadeProcurados; i++) {
            if(procurados[i].equals(nome)) {
                quantidadeProcurados++;
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String output = "";

        for (int i = 0; i < quantidadeProcurados; i++) {
            output += "Nome do Procurado: " + procurados[i] + "\n";
        }
        return output;
    }
    
    
    

}
