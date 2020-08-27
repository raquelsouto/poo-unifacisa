import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
    Scanner produto = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    System.out.println("Digite o nome do produto: ");
    String nomeProduto = produto.next();
    System.out.println("Digite o valor do produto R$ ");
    double valorProduto = produto.nextDouble();
    produto.close();
    
    if(valorProduto > 0 && valorProduto < 100) {
        double desconto = valorProduto * 0.95;
        System.out.println("O valor total final do produto R$ " + desconto);
        System.out.println("O produto é: " + nomeProduto);
    } else if (valorProduto > 100 && valorProduto < 500) {
        double desconto = valorProduto * 0.90;
        System.out.println("O valor total final do produto R$ " + desconto);
        System.out.println("O produto é: " + nomeProduto);
    } else if (valorProduto > 500) {
        double desconto = valorProduto * 0.85;
        System.out.println("O valor total final do produto R$ " + desconto);
        System.out.println("O produto é: " + nomeProduto);
    }
    
    }

}