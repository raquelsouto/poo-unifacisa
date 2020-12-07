public class TestaAgenda {

    public static void main(String[] args) {
        
        //Testando Data 
        Data data1 = new Data((short)23, (short)9, (short)2020);
        
        Data dataInicialEvento1 = new Data((short) 23, (short) 9, (short) 2020);
        Data dataFinalEvento1   = new Data((short) 28, (short) 9, (short) 2020);
        String [] participantesEvento1 = {"Raquel", "Ana", "Maria", "João"} ;
        
        Data data2 = new Data ((short)12, (short)5, (short)1993);
        
        Data dataInicialEvento2 = new Data((short)12, (short)5, (short)2020);
        Data dataFinalEvento2 = new Data((short)17, (short)5, (short)2020);
        String [] participantesEvento2 = {"Antonio", "Susy", "Andrea", "Raquel"};
        
        Data data3 = new Data ((short)23, (short)9, (short)2020);
        
        Data dataInicialEvento3 = new Data((short)23, (short)9, (short)2020);
        Data dataFinalEvento3 = new Data((short)30, (short)9, (short)2020);
        String [] participantesEvento3 = {"Bia", "Carol", "Andrea", "Rita", "Otávio", "Ramos"};
        
        
        Data data4 = new Data ((short)12, (short)9, (short)2020);
        Data dataInicialEvento4 = new Data((short)12, (short)5, (short)2020);
        Data dataFinalEvento4 = new Data((short)12, (short)9, (short)2020);
        String [] participantesEvento4 = {"Bia", "Carol"};
        
        //Testando Evento
        
        Evento evento1 = new Evento(dataInicialEvento1, dataFinalEvento1, participantesEvento1);
        System.out.println(evento1.toString());
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        Evento evento2 = new Evento(dataInicialEvento2, dataFinalEvento2, participantesEvento2);
        System.out.println(evento2.toString());
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        
        Evento evento3 = new Evento(dataInicialEvento3, dataFinalEvento3, participantesEvento3);
        System.out.println(evento3.toString());
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        
        Evento evento4 = new Evento(dataInicialEvento4, dataFinalEvento4, participantesEvento4);
        System.out.println(evento4.toString());
        
        
        // Testando a Agenda
        GoogleAgenda minhaAgendaPessoal = new GoogleAgenda();
        minhaAgendaPessoal.adicionarEvento(evento1);
        minhaAgendaPessoal.adicionarEvento(dataInicialEvento1, dataFinalEvento1, participantesEvento1);
        minhaAgendaPessoal.adicionarEvento(evento2);
        minhaAgendaPessoal.adicionarEvento(dataInicialEvento2, dataFinalEvento2, participantesEvento2);
        minhaAgendaPessoal.adicionarEvento(evento3);
        minhaAgendaPessoal.adicionarEvento(dataInicialEvento3, dataFinalEvento3, participantesEvento3);
        minhaAgendaPessoal.adicionarEvento(evento4);
        minhaAgendaPessoal.adicionarEvento(dataInicialEvento4, dataFinalEvento4, participantesEvento4);
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        
        System.out.println("O evento mais demorado é: ");
        System.out.println(minhaAgendaPessoal.getEventoMaisDemorado()+ "\n");
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        
        System.out.println("O número de eventos é: ");
        System.out.println(minhaAgendaPessoal.getQuantidadeDeEventos()+ "\n");
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        
        System.out.println("O número de eventos que respeita o limite de participantes é: ");
        System.out.println(minhaAgendaPessoal.getQuantidadeDeEventosSemAglomeração()+ "\n");
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        
        System.out.println("Eventos num dia: ");
        for (int i = 0; i < minhaAgendaPessoal.getEventosNumDia(data1).length; i++) {
            System.out.println(minhaAgendaPessoal.getEventosNumDia(data1)[i]);
        }
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        
        System.out.println("Removendo o evento mais demorado:  ");
        minhaAgendaPessoal.removerEventoMaisLongo();
        
        System.out.println(minhaAgendaPessoal.toString());
       

        
    }

}
