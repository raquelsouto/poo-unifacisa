import java.util.Scanner;
import java.io.IOException;

public class Main {
	
		public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String dinheiroString = scanner.nextLine();
		dinheiroString = dinheiroString.replace(',','.');
		double valor = Double.parseDouble(dinheiroString);
		
		//------------ DIVIDINDO AS NOTAS -----------
		valor += 0.001;
				
		int nota100 = (int)(valor/100);
		valor = valor - (nota100*100);
		int nota50 = (int)(valor/50);
		valor = valor - (nota50*50);
		int nota20 = (int)(valor/20);
		valor = valor - (nota20*20);
		int nota10 = (int)(valor/10);
		valor = valor - (nota10*10);
		int nota5 = (int)(valor/5);
		valor = valor - (nota5*5);
		int nota2 = (int)(valor/2);
		valor = valor - (nota2*2);
		
		// ------------ DIVIDINDO AS MOEDAS -------
						
		int moeda1 = (int)(valor/1);
		valor = valor - (moeda1*1);
		int moeda50 = (int)(valor/0.50);
		valor = valor - (moeda50*0.50);
		int moeda25 = (int)(valor/0.25);
		valor = valor - (moeda25*0.25);
		int moeda10 = (int)(valor/0.10);
		valor = valor - (moeda10 *0.10);
		int moeda05 = (int)(valor/0.05);
		valor = valor - (moeda05 *0.05);
		int moeda01 = (int)(valor/0.01);
		valor = valor - (moeda01 *0.01);
		
		System.out.println("NOTAS:");
		System.out.println(nota100 + " nota(s) de R$ 100.00");
		System.out.println(nota50 + " nota(s) de R$ 50.00");
		System.out.println(nota20 + " nota(s) de R$ 20.00");
		System.out.println(nota10 + " nota(s) de R$ 10.00");
		System.out.println(nota5 + " nota(s) de R$ 5.00");
		System.out.println(nota2 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(moeda1 + " moeda(s) de R$ 1.00");
		System.out.println(moeda50 + " moeda(s) de R$ 0.50");
		System.out.println(moeda25 + " moeda(s) de R$ 0.25");
		System.out.println(moeda10 + " moeda(s) de R$ 0.10");
		System.out.println(moeda05 + " moeda(s) de R$ 0.05");
		System.out.println(moeda01 + " moeda(s) de R$ 0.01");
	} 

}
