public class CampeonatoDeFutebol {

    private String [] times;
    private int quantidadeTimes = 0;

    public CampeonatoDeFutebol() {
        this.times = new String[10];
    }

    public void adicionarTimes(String nomeDosTimes) {
        String[] aux = nomeDosTimes.split(" ");

        for (int i = 0; i < aux.length; i++) {
            if(aux[i] != null) {
                times[i] = aux[i];
                quantidadeTimes++;
            }
        }

        String [] novaListaDosTimes = new String[quantidadeTimes];
        for (int i = 0; i < quantidadeTimes; i++) {
            novaListaDosTimes[i] = aux[i];
        }

        times = novaListaDosTimes;
    }

    public String[] criarCampeonato() {
        String[] advA = new String[50];
        String[] advB = new String[50];
        int contConfrontos = 0;
        
        for (int i = 0; i < times.length; i++) {
            for (int j = 0; j < times.length; j++) {
                if(i != j) {
                    advA[contConfrontos] = times[i];
                    advB[contConfrontos] = times[j];
                    contConfrontos++;
                }
            }
        }
        
        advA = removeEspacosVazios(advA);
        advB = removeEspacosVazios(advB);
        
        for (int i = 0; i < advB.length; i++) {
            for (int j = 0; j < advB.length; j++) {
                if((advA[i] != null) && (advB[i] != null) && (i != j) && (advA[i].equals(advB[j])) && (advB[i].equals(advA[j]))) {
                    advA[j] = null;
                    advB[j] = null;
                }
            }
        }
        
        advA = removeEspacosVazios(advA);
        advB = removeEspacosVazios(advB);
        
        String[] listConfronto = new String[advA.length];
        
        for (int i = 0; i < advA.length; i++) {
            listConfronto[i] = advA[i] + " X " + advB[i];
        }
        
        return listConfronto;
    }

    public String toString() {
        String output = "";

        for (int i = 0; i < quantidadeTimes; i++) {
            output += "Nome do Time: " + times[i] + "\n";
        }
        return output;
    }

    String[] removeEspacosVazios(String[] list) {
        int contNotNull = 0;
        for (int i = 0; i < list.length; i++) {
            if(list[i] != null) {
                contNotNull++;
            }
        }
        
        String [] auxList = new String[contNotNull];
        contNotNull = 0;
        
        for (int i = 0; i < list.length; i++) {
            if(list[i] != null) {
               auxList[contNotNull] = list[i];
               contNotNull++;
            }
        }
        
        return auxList;
    }
    
    public int getQuantidadeTimes() {
        return quantidadeTimes;
    }

}
