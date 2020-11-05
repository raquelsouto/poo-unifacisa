import java.util.Random;

public class MortalKombat {

    private Lutador lutadorAtaque, lutadorDefesa;

    public void fight(Lutador lutador1, Lutador lutador2) {
        lutadorAtaque = lutador1;
        lutadorDefesa = lutador2;

        System.out.println("Nome do Lutador 1: " + lutador1.getNome());
        System.out.println("Vida Inicial do Lutador 1: " + lutador1.getVida());
        System.out.println("");
        System.out.println("Nome do Lutador 2: " + lutador2.getNome());
        System.out.println("Vida Inicial do Lutador 2: " + lutador2.getVida());
        System.out.println("");
        
        while (lutador1.getVida() > 0 && lutador2.getVida() > 0) {
            sorteiaLutadorParaAtaque(lutador1, lutador2); 

            System.out.println("\nO nome do lutador que irá atacar é: " + lutadorAtaque.getNome());
            System.out.println("Realizando o golpe..");
            sorteiaGolpeERealiza();
            System.out.println("Lutador 1: " + lutador1.getNome() + " Vida " + lutador1.getVida()+ "%");
            System.out.println("Lutador 2: " + lutador2.getNome() + " Vida " + lutador2.getVida() + "%");
            
            try { Thread.sleep(1500); } catch (InterruptedException ex) {}
        }
        
        if(lutador1.getVida() <= 0) {
            System.out.println("O lutador " + lutador2.getNome() + " venceu a luta!");
        } else {
            System.out.println("O lutador " + lutador1.getNome() + " venceu a luta!");
        }
    }

    public void sorteiaLutadorParaAtaque(Lutador lut1, Lutador lut2) {
        Random sorteio = new Random();
        double valor = sorteio.nextDouble();

        if(valor <= 0.5) {
            lutadorAtaque = lut1;
            lutadorDefesa = lut2;
        } else {
            lutadorAtaque = lut2;
            lutadorDefesa = lut1;
        }
    }

    public void sorteiaGolpeERealiza() {

        Random sorteio = new Random();
        double numeroGolpeio = sorteio.nextDouble();

        if(numeroGolpeio <= 0.25) {
            if(lutadorAtaque instanceof Atirador) {
                Atirador lutadorAtirador = (Atirador) lutadorAtaque;
                lutadorAtirador.atirar(lutadorDefesa);
            }
        } else if (numeroGolpeio <= 0.50) {
            lutadorAtaque.chutar(lutadorDefesa);
        } else if (numeroGolpeio <= 0.75) {
            if (lutadorAtaque instanceof Bruxo) {
                Bruxo lutadorLancaMagia = (Bruxo) lutadorAtaque;
                lutadorLancaMagia.lancarMagia(lutadorDefesa);
            }
        } else {
            lutadorAtaque.socar(lutadorDefesa);
        }
    }
}



