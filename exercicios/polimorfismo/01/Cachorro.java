public class Cachorro extends Animal {
    
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    
    public void correr() {
        System.out.println("Cachorro correndo");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }
    
    
}
