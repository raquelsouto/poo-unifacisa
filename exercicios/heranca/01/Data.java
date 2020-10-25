public class Data {

    private int dia, mes, ano, hora, minuto, segundo;
    
    Data(int dia, int mes, int ano, int hora, int minuto, int segundo) { 
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public int getDia() {
        return dia;
    }
    
    public int getMes() {
        return mes;
    }
    
    public int getAno() {
        return ano;
    }
    
    public int getHora() {
        return hora;
    }
    
    public int getMinuto() {
        return minuto;
    }
    
    public int getSegundo() {
        return segundo;
    }
    
    public String toString() {
        String output = "";
        output+= getDia() + "/" + getMes() + "/" + getAno() + "\n";
        output+= getHora() + ":" + getMinuto() + ":" + getSegundo() + "\n";
        return output;
    }
}

    
