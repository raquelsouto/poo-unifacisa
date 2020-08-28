import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = entrada.nextInt();
        
        if (numero1 == numero2) {
            System.out.println("Não há múltiplos entre eles");
            return;
        }
        
        if (numero1 > numero2) {
            numero1 = numero1 ^ numero2;
            numero2 = numero1 ^ numero2;
            numero1 = numero1 ^ numero2;
        }
        int contador = 0;
        for (int i = numero1+1; i < numero2; i++) {
            if(i % 4 == 0) {
                ++contador;
            }
        }
        System.out.println("Há " + contador + " múltiplos de 4 entre ]" + numero1 + "," + numero2 + "[");
    }
}
