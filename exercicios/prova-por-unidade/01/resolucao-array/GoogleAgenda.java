public class GoogleAgenda {

    private Evento [] eventos;
    private int quantidadeDeEventos = 0;
    private short tempo;


    public GoogleAgenda() {
        this.eventos = new Evento[10];
    }

    public void adicionarEvento(Evento e) {
        eventos[quantidadeDeEventos] = e;
        quantidadeDeEventos++;

        if(quantidadeDeEventos >= 10) {
            Evento novaListaDeEventos [] = new Evento[2*quantidadeDeEventos];

            for (int i = 0; i < eventos.length; i++) {
                novaListaDeEventos[i] = eventos[i];
                quantidadeDeEventos++;
            }
            eventos = novaListaDeEventos;
        }
    }
    public void adicionarEvento (Data diaInicial, Data diaFinal, String[] participantes) {
        Evento evento = new Evento(diaInicial, diaFinal, participantes);
        adicionarEvento(evento);
    }


    public int getQuantidadeDeEventos() {
        return quantidadeDeEventos;

    }

    public short getTempo() {
        return tempo;
    }

    public int getQuantidadeDeEventosSemAglomeração() {
        int cont = 0;

        for (int i = 0; i < quantidadeDeEventos; i++) {
            if(eventos[i].getParticipantes().length <= eventos[i].getLimiteDePessoas()) {
                cont++;
            }
        }
        return cont;
    }

    public Evento [] getEventosNumDia (Data dataEscolhida) {
        Evento [] listaDeEventosNoMesmoDia = new Evento[getQuantidadeDeEventos()];
        int contaDataEvento = 0;

        for (int i = 0; i < eventos.length; i++) {
            if((eventos[i] != null
                    && eventos[i].getDataInicial().getDia() == dataEscolhida.getDia())
                    && eventos[i].getDataInicial().getMes() == dataEscolhida.getMes() 
                    && eventos[i].getDataInicial().getAno() == dataEscolhida.getAno()) {
                listaDeEventosNoMesmoDia[contaDataEvento] = eventos[i];
                contaDataEvento++;
            } 
        } 
        Evento [] outputListaDeEventos = new Evento[contaDataEvento];
        for (int i = 0; i < contaDataEvento; i++) {
            outputListaDeEventos[i] = listaDeEventosNoMesmoDia[i];
        }
        
        return contaDataEvento == 0 ? null : outputListaDeEventos;
       
    }

    public Evento getEventoMaisDemorado() {
        int index = 0;
        short duracaoEmDias = this.eventos[0].getCalculaDuracaoEmDias();

        for (int i = 0; i < quantidadeDeEventos; i++) {
            if(this.eventos[i].getCalculaDuracaoEmDias() > duracaoEmDias) {
                index = i;
                duracaoEmDias = eventos[i].getCalculaDuracaoEmDias();
            }
        }
        return eventos[index];
    }

    public void removerEventoMaisLongo() {
        Evento evMaisDemorad = getEventoMaisDemorado();
        int index = 0;

        for (int i = 0; i < quantidadeDeEventos; i++) {
            if(eventos[i].equals(evMaisDemorad)) {
                index = i;
            }
        }
        eventos[index] = null;
        eventos = removeEventosNulos(eventos);
        quantidadeDeEventos = eventos.length;
    }

    private Evento[] removeEventosNulos(Evento[] evs) {
        int contNaoNulos = 0;

        for (int i = 0; i < evs.length; i++) {
            if(evs[i] != null) {
                contNaoNulos++;
            }
        }
        Evento novaListaDeEventos [] = new Evento [contNaoNulos];
        contNaoNulos = 0;
        for (int j = 0; j < evs.length; j++) {
            if(evs[j] != null) {
                novaListaDeEventos[contNaoNulos] = evs[j];
                contNaoNulos++;
            }
        }
        return novaListaDeEventos;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < quantidadeDeEventos; i++) {
            output += "Evento " + (i+1) + "\n";
            output += eventos[i].toString();
        }
        return output;
    }
    

}



