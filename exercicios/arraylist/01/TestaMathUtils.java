import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestaMathUtils {

    public static void main(String[] args) {

        // Retornando os divisores de um número qualquer
        ListaMathUtils num = new ListaMathUtils();
        System.out.println("\nO lista dos divisores: ");
        System.out.println(num.calculaDivisores(32));
        
        
        // Encontrando o maior valores de uma lista
        List <Double> valores = new ArrayList<Double>(Arrays.asList(12.4, 43.1, 4.3, 54.0, 6.7));
        System.out.println("\nO maior valor da lista é: ");
        System.out.println(num.computaMaior(valores));
        
        // Encontrando o menor valores de uma lista
        List<Double> menorValor = new ArrayList<>();
       menorValor.add(12.4);
       menorValor.add(43.1);
       menorValor.add(4.3);
       menorValor.add(54.0);
       menorValor.add(6.7);
       System.out.println("\nO menor valor da lista é: ");
       System.out.println(num.computaMenor(menorValor));
       
       // Fazendo a média dos valores de uma lista
       List<Double> medias = new ArrayList<>(Arrays.asList(12.4, 43.1, 4.3, 54.0, 6.7));
       System.out.println("\nA média dos valores da lista é de: ");
       System.out.println(num.computaMedia(medias));
       
       
       // Descobrindo se há algum valor repetido na lista
       List<Double> listValores = new ArrayList<>(Arrays.asList(12.4, 43.1, 2.4, 54.0, 6.7));
       System.out.println("\nExiste números repetidos nessa lista?");
       System.out.println(num.temNumRepetido(listValores));
       
       
        }
 
}

