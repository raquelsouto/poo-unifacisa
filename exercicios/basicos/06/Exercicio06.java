import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        for(int i = 1; i <= 50; i++) {
            System.out.println("Digite um número: ");
            int numero = entrada.nextInt();
            if (numero % 3 == 0) { 
                soma+= numero;
            }
        }
        System.out.println("O somatório dos números múltiplos de 3 é: " + soma);
    }
}