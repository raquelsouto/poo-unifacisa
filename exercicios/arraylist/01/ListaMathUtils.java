import java.util.ArrayList;
import java.util.List;

public class ListaMathUtils {

    private List<Integer> divisores = new ArrayList<Integer>();
    
    public List<Integer> calculaDivisores(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores.add(i);
            }
            
        }
        return divisores;
    }
    
    public double computaMaior(List<Double> numeros) {
        double maior = numeros.get(0);
        
        for (int i = 0; i < numeros.size(); i++) {
            if(numeros.get(i) > maior) {
                maior = numeros.get(i);
            }
            
        }
        return maior;
    }
    
    public double computaMenor(List<Double> numeros) {
        double menor = numeros.get(0);
        
        for (int i = 0; i < numeros.size(); i++) {
            if(numeros.get(i) < menor) {
                menor = numeros.get(i);
            }
        }
        return menor;
    }
 
    public double computaMedia(List<Double> numeros) {
        double soma = 0;
        int cont = 0;
        double media = 0;
        
        for (int i = 0; i < numeros.size(); i++) {
            soma+= numeros.get(i);
            cont++;
        }
        return media = soma/cont;
    }
    
    public boolean temNumRepetido(List<Double> numeros) {
        int contaRep = 0;
        
        for (int i = 0; i < numeros.size(); i++) {
            for (int j = 0; j < numeros.size(); j++) {
                if (numeros.get(i) != numeros.get(j) && numeros.get(i).equals(numeros.get(j))) {
                    contaRep++;
                }
            }
        }
        
        if (contaRep > 0) {
            return true;
        }
        return false;
    }
    
    
}
