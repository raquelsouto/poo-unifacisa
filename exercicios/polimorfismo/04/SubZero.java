public class SubZero extends Lutador implements Bruxo {

    public SubZero() {
        super("SubZero");
    }

    @Override
    public void lancarMagia(Lutador l2) {
        if(l2 != null) {
            l2.vida -= 20;
        }
    }
    
}
