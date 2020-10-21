import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    
    private List<Animal> jaulasAnimais; 
    
    public Zoologico() {
        this.jaulasAnimais = new ArrayList<Animal>(5);
    }
    
    public void addAnimal(Animal bicho) {
        jaulasAnimais.add(bicho);
    }
    
    public void cutucarAnimais() {
        for (int i = 0; i < jaulasAnimais.size(); i++) {
            jaulasAnimais.get(i).emitirSom();
        }
    }
    
    public void darCarreira() {
        for (int i = 0; i < jaulasAnimais.size(); i++) {
            if (jaulasAnimais.get(i) instanceof Cavalo) {
                Cavalo cavalinho = (Cavalo)jaulasAnimais.get(i);
                cavalinho.correr();
            } else if (jaulasAnimais.get(i) instanceof Cachorro) {
                Cachorro cachorrinho = (Cachorro)jaulasAnimais.get(i);
                cachorrinho.correr();
            } else {
                System.out.println("Esse animal não corre!");
            }
        }
    }
    
}


