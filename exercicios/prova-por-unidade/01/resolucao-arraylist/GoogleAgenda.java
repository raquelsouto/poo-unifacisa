import java.util.ArrayList;
import java.util.List;
public class GoogleAgenda {

    private static final int ArrayList = 0;
    private List<Evento> eventos = new ArrayList<>();
    private int contaEventos = 0;

    public GoogleAgenda() {
        //como nesse caso utiliza-se o ArrayList, não precisa de inicialização
    }

    public void adicionarEvento(Evento e) {
        eventos.add(e);
    }

    public void adicionarEvento(Data diaInicial, Data diaFinal, List<String> participantes) {
        this.adicionarEvento(new Evento(diaInicial, diaFinal, participantes));
    }

    public void imprimirTodosOsEventos() {
        for (int i = 0; i < eventos.size(); i++) {
            System.out.println(eventos.get(i));
        }
    }

    public int getQuantidadeDeEvento() {
        for (int i = 0; i < eventos.size(); i++) {
            contaEventos++;
        }
        return contaEventos;
    }

    public int getQuantidadeEventosSemAglomeracao() {
        int contEventosSemAglomeracao = 0;

        for (int i = 0; i < contaEventos; i++) {
            if(eventos.get(i).getParticipantes().size() <= eventos.get(i).getLimitePessoas()) {
                contEventosSemAglomeracao++;
            }
        }
        return contEventosSemAglomeracao;
    }

    public List<Evento> getEventosNumDia(Data dataEscolhida) {
        int contaEventosMesmoDia = 0;
        List <Evento> listaEventosMesmoDia = new ArrayList<>();

        for (int i = 0; i < eventos.size(); i++) {
            if(eventos.get(i).getDataInicial().getDia() == dataEscolhida.getDia() 
                    && eventos.get(i).getDataInicial().getMes() == dataEscolhida.getMes()
                    && eventos.get(i).getDataInicial().getAno() == dataEscolhida.getAno()) {
                listaEventosMesmoDia.add(eventos.get(i));
                contaEventosMesmoDia++;
            }
        }
        if (contaEventosMesmoDia == 0) {
            return null;
        }
        return listaEventosMesmoDia;
    }

    public Evento getEventoMaisLongo() {
        short duracaoEmDias = this.eventos.get(0).getCalculaDuracaoEmDias();
        int index  = 0;
        int cont = 0;

        for (int i = 0; i < contaEventos; i++) {
            if(eventos.get(i).getCalculaDuracaoEmDias() > duracaoEmDias) {
                cont++;
                index = i;
                duracaoEmDias = eventos.get(i).getCalculaDuracaoEmDias();
            }
        }
        if (cont == 0) {
            return null;
        }
        return eventos.get(index);
    }

    public void removerEventoMaisLongo() {
        Evento evDemorado = getEventoMaisLongo();
        for (int i = 0; i < eventos.size(); i++) {
            if(eventos.get(i).equals(evDemorado)) {
                eventos.remove(eventos.get(i));
            }
        }
        contaEventos -= 1;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < contaEventos; i++) {
            output+= "Evento " + (i+1) + "\n"; 
            output+= eventos.get(i).toString();
        }
        return output;
    }

}
