import java.util.ArrayList;
import java.util.Iterator;
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
    
    public void adicionarCarro(Carro c) {
        adicionarCarro(c.getMarca(), c.getModelo(), c.getAno(), c.getDiaria());
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
    public void removerCarro(String marca, String modelo, int ano) throws CarroInexistenteException{
        boolean encontrou = false;
        
        for (int i = listaDeCarros.size()-1; i >= 0; i--) {
            Carro c = listaDeCarros.get(i);
            if (c.getModelo().equals(modelo) && c.getMarca().equals(marca) && c.getAno() == ano) {
                listaDeCarros.remove(i);
                encontrou = true;
            }
        }
        
        if (!encontrou) {
            throw new CarroInexistenteException("[Locadora] Não existe esse carro na lista.");    
        }
    }
    
    //Outra maneira de remover um carro.
    public void removerCarro2(String marca, String modelo, int ano) throws CarroInexistenteException{
        Iterator<Carro> it = this.listaDeCarros.iterator();
        boolean encontrou = false;
        
        while (it.hasNext()) {
            Carro c = it.next();
            if(c.getMarca().equals(marca) && c.getModelo().equals(modelo) &&
              c.getAno() == ano) {
                encontrou = true;
                it.remove();
            }
        }
        
        if (!encontrou) {
            throw new CarroInexistenteException("[Locadora] Não existe esse carro na lista.");    
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
