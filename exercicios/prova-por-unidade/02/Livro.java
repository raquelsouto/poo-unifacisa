
public class Livro {
    
    private String titulo;
    private String autor;
    private Data publicacao;
    private int diasEmprestimo;
    private boolean emprestado;

    public Livro(String titulo, String autor, Data publicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacao = publicacao;
        this.diasEmprestimo = 0;
        this.emprestado = false;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public Data getPublicacao() {
        return publicacao;
    }
    
    public int getDiasEmprestimos() {
        return diasEmprestimo;
    }
    
    public boolean isEmprestado() {
        return emprestado;
    }
    
    public void setDiasEmprestimo(int diasEmprestimo) {
        this.diasEmprestimo = diasEmprestimo;
    }
    
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    
    public boolean comparaLivro(Livro livro) {
        if (livro.getAutor().equals(this.autor) && livro.getTitulo().equals(this.titulo) && livro.getPublicacao().comparaData(this.publicacao)) {
            return true;
        }
        return false;
    }
    
    public String toString() {
        String output = "";
        output+= "Titulo " + this.titulo + " | " + " Autor: " + this.autor +  " | Publicacao: " + this.publicacao.toString();
        return output;
    }
    

}
