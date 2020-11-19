import java.util.ArrayList;
import java.util.List;

public abstract class Locadora implements LocadoraDeCarro{

    protected List<Carro> listaDeCarros;

    public Locadora() {
        this.listaDeCarros = new ArrayList<Carro>();
    }

    public List<Carro> getCarros() {
        return listaDeCarros;
    }

    @Override
    public void adicionarCarro(String marca, String modelo, int ano, double diaria) {
        listaDeCarros.add(new Carro(marca, modelo, ano, diaria));
    }

    @Override
    public List<Carro> listarCarrosDaMarca(String marca) {
        List<Carro> novaListaDeCarrosDaMesmaMarca = new ArrayList<Carro>();

        for (int i = 0; i < listaDeCarros.size(); i++) {
            if(listaDeCarros.get(i).getMarca().equals(marca)) {
                novaListaDeCarrosDaMesmaMarca.add(listaDeCarros.get(i));
            }
        }

        return novaListaDeCarrosDaMesmaMarca;
    }

    @Override
    public void removerCarro(String modelo, String marca, int ano) throws CarroInexistenteException{
        for (int i = listaDeCarros.size()-1; i > 0; i--) {
            if (listaDeCarros.get(i).getModelo().equals(modelo) && listaDeCarros.get(i).getMarca().equals(marca) && 
                    listaDeCarros.get(i).getAno() == ano) {
                listaDeCarros.remove(listaDeCarros.get(i));
            } else { 
                throw new CarroInexistenteException("[Locadora] Não existe esse carro na lista.");
            }
        }
    }
    
    public int getCalculaDuracaoEmDias(Data dataInicio, Data dataFim) {
        int duracaoEmDias = 0;
        int dif_dia, dif_mes;
        
        dif_mes = dataFim.getMes() - dataInicio.getMes();
        dif_dia = dataFim.getDia() - dataInicio.getDia();

        duracaoEmDias = (dif_dia + dif_mes*30);
        return duracaoEmDias;
    }
    
    public int checkCarroAlugado(Carro carro) {
        int index = -1;
        
        for (int i = 0; i < listaDeCarros.size(); i++) {
            Carro c = listaDeCarros.get(i);
            if(c.comparaCarro(carro) && c.isAlugado() == false) {
                index = i;
            } 
        }
        System.out.println(index);
        return index;
    }
}
