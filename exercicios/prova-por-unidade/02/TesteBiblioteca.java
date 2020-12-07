import java.util.ArrayList;
import java.util.List;

public class TesteBiblioteca {

    public static void main(String[] args) {

        Livro l1 = new Livro("Java", "Cicrano", new Data(22, 11));
        Livro l2 = new Livro("Python", "Beltrano", new Data(23, 11));
        Livro l3 = new Livro("Software", "Fumaca", new Data(26, 11));
        Livro l4 = new Livro("Testes", "Faisca", new Data(18, 11));

        System.out.println("\n============================= TESTE GRADUAÇÃO ============================\n");
        
        Biblioteca b = new BibliotecaFacisaGraduacao();
        b.adicionarLivro("Java", "Cicrano", new Data(22, 11));
        b.adicionarLivro("Testes", "Faisca", new Data(18, 11));


        List<Livro> listaMesmoAutor = b.listarLivrosDoAutor("Faisca");

        for (int i = 0; i < listaMesmoAutor.size(); i++) {
            System.out.println(listaMesmoAutor.get(i).toString());
        }

        try {
            double valorTotalDoEmprestimo = b.fazerEmprestimo(l1, 14);
            System.out.println("O valor total do empréstimo é: R$ " + valorTotalDoEmprestimo);
        } catch (LivroEmprestadoException e) {
            e.printStackTrace();
        }

        System.out.println("\n============================= TESTE PÓS-GRADUAÇÃO ============================\n");

        Biblioteca b2 = new BibliotecaFacisaPosGraduacao();
        b2.adicionarLivro("Software", "Fumaca", new Data(26, 11));
        b2.adicionarLivro("Python", "Beltrano", new Data(23, 11));


        List<Livro> listaMesmoAutorPos = b2.listarLivrosDoAutor("Fumaca");

        for (int i = 0; i < listaMesmoAutorPos.size(); i++) {
            System.out.println(listaMesmoAutorPos.get(i).toString());
        }

        try {
            double valorTotalDoEmprestimo = b2.fazerEmprestimo(l2, 14);
            System.out.println("O valor total do empréstimo na pós-graduação é: R$ " + valorTotalDoEmprestimo);
        } catch (LivroEmprestadoException e) {
            e.printStackTrace();
        }
    }
}
