
public class Data {

    private int dia;
    private int mes;
    
    public Data(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }
    
    public int getDia() {
        return dia;
    }
    
    public int getMes() {
        return mes;
    }
    
    public String toString() {
        String output ="";
        output+= this.dia + "/" + this.mes;
        return output;
    }
    

    
}
