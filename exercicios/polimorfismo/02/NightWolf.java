public class NightWolf extends Lutador {

    public NightWolf() {
        super("NightWolf");
    }

    @Override
    public void atirar(Lutador l2) {
        if(l2 != null) {
            super.atirar(l2);
            l2.vida -= 5;
        }
    }
    
    @Override
    public void lancarMagia(Lutador l2) {
        if(l2 != null) {
            super.lancarMagia(l2);
            l2.vida -= 6;
        }
    }
    
}
