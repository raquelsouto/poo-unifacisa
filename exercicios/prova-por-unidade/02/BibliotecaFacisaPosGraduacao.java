
public class BibliotecaFacisaPosGraduacao extends BibliotecaFacisa {

    private int valorDasDiarias = 2;

    @Override
    public double fazerEmprestimo(Livro livro, int diasEmprestimo) throws LivroEmprestadoException {
        double valorTotal = 0.0;

        int index = checkLivroAlugado(livro);

        if (index >= 0) {
            listLivros.get(index).setEmprestado(true);
            listLivros.get(index).setDiasEmprestimo(diasEmprestimo);
            valorTotal = listLivros.get(index).getDiasEmprestimos() * valorDasDiarias; 
        } else {
            throw new LivroEmprestadoException("O livro está emprestado");
        }
        return valorTotal;
    }
}

