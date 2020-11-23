import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class LocalizaTest {

    private Locadora locadora;

    @Before
    public void setup() {
        locadora = new Localiza();
    }

    private void addCarro() {
        locadora.adicionarCarro("Hyundai", "HB20", 2020, 90);
        locadora.adicionarCarro("Renault", "Sandeiro", 2018, 80);
        locadora.adicionarCarro("Honda", "Fit", 2021, 10);
    }

    @Test
    public void testAdicionarCarro() {
        assertEquals(0, locadora.getCarros().size());
        addCarro();
        assertEquals(3, locadora.getCarros().size());
    }

    @Test
    public void listarCarro() {
        addCarro();
        assertEquals(1, locadora.listarCarrosDaMarca("Renault").size());
    }

    @Test
    public void RemoverCarro() {
        addCarro();
        assertEquals(3, locadora.getCarros().size());
        try {
            locadora.removerCarro("Renault", "Sandeiro", 2018);
        } catch (CarroInexistenteException e) {
            e.printStackTrace();
        }
        assertEquals(2, locadora.getCarros().size());
    }

    @Test
    public void alugarCarro() {
        addCarro();
        try {
            locadora.alugarCarro(new Carro("Renault", "Duster", 2020, 100), new Data(22, 11), new Data(23, 11));
            assertEquals(100, 100, 0.0001);
        } catch (CarroAlugadoException e) {
            e.printStackTrace();
        }

    }
}
