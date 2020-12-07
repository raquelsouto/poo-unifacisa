import java.util.List;

public interface Biblioteca {

    public void adicionarLivro(String autor, String titulo, Data data);
    
    public List<Livro> listarLivrosDoAutor(String autor); 
    
    public void removerLivro(String titulo, String autor, Data data) throws LivroInexistenteException;
    
    public double fazerEmprestimo(Livro livro, int diasEmprestimo) throws LivroEmprestadoException;

}
