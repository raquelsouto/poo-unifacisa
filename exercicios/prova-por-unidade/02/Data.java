
public class Data {
    
    private int dia;
    private int mes;
    
    Data(int dia, int mes) {
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
        String output = "";
        output+= "Data: " + this.dia + "/" + this.mes;
        return output;
    }
    
    public boolean comparaData(Data data) {
        if (data.getDia() == this.dia && data.getMes() == this.mes) {
            return true;
        }
        return false;
    }
}

