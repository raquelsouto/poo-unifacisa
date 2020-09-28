public class TestaSpotify {

    public static void main(String[] args) {
        
        Musica musica1 = new Musica("Fix you", "Coldplay", Genero.INTERNACIONAL, "fix youuu...", 2000, 1.01);
        Musica musica2 = new Musica("Wonderwall", "Oasis", Genero.INTERNACIONAL, "You're my wonderwaaaaalll...", 1995, 4.51);
        Musica musica3 = new Musica("Meu talismã", "Iza", Genero.POP, "Você me traz sorte...", 2018, 3.51);
//        System.out.println(musica1.getInformations());

        Spotify spt1 = new Spotify(10);
        spt1.adicionarMusica(musica1);
        spt1.adicionarMusica(musica2);
        spt1.adicionarMusica(musica3);
//        spt1.adicionarMusica(musica1);
//        spt1.adicionarMusica(musica2);
//        spt1.adicionarMusica(musica3);
//        spt1.adicionarMusica(musica1);
//        spt1.adicionarMusica(musica2);
//        spt1.adicionarMusica(musica3);
//        spt1.adicionarMusica(musica1);
//        spt1.adicionarMusica(musica2);
//        spt1.adicionarMusica(musica3);
        System.out.println(spt1.resumo());
        System.out.println("A lista possui " + spt1.getQuantidadeMusicas() + " musicas");
        spt1.listarMusicaPorArtista("ColdPlay");
        spt1.listarAnoLancamento(2018);
        spt1.listarPorGenero(Genero.INTERNACIONAL);
        
        spt1.musicaMenorDuracao();
        spt1.musicaMaiorDuracao();
        
        
    }
}
