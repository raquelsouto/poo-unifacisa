public class Musica {
    private String nome, artista, letra;
    private Genero genero;
    private int anoLancamento, quantidadeReproducao;
    private double duracao; 
    

    public Musica(String nome, String artista, Genero genero, String letra, int anoLancamento, double duracao) {
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
        this.letra = letra;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    public String getInformations() {
        String saida = "";
        saida+= "Artista: " + artista + "\n";
        saida+= "Musica: " + nome + "\n";
        saida+= "Letra " + letra + "\n";
        saida+= "Genero " + genero + "\n";
        saida+= "Ano de lançamento: " + anoLancamento + "\n";
        saida+= "Duração: " + duracao + "\n";
        return saida;
    }
    
    public int getAnoLancamento() {
        return anoLancamento;
    }
    
    public double getDuracao() {
        return duracao;
    }
    
    public String getLetra() {
        return letra;
    }
    
    public int getQuantidadeReproducao() {
        return quantidadeReproducao;
    }
    
    public String getNomeDaMusica() {
        return nome;
    }
    
    public String getArtista() {
        return artista;
    }
    
    public Genero getGenero() {
        return genero;
    }
    
}
