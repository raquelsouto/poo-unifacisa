public class Cavalo extends Animal {
    
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }
    
    public void correr() {
        System.out.println("Cavalo trotando");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Innnririririri");
    }

}
