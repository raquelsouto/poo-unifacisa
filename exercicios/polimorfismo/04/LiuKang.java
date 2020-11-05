public class LiuKang extends Lutador implements Bruxo {

    public LiuKang() {
        super("Liu Kang");
    }
    
    @Override
    public void chutar(Lutador l2) {
        if(l2 != null) {
            super.chutar(l2);
            l2.vida -= 9;
        }
    }
    
    @Override
    public void lancarMagia(Lutador l2) {
            if(l2 != null) {
                l2.vida -= 20;
            }
    }

}
