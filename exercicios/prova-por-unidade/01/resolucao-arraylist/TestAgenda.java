import java.util.ArrayList;
import java.util.List;

public class TestAgenda {

    public static void main(String[] args) {

        // Testando Data
        Data data1 = new Data((short)10,(short)5 ,(short)2020);
        Data dataInicialEvento1 = new Data((short)10, (short)5, (short)2020);
        Data dataFinalEvento1 = new Data((short)15, (short)5, (short)2020);
        ArrayList<String> participantes1 = new ArrayList<>();
        participantes1.add("Eduardo");
        participantes1.add("Anna");
        participantes1.add("Maria");
        participantes1.add("Claudia");

        Data data2 = new Data((short)12, (short)5, (short)2020);
        Data dataInicialEvento2 = new Data((short)15, (short)5, (short)2020);
        Data dataFinalEvento2 = new Data((short)21, (short)5, (short)2020);

        List<String> participantes2 = new ArrayList<>();
        participantes2.add("Raquel");
        participantes2.add("Souto");
        participantes2.add("de");
        participantes2.add("Oliveira");
        participantes2.add("Winkeler");
        participantes2.add("Navarro");


        //Alterando o limite de pessoas num evento
        Evento.setLimitePessoas(5);


        //Testando Evento

        Evento evento1 = new Evento(dataInicialEvento1, dataFinalEvento1, participantes1);
        //System.out.println(evento1.toString());


        Evento evento2 = new Evento(dataInicialEvento2, dataFinalEvento2, participantes2);
        //System.out.println(evento2.toString());

        //Testando Agenda

        System.out.println("Adicionando evento.. \n");
        GoogleAgenda minhaAgendaPessoal = new GoogleAgenda();
        minhaAgendaPessoal.adicionarEvento(evento1);
        minhaAgendaPessoal.adicionarEvento(evento2);

        minhaAgendaPessoal.imprimirTodosOsEventos();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-==-=-=-=-=-=-==-=-=-=-");

        System.out.println("A quantidade de eventos adicionados é: ");
        System.out.println(minhaAgendaPessoal.getQuantidadeDeEvento());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-==-=-=-=-=-=-==-=-=-=-");

        System.out.println("Contando o número de eventos que respeita o limite de participantes: ");
        System.out.println(minhaAgendaPessoal.getQuantidadeEventosSemAglomeracao());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-==-=-=-=-=-=-==-=-=-=-");

        System.out.println("Evento que inicia no mesmo dia da data escolhida: ");
        for (int i = 0; i < minhaAgendaPessoal.getEventosNumDia(data1).size(); i++) {
            System.out.println(minhaAgendaPessoal.getEventosNumDia(data1).get(i));
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-==-=-=-=-=-=-==-=-=-=-");
        System.out.println("O evento mais demorado é: ");
        System.out.println(minhaAgendaPessoal.getEventoMaisLongo());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-==-=-=-=-=-=-==-=-=-=-");
        
        System.out.println("Removendo o evento mais longo.. Lista Recente: ");
        minhaAgendaPessoal.removerEventoMaisLongo();
        System.out.println(minhaAgendaPessoal.toString());
    }


}
