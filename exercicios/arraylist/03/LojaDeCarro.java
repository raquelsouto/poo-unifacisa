import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LojaDeCarro {

    private List<Carro> carrosDisponiveis = new ArrayList<Carro>();
    private List<Carro> carrosVendidos = new ArrayList<Carro>();
    private List<Integer> idDosCarros = new ArrayList<>();


    public void adicionarCarro(Carro carro) {
        if (checkIdCarro(carro.getId())) {
            carrosDisponiveis.add(carro);
            idDosCarros.add(carro.getId());
        } else {
            System.out.println("Não foi possível adicionar o carro, pois o id já existe");
        }
    }

    private boolean checkIdCarro(int id) {
        if(idDosCarros.indexOf(id) == -1) {
            return true;
        }
        return false;

    }

    public void exibirCarrosDisponíveis() {
        System.out.println("O carros disponíveis são: ");
        for (int i = 0; i < carrosDisponiveis.size(); i++) {
            System.out.println(carrosDisponiveis.get(i).toString());
        }
    }

    public int venderCarro(int id) {
        for (int i = 0; i < carrosDisponiveis.size(); i++) {
            if(carrosDisponiveis.get(i).getId() == id) {
                carrosVendidos.add(carrosDisponiveis.get(i));
                carrosDisponiveis.remove(carrosDisponiveis.get(i));
            }
        } 
        return carrosDisponiveis.size(); //Como não foi especificado o que deveria ser o retorno da função
        //coloquei que seria a quantidade de carros vendidos
    }

    public void adicionarPromocao(int id) {
        Carro.promocao = false;
        double valor = 0;

        for (int i = 0; i < carrosDisponiveis.size(); i++) {
            if(carrosDisponiveis.get(i).getId() == id) {
                Carro.promocao = true;
                valor = (carrosDisponiveis.get(i).calculaPreco()) * 0.85;
                System.out.println("O carro " + carrosDisponiveis.get(i).getNome() + " da marca " + carrosDisponiveis.get(i).getMarca() + " na promoção fica por R$ " + valor);
            }
        }
    }

    public int computaApuradoDasVendas() {
        int acumulado = 0;

        for (int i = 0; i < carrosVendidos.size(); i++) {
            acumulado += carrosVendidos.get(i).calculaPreco();
        }
        return acumulado;
    }

    public void limparVendidos() {
        carrosVendidos.clear();
    }

}
