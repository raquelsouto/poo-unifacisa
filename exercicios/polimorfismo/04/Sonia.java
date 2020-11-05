public class Sonia extends Lutador {

    public Sonia() {
        super("Sonia");
    }
    
    @Override
    public void chutar(Lutador l2) {
        if(l2 != null) {
            super.chutar(l2);
            l2.vida -= 8;
        }
    }
    
    @Override
    public void socar(Lutador l2) {
        if(l2 != null) {
            super.socar(l2);
            l2.vida -= 8;
        }
    }

}
