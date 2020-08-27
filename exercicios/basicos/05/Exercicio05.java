import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        for(int i = 1; i <= 25; i++) {
            System.out.println("Digite um número: ");
            int numero = entrada.nextInt();
            if(numero > 0 && numero % 2 == 0) {
                contador++;
            }
        }
        System.out.println("Total de numeros inteiros e positivos " + contador);
    }
}