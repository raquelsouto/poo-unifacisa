import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        int somatorio = 0; 
        int contador = 0; 
        while (numero != 100) { 
            System.out.println("Digite um numero: ");
            numero = entrada.nextInt();
            if (numero % 2 == 0 && numero != 0 && numero != 100) {
                somatorio += numero;
                contador += 1;
            }
        } if (contador == 0) {
            System.out.println("Zero");
        } else {
            double media = somatorio/contador;
            System.out.println("A média dos valores pares é: " + media);
        }
    }
}
