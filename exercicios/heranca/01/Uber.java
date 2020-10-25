import java.util.ArrayList;
import java.util.List;

public class Uber {

    private ContaCorrente contaDaEmpresa;
    private List<Corrida> corridasPendentes;
    private List<Motorista> listaDosMotoristas;


    public Uber() {
        this.contaDaEmpresa = new ContaCorrente(1234, 0.0, "17.895.646/0001-87");
        this.corridasPendentes = new ArrayList<Corrida>();
        this.listaDosMotoristas = new ArrayList<Motorista>();
    }

    public void cadastraMotorista(Motorista m) {
        listaDosMotoristas.add(m);
    }

    public void descadastraMotorista(Motorista m) {
        for (int i = 0; i < listaDosMotoristas.size(); i++) {
            if(listaDosMotoristas.get(i).equals(listaDosMotoristas.get(i).getNome())) {
                listaDosMotoristas.remove(listaDosMotoristas.get(i).getNome());
            }
        }
    }

    public void solicitarCorrida(Corrida solicitacaoDeCorrida) {
        corridasPendentes.add(solicitacaoDeCorrida);
    }

    public void checkCorridaDinamica() {
        double valorCorridaDinamica = 0;

        if (corridasPendentes.size() > 50) {
            for (int i = 0; i < corridasPendentes.size(); i++) {
                valorCorridaDinamica = (corridasPendentes.get(i).PrecoBase()) + 
                        (corridasPendentes.get(i).quantidadeKm * corridasPendentes.get(i).precoDoKm() * 1.1);
                System.out.println("O valor da corrida dinâmica R$ " + valorCorridaDinamica);
            }
        } else {
            System.out.println("Não está com o preço de corrida dinâmica");
        }
    }

    public List<Motorista> getListaDosMotoristas() {
        return listaDosMotoristas;
    }

    public List<Corrida> getCorridasPendentes() {
        return corridasPendentes;
    }

    public ContaCorrente getContaDaEmpresa() {
        return contaDaEmpresa;
    }

    public void mapeiaCorridaParaMotorista() {
        double menorSaldo = listaDosMotoristas.get(0).getContaRecebimento().getSaldo();
        int index = 0;

        for (int i = 0; i < listaDosMotoristas.size(); i++) {
            if(listaDosMotoristas.get(i).getContaRecebimento().getSaldo() < menorSaldo) {
                index = i;
            }
        }
        menorSaldo = corridasPendentes.get(0).PrecoBase() + 
                (corridasPendentes.get(0).quantidadeKm * corridasPendentes.get(0).precoDoKm());
        System.out.println("O valor da corrida foi de R$ " + menorSaldo);

        double valorParaTransferir = listaDosMotoristas.get(index).getContaRecebimento().getSaldo();
        valorParaTransferir = menorSaldo * 0.4;
        System.out.println("O valor transferido para o Uber foi de R$ " + valorParaTransferir);

        valorParaTransferir = menorSaldo * 0.6;
        System.out.println("Foi transferido para o motorista " + listaDosMotoristas.get(index).getNome() + 
                " R$ " + valorParaTransferir);
    }

}


