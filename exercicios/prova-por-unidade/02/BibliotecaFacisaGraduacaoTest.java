import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BibliotecaFacisaGraduacaoTest {

    private BibliotecaFacisa bf;

    @Before
    public void setup() {
        bf = new BibliotecaFacisaGraduacao();
    }

    private void addLivros() {
        bf.adicionarLivro("O pequeno principe", "Antoine S. E", new Data(12, 05));
        bf.adicionarLivro("O codigo Da Vinci", "Dan Brown", new Data(27, 05));
        bf.adicionarLivro("Biblia", "Deus", new Data(25, 12));
        
    }
    
    @Test
    public void TesteAddLivros() {
        assertEquals(0, bf.getLivros().size());
        addLivros();
        assertEquals(3, bf.getLivros().size());
    }

    @Test
    public void TesteListarLivros() {
        addLivros();
        assertEquals(1, bf.listarLivrosDoAutor("Deus").size());
    }
    
    @Test
    public void TesteRemoverLivro() {
        addLivros();
        assertEquals(3, bf.getLivros().size());
        try {
            bf.removerLivro("O codigo Da Vinci", "Dan Brown", new Data(27, 05));
        } catch (LivroInexistenteException e) {
            e.printStackTrace();
        }
        assertEquals(2, bf.getLivros().size());
    }
    
    @Test
    public void TesteRemoverLivroInexistente() {
        addLivros();
        assertEquals(3, bf.getLivros().size());
        try {
            bf.removerLivro("Um dia", "Emma", new Data(23, 8));
        } catch (LivroInexistenteException e) {
            e.printStackTrace();
        }
        assertEquals(2, bf.getLivros().size());
    }

}
