
public class TestMortalKombat {

    public static void main(String[] args) {
        MortalKombat mk = new MortalKombat();
        
        Lutador lutador1 = new NightWolf();
        Lutador lutador2 = new Rayden();
        
        mk.fight(lutador1, lutador2);
    }

}
