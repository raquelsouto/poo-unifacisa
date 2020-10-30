import java.util.ArrayList;
import java.util.List;

public class Uber {

    private ContaCorrente contaDaEmpresa;
    private List<Corrida> listaCorridasPendentes;
    private List<Motorista> listaMotoristas;
    boolean corridaDinamica = false;


    public Uber() {
        this.contaDaEmpresa = new ContaCorrente(1234, 0.0, "17.895.646/0001-87");
        this.listaCorridasPendentes = new ArrayList<Corrida>();
        this.listaMotoristas = new ArrayList<Motorista>();
    }

    public void cadastraMotorista(Motorista m) {
        listaMotoristas.add(m);
    }

    public void descadastraMotorista(Motorista m) {
        for (int i = 0; i < listaMotoristas.size(); i++) {
            if(listaMotoristas.get(i).equals(listaMotoristas.get(i).getNome())) {
                listaMotoristas.remove(listaMotoristas.get(i).getNome());
            }
        }
    }

    public void solicitarCorrida(Corrida solicitacaoDeCorrida) {
        listaCorridasPendentes.add(solicitacaoDeCorrida);
    }

    private void checkCorridaDinamica() {
        double valorCorridaDinamica = 0;

        if (listaCorridasPendentes.size() > 50) {
            for (int i = 0; i < listaCorridasPendentes.size(); i++) {
                valorCorridaDinamica = (listaCorridasPendentes.get(i).valorDaCorridaFinal() * 1.1);
                System.out.println("\tO valor da corrida dinâmica R$ " + valorCorridaDinamica);
            }
        } else {
            System.out.println("\tNão está com o preço de corrida dinâmica");
        }
    }

    public List<Motorista> getListaDosMotoristas() {
        return listaMotoristas;
    }

    public List<Corrida> getCorridasPendentes() {
        return listaCorridasPendentes;
    }

    public ContaCorrente getContaDaEmpresa() {
        return contaDaEmpresa;
    }

    private int verificaMotoristaComMenorSaldo() {
        double menorSaldo = listaMotoristas.get(0).getContaRecebimento().getSaldo();
        int index = 0;

        for (int i = 0; i < listaMotoristas.size(); i++) {
            if(listaMotoristas.get(i).getContaRecebimento().getSaldo() < menorSaldo) {
                menorSaldo = listaMotoristas.get(i).getContaRecebimento().getSaldo();
                index = i;
            }
        }
        return index;
    }
    
    public void mapeiaCorridaParaMotorista() {

        if(listaCorridasPendentes.size() <= 0) {
            System.out.println("Não foi possível realizar a operação. Não existem solicitações de corridas.");
            return;
        }
        
        if(listaMotoristas.size() <= 0) {
            System.out.println("Não foi possível realizar a operação. Não existem motoristas adicionados.");
            return;
        }
        
        Motorista motoristaComMenorSaldo = listaMotoristas.get(verificaMotoristaComMenorSaldo());
        Corrida corridaMapeada = listaCorridasPendentes.get(0);
        
        checkCorridaDinamica();
        double valorDaCorrida = corridaMapeada.valorDaCorridaFinal();

        //Transferir para a conta do uber 40% do valor
        double valorParaTransferirParaUber = valorDaCorrida * 0.4;
        this.contaDaEmpresa.depositar(valorParaTransferirParaUber);
        System.out.println("\tO valor transferido para o Uber foi de R$ " + valorParaTransferirParaUber);

        //Transferir para a conta do motorista 60% do valor
        double valorParaTransferirParaOMotorista = valorDaCorrida - valorParaTransferirParaUber;
        motoristaComMenorSaldo.getContaRecebimento().depositar(valorParaTransferirParaOMotorista);
        System.out.println("\tFoi transferido para o motorista R$" + valorParaTransferirParaOMotorista);
                
        System.out.println("\tO saldo do UBER é: R$ " + contaDaEmpresa.getSaldo());
        
        System.out.println("\tO nome do MOTORISTA é: " + motoristaComMenorSaldo.getNome());
        System.out.println("\tO saldo do Motorista é: R$ " + motoristaComMenorSaldo.getContaRecebimento().getSaldo());
        
        //Adicionar ao histórico do motorista
        motoristaComMenorSaldo.adicionaCorridaAoHistorico(corridaMapeada);
        
        //Remove a corrida pendente, pois sempre estou mapeando a primeira corrida da lista de corridas pendentes
        listaCorridasPendentes.remove(0);
    }

}