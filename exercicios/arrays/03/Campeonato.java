
public class Campeonato {

    public static void main(String[] args) {

        CampeonatoDeFutebol time1 = new CampeonatoDeFutebol();
        time1.adicionarTimes("Treze Campinense BotafogoPB Autoesporte");

        System.out.println(time1.toString());

        System.out.println("Imprimindo a lista de confrontos..");
        for (int i = 0; i < time1.criarCampeonato().length; i++) {
            System.out.println(time1.criarCampeonato()[i]);
        }
    }
}


