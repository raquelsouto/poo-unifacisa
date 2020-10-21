public class Jax extends Lutador {

    public Jax() {
        super("Jax");
    }

    @Override
    public void socar(Lutador l2) {
        if(l2 != null) {
            super.socar(l2);
            l2.vida -= 10;
        }
    }
}
