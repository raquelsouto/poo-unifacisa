public class TestaZoologico {
    
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        
        zoo.addAnimal(new Cachorro("Boo", 1));
        zoo.addAnimal(new Preguica("Fast", 2));
        zoo.addAnimal(new Cavalo("Bruno", 3));
        zoo.addAnimal(new Cavalo("Raquel", 2));
        zoo.addAnimal(new Preguica("Ligerinha", 5));
        
        
        zoo.darCarreira();
        System.out.println("-=--------------------=-");
        zoo.cutucarAnimais();
    }
}
