import java.util.Scanner;
import java.util.Locale;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner valor = new Scanner(System.in);
        double valor1 = valor.nextDouble();
        double valor2 = valor.nextDouble();
        valor.close();
        
        if (valor1 > valor2) {
            System.out.println("O maior valor é " + valor1);
        
        } else if (valor1 == valor2) { 
            System.out.println("Os valores são iguais");
        
        } else { 
            System.out.println("O maior valor é: " + valor2);
        }
        
    }
}
