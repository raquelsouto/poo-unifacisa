import java.util.ArrayList;
import java.util.List;

public class Evento {

    private List<String> participantes = new ArrayList<>();
    private Data dataInicial, dataFinal;
    private static int limitePessoas;
    int duracaoEmDias;

    public Evento(Data dataInicial, Data dataFinal, List<String> participantes2) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.participantes = participantes2;
    }

    public Data getDataInicial() {
        return dataInicial;
    }

    public Data getDataFinal() {
        return dataFinal;
    }

    public static int getLimitePessoas() {
        return limitePessoas;
    }

    public static void setLimitePessoas(int limitePessoas) {
        Evento.limitePessoas = limitePessoas;
    }

    public List<String> getParticipantes() {
        return participantes;
    }

    public String toString() {
        String output = "Participantes: ";
        for (int i = 0; i < participantes.size(); i++) {
            output += participantes.get(i) + " | ";
        }

        output+= "\nData inicial: " + this.getDataInicial().getDia() + "/" + this.getDataInicial().getMes() + "/" + this.getDataInicial().getAno() + "\n";
        output+= "Data final: " + this.getDataFinal().getDia() + "/" + this.dataFinal.getMes() + "/" + this.getDataFinal().getAno() + "\n";
        output+= "Limite de participantes: " + getLimitePessoas()+ "\n";
        return output;
    }

    public short getCalculaDuracaoEmDias() {
        short duracaoEmDias = 0;
        short dif_dia, dif_mes, dif_ano;
        dif_ano = (short) (this.dataFinal.getAno() - this.dataInicial.getAno());
        dif_mes = (short) (this.dataFinal.getMes() - this.dataInicial.getAno());
        dif_dia = (short) (this.dataFinal.getDia() - this.dataInicial.getDia());

        duracaoEmDias = (short) (dif_dia + dif_mes*30 + dif_ano*365);
        return duracaoEmDias;
    }

}
