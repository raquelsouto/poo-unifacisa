import java.util.Random;

public class Carro {

    private String nome, marca;
    private int portas;
    private boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
    private double precoBase;
    private CorDoCarro cor;
    static boolean promocao;
    private int id;

    Carro (String nome, String marca, int portas, CorDoCarro cor, boolean vidroEletrico, boolean arCondicionado,
            boolean cambioAutomatico, boolean direcaoEletrica, double precoBase) {
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.precoBase = precoBase;
        this.portas = portas;
        this.vidroEletrico = vidroEletrico;
        this.arCondicionado = arCondicionado;
        this.cambioAutomatico = cambioAutomatico;
        this.direcaoEletrica = direcaoEletrica;

        Random random = new Random();
        this.id = random.nextInt(100000);
    }

    double calculaPreco () {
        double preco = precoBase;

        switch(cor) {
        case BRANCA:
        case AZUL:
        case VERMELHA:
        case PRETA: 
            break;
        default: 
            preco += 1000;
        }

        if(vidroEletrico == true) {
            preco+= 1250;
        } if(arCondicionado == true) {
            preco+= 1250;
        } if(cambioAutomatico == true) {
            preco+= 1250;
        } if(direcaoEletrica == true) {
            preco+= 1250;
        }
        return preco;
    }
    public String getMarca() {
        return marca;
    }

    public String getNome() {
        return nome;
    }

    public int getPortas() {
        return portas;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String output = "";
        output+= "Nome do carro: " + this.nome + "\n";
        output+= "Marca: " + this.marca + "\n";
        output+= "Cor: " + this.cor.corEscolhida + "\n";
        output+= "Vidros elétricos: " + (this.vidroEletrico ? "sim" : "não") + "\n";
        output+= "Ar condicionado: " + (this.arCondicionado ? "sim" : "não") + "\n";
        output+= "Cambio automático: " + (this.cambioAutomatico ? "sim" : "não") + "\n";
        output+= "Direção elétrica: " + (this.direcaoEletrica ? "sim" : "não") + "\n";
        output+= "Valor total final: R$ " + calculaPreco() + "\n";
        return output;
    }

}
