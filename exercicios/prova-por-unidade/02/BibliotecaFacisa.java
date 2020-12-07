import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class BibliotecaFacisa implements Biblioteca {

    protected List<Livro> listLivros;

    public BibliotecaFacisa() {
        this.listLivros = new ArrayList<Livro>();
    }

    public List<Livro> getLivros() {
        return listLivros;
    }

    @Override
    public void adicionarLivro(String titulo, String autor, Data data) {
        listLivros.add(new Livro(titulo, autor, data));
    }
    
    @Override
    public List<Livro> listarLivrosDoAutor(String autor) {
        List<Livro> novaListaMesmoAutor = new ArrayList<Livro>();
        
        
        for (int i = 0; i < listLivros.size(); i++) {
            Livro l = listLivros.get(i);
            if(l.getAutor().equals(autor)) {
                novaListaMesmoAutor.add(listLivros.get(i));
            }
        }
        return novaListaMesmoAutor;
    }
    
    @Override
    public void removerLivro(String titulo, String autor, Data data) throws LivroInexistenteException {
        Iterator<Livro> it = this.listLivros.iterator();
        boolean encontrou = false;
        
        while(it.hasNext()) {
            Livro l = it.next();
            
        if(l.getTitulo().equals(titulo) && l.getAutor().equals(autor) && 
                    (l.getDiasEmprestimos() == l.getDiasEmprestimos())) {
                encontrou = true;
                it.remove();
            }
        }
        
        if(!encontrou) {
            throw new LivroInexistenteException("Esse livro não existe");
        }
    }
    
    protected int checkLivroAlugado(Livro livro) {
        int index = -1;
        
        for (int i = 0; i < listLivros.size(); i++) {
            Livro l = listLivros.get(i);
            
            if(l.comparaLivro(livro) && l.isEmprestado() == false) {
                index = i;
            } 
        }
        return index;
    }
    

}

