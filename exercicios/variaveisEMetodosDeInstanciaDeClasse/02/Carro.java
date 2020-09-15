public class Carro {

    String nome, marca;
    CorDoCarro cor;
    int portas;
    boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
    double precoBase;
    boolean promocao;

    Carro (String nome, String marca, double precoBase) {
        this.nome = nome;
        this.marca = marca;
        this.precoBase = precoBase;
        this.portas = 2;
        this.cor = CorDoCarro.BRANCA;
        this.vidroEletrico = false;
        this.arCondicionado = false;
        this.cambioAutomatico = false;
        this.direcaoEletrica = false;
        
    }

    Carro (String nome, String marca, CorDoCarro cor, int portas, boolean vidroEletrico, boolean arCondicionado,
            boolean cambioAutomatico, boolean direcaoEletrica, double precoBase) {
        this.nome = nome;
        this.marca = marca;
        this.precoBase = precoBase;
        this.portas = portas;
        this.cor = cor;
        this.vidroEletrico = vidroEletrico;
        this.arCondicionado = arCondicionado;
        this.cambioAutomatico = cambioAutomatico;
        this.direcaoEletrica = direcaoEletrica;
        
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
           
       } if (promocao == true) {
           preco *= 0.9;
       } 
    return preco;
    
    }
    
    public String toString () {
        String descricao = "";
        descricao+= "Nome do carro: " + this.nome + "\n";
        descricao+= "Marca: " + this.marca + "\n";
        descricao+= "Cor: " + this.cor.corEscolhida + "\n";
        descricao+= "Vidros elétricos: " + (this.vidroEletrico ? "sim" : "não") + "\n";
        descricao+= "Ar condicionado: " + (this.arCondicionado ? "sim" : "não") + "\n";
        descricao+= "Cambio automático: " + (this.cambioAutomatico ? "sim" : "não") + "\n";
        descricao+= "Direção elétrica: " + (this.direcaoEletrica ? "sim" : "não") + "\n";
        descricao+= "Valor total final: R$ " + calculaPreco() + "\n";
        descricao += "Promoção: " + (this.promocao ? "10% de desconto" : "não" + "\n");
        return descricao + "\n";
        
    }

}