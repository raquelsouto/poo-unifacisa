import javax.management.Descriptor;

public class Spotify {
    private Musica [] musicas;
    private int quantidadeMusicas = 0;

    public Spotify() {
        this(10);
    }

    public Spotify(int tamanhoArray) {
        this.musicas = new Musica[tamanhoArray];
    }

    public void adicionarMusica(Musica m) {
        this.musicas [quantidadeMusicas] = m;
        quantidadeMusicas++;
        if(quantidadeMusicas == musicas.length) {
            Musica[] aux = new Musica [2*musicas.length];
            for (int i = 0; i < musicas.length; i++) {
                aux[i] = musicas[i];
            }
            this.musicas = aux;
        }
    }
    public int getQuantidadeMusicas() {
        return quantidadeMusicas;
    }


    public String resumo() {
        String saida = "";

        saida += "=========================================\n";
        saida += "\t\tRESUMO DAS MÚSICAS\n";
        saida += "=========================================\n";

        for (int i = 0; i < quantidadeMusicas; i++) {
            saida += "Nome da Música: " + musicas[i].getNomeDaMusica() + "\n";
            saida += "Artista: " + musicas[i].getArtista() + "\n";
            saida += "\n";
        }

        return saida;
    }

    public void removerMusicaPorNome(String nomeMusica) {
        boolean pularLugar = false;
        for (int i = 0; i < this.quantidadeMusicas; i++) {
            if(musicas[i].equals(nomeMusica)) {
                pularLugar = true;
            }
            if(pularLugar) {
                this.musicas[i] = this.musicas[i+1];
            }
        }
    }

    public void listarMusicaPorArtista(String artista) {
        System.out.println("======= MUSICAS POR ARTISTA ======");
        int contMusicasEncontradas = 0;

        System.out.println("As musicas disponíveis do artista " + artista + " são: " );

        String artistaAux = new String(artista.toLowerCase());

        for (int i = 0; i < quantidadeMusicas; i++) {
            if(musicas[i].getArtista().toLowerCase().equals(artistaAux)) {
                System.out.println(musicas[i].getNomeDaMusica());

                contMusicasEncontradas++;
            }
        }

        if (contMusicasEncontradas == 0) {
            System.out.println("NENHUMA MÚSICA ENCONTRADA!");
        }
    }

    public void listarAnoLancamento(int ano) {
        System.out.println("========= MUSICAS LANÇADAS NO ANO ===========");
        int contMusicasEncontradas = 0;

        System.out.println("As musicas lançadas nos ano " + ano + " são: " );
        for (int i = 0; i < quantidadeMusicas; i++) {
            if(musicas[i].getAnoLancamento() == ano) {
                System.out.println(musicas[i].getNomeDaMusica());
                contMusicasEncontradas++;

            }
        }
        if (contMusicasEncontradas == 0) {
            System.out.println("NENHUMA MUSICA LANÇADA!");
        }

    }

    public void listarPorGenero (Genero genero) {
        System.out.println("========= MUSICAS DO MESMO GÊNERO ===========");
        int contMusicasEncontradas = 0;

        System.out.println("As musicas com o mesmo gênero " + genero);
        for (int i = 0; i < quantidadeMusicas; i++) {
            if(musicas[i].getGenero() == genero) {
                System.out.println(musicas[i].getNomeDaMusica());
                contMusicasEncontradas++;
            }
        }
        if (contMusicasEncontradas == 0) {
            System.out.println("NENHUMA MUSICA COM ESTE GÊNERO!");
        }
    }

    public void musicaMaiorDuracao () {
        System.out.println("========= MUSICAS COM MAIOR DURAÇÃO ===========");
        double tempo = musicas[0].getDuracao();
        int index = 0;

        System.out.println("A musica com maior duração é " );
        for (int i = 0; i < quantidadeMusicas; i++) {
            if(musicas[i].getDuracao() > tempo) {
                tempo = musicas[i].getDuracao();
                index = i;
            } 
        }
        System.out.println(musicas[index].getNomeDaMusica());
    }

    public void musicaMenorDuracao () {
        System.out.println("========= MUSICAS COM MENOR DURAÇÃO ===========");
        int index = 0;

        double tempo = musicas[0].getDuracao();

        System.out.println("A musica com menor duração é " );
        for (int i = 0; i < quantidadeMusicas; i++) {
            if(musicas[i].getDuracao() < tempo) {
                tempo = musicas[i].getDuracao();
                index = i;
            }
        } 
        System.out.println(musicas[index].getNomeDaMusica());
    }
    
    public void QuantidadeReproducao(String nomeMusica) {
        System.out.println("========= MUSICAS COM MENOR DURAÇÃO ===========");
        nomeMusica = nomeMusica.toLowerCase();
        
        int cont = 0;
        for (int i = 0; i < quantidadeMusicas; i++) {
            if(musicas[i].getNomeDaMusica().toLowerCase().equals(nomeMusica)) {
                cont++;
            }
        } if (cont > 0) {
            System.out.println("A musica " + nomeMusica + " foi reproduzida " + cont + " vezes " );
       
        } else {
            System.out.println("NENHUMA!");
        
        }
    }
    
}
