public class Rayden extends Lutador implements Bruxo {

    public Rayden() {
        super("Rayden");
    }
    
    @Override
    public void lancarMagia(Lutador l2) {
        l2.vida -= 21;
    }

}
