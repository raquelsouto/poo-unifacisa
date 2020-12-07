public class Evento {

    private String [] participantes;
    Data dataInicial, dataFinal;
    static int limiteDePessoas = 300;
    int duracaoEmDias;

    public Evento(Data dataInicial, Data dataFinal, String[] participantes) {
        this.dataFinal = dataFinal;
        this.dataInicial = dataInicial;
        this.participantes = participantes;

    }

    public Data getDataFinal() {
        return dataFinal;
    }
    public Data getDataInicial() {
        return dataInicial;
    }

    public static int getLimiteDePessoas() {
        return limiteDePessoas;
    }

    public String[] getParticipantes() {
        return participantes;
    }

    public String toString() {
        String output = "";

        output+= "Nome dos participantes: ";
        for (int i = 0; i < participantes.length; i++) {
            output += participantes[i] + " | ";
        }
        output += "\n";
        output+= "Data inicial " + dataInicial.toString() + "\n";
        output+= "Data final "   + dataFinal.toString() + "\n";
        output+= "Limite de pessoas " + getLimiteDePessoas() + "\n";
        return output + "\n";
    }

    //Transformei a data que é dada como parâmetro, para se fazer o calculo em dias da mesma, e assim, facilitar
    //nas comparações

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
