import java.util.ArrayList;
import java.util.List;

public class TesteLocadora {

    public static void main(String[] args) throws CarroInexistenteException {

        Carro c1 = new Carro("Honda", "Fit", 2015, 100);
        Carro c2 = new Carro("Hyundai", "hb20", 2018, 80);
        Carro c3 = new Carro("Volks", "Up", 2020, 80);

        Localiza l = new Localiza();
        l.adicionarCarro("Hyundai", "hb20", 2015, 90);
        l.adicionarCarro("Hyundai", "hb20", 2014, 90);
        l.adicionarCarro("Volks", "Up", 2018, 80);
        l.adicionarCarro("Honda", "Fit", 2015, 100);
        l.adicionarCarro("Hyundai", "hb20", 2013, 90);
        l.adicionarCarro("Hyundai", "hb20", 2012, 90);
        l.adicionarCarro("Volks", "Up", 2012, 80);
        
        List<Carro> listaMesmaMarca = new ArrayList<Carro>();
        listaMesmaMarca = l.listarCarrosDaMarca("Honda");
        
        for (int i = 0; i < listaMesmaMarca.size(); i++) {
            System.out.println(listaMesmaMarca.get(i).toString());
        }

        try {
            l.removerCarro2("Honda", "Fit",  2015);
        } catch (CarroInexistenteException e) {
            e.printStackTrace();   
        }

//        try {
//        l.removerCarro("Honda", "Fit",  2015);
//        } catch (CarroInexistenteException e) {
//         e.printStackTrace();   
//        }
        
        try {
            l.alugarCarro(c1, new Data(18, 11), new Data(26, 11));
        } catch (CarroAlugadoException e) {
            e.printStackTrace();
        }
        
        
    }
    
       
}



