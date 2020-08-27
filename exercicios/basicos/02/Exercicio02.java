import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        
        double somatorio = 0;
        double media = 0;
        for(int i = 1; i <= 3; i++) { 
            double valor = entrada.nextDouble();
            somatorio += valor;
        }
        media = somatorio/3;
        System.out.println("A média é: " + media);
    }

}
