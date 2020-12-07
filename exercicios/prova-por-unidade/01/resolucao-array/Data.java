public class Data {
    
    private short dia, mes, ano;
    
    public Data(short dia, short mes, short ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public short getDia() {
        return dia;
    }
    
    public short getMes() {
        return mes;
    }
    
    public short getAno() {
        return ano;
    }
    
    //Fiz essa segunda função toString pra faciltar e deixar o código mais organizado para quando for chamar a data
    // na outra toString dentro de Evento.
    
    public String toString() {
        String saida = "";
        
        saida+= this.dia + "/" + this.mes + "/" + this.ano;
        return saida;
    }
    
}
