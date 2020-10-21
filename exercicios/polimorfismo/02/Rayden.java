public class Rayden extends Lutador {

    public Rayden() {
        super("Rayden");
    }
    
    @Override
    public void lancarMagia(Lutador l2) {
        super.lancarMagia(l2);
        l2.vida -= 9;
    }

}
