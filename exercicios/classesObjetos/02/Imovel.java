public class Imovel {

    String tipo, imobiliaria;
    int pavimentos, pavimento, numeroQuarto, numeroSuite;
    int numeroBanheiro, metrosQuadrados;
    boolean elevador, piscina, quadra;

    Imovel (String imobiliaria, int quarto, int suite, int banheiro, int metrosQuadrados, boolean piscina, boolean quadra) {
        this.tipo = "Casa";
        this.metrosQuadrados = metrosQuadrados;
        this.imobiliaria = imobiliaria;
        this.numeroQuarto = quarto;
        this.numeroSuite = suite;
        this.numeroBanheiro = banheiro;
        this.piscina = piscina;
        this.quadra = quadra;
    }

    Imovel(String imobiliaria, int pavimentos, int pavimento, int quarto, int suite, int banheiro, 
            int metrosQuadrados, boolean elevador, boolean piscina, boolean quadra) {
        this.tipo = "Apartamento";
        this.imobiliaria = imobiliaria;
        this.pavimentos = pavimentos;
        this.pavimento = pavimento;
        this.numeroQuarto = quarto;
        this.numeroSuite = suite;
        this.numeroBanheiro = banheiro;
        this.metrosQuadrados = metrosQuadrados;
        this.elevador = elevador;
        this.piscina = piscina;
        this.quadra = quadra;
    }

    double calculaPreco() {
        double valorAdicional = 0;
        int qtdePavimentos = 0;

        if (pavimento > 4) {
            qtdePavimentos = pavimento - 4;
            valorAdicional = qtdePavimentos * 2000;
        } if (elevador == true) {
            valorAdicional += 2500;
        } if (piscina == true) { 
            valorAdicional += 2500;
        } if (quadra == true) {
            valorAdicional+= 2500;
        }
        return (metrosQuadrados * 5000) + valorAdicional;
    }

    public String toString() { 
        String descricao = "";
        descricao += "Tipo: " + this.tipo + "\n";
        descricao += "Imobiliária: " + this.imobiliaria + "\n";
        descricao += "Número total de pavimentos: " + this.pavimentos + "\n";
        descricao += "Andar: " + this.pavimento + "\n";
        descricao += "Quarto(s): " + this.numeroQuarto + "\n";
        descricao += "Suíte(s): "+ this.numeroSuite + "\n";
        descricao += "Banheiro(s): " + this.numeroBanheiro + "\n";
        descricao += "Metros quadrados: " + this.metrosQuadrados + "m2 \n";
        descricao += "Elevador: " + (this.elevador? "sim" : "não") + "\n";
        descricao += "Piscina: " + (this.piscina? "sim" : "não") + "\n";
        descricao += "Quadra: " + (this.quadra? "sim" : "não") + "\n";
        descricao += "Valor total final R$: " + calculaPreco() + "\n";
        return descricao;
    }

}

