public class Carro {

    String m_nome, m_marca;
    CorDoCarro m_cor;
    int m_portas;
    boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
    double m_precoBase;

    Carro() {
        this.m_nome = "Gol";
        this.m_marca = "Volkswagen";
        this.m_cor = CorDoCarro.VERMELHA;
        this.m_portas = 4;
        this.vidroEletrico = true;
        this.arCondicionado = true;
        this.cambioAutomatico = true;
        this.direcaoEletrica = true;
        this.m_precoBase = 55000;
    }

    Carro (String nome, String marca, double precoBase) {
        this.m_nome = nome;
        this.m_marca = marca;
        this.m_precoBase = precoBase;
        this.m_portas = 2;
        this.m_cor = CorDoCarro.BRANCA;
        this.vidroEletrico = false;
        this.arCondicionado = false;
        this.cambioAutomatico = false;
        this.direcaoEletrica = false;
    }

    Carro (String nome, String marca, CorDoCarro cor, int portas, boolean vidroEletrico, boolean arCondicionado,
            boolean cambioAutomatico, boolean direcaoEletrica, double precoBase) {
        this.m_nome = nome;
        this.m_marca = marca;
        this.m_precoBase = precoBase;
        this.m_portas = portas;
        this.m_cor = cor;
        this.vidroEletrico = vidroEletrico;
        this.arCondicionado = arCondicionado;
        this.cambioAutomatico = cambioAutomatico;
        this.direcaoEletrica = direcaoEletrica;
    }
    
    double calculaPreco () {
       double preco = m_precoBase;
       
       switch(m_cor) {
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
    
    public String toString () {
        String descricao = "";
        descricao+= "Nome do carro: " + this.m_nome + " \n";
        descricao+= "Marca: " + this.m_marca + " \n";
        descricao+= "Cor: " + this.m_cor.corEscolhida + "\n";
        descricao+= "Vidros elétricos: " + (this.vidroEletrico ? "sim" : "não") + "\n";
        descricao+= "Ar condicionado: " + (this.arCondicionado ? "sim" : "não") + "\n";
        descricao+= "Cambio automático: " + (this.cambioAutomatico ? "sim" : "não") + "\n";
        descricao+= "Direção elétrica: " + (this.direcaoEletrica ? "sim" : "não") + "\n";
        descricao+= "Valor total final: R$ " + calculaPreco() + "\n";
        return descricao;
    }

}