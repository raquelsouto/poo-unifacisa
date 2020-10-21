public class LiuKang extends Lutador {

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
            super.lancarMagia(l2);
            l2.vida -= 8;
        }
    }

}
