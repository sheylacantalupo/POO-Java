package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner entrada = new Scanner(System.in);
		
        System.out.println("1- Adição 2-Subtração 3-Multiplicação 4-Divisão");
		int escolha = entrada.nextInt();
		System.out.println("N1 ");
		double n1 = entrada.nextInt();
		System.out.println("N2");
		double n2 = entrada.nextInt();
		
		double total;

		switch (escolha) {

		case 1:
			total = n1 + n2;
			System.out.println("resposta = " + total);
			break;

		case 2:
			total = n1 - n2;
			System.out.println("resposta = " + total);
			break;
		
		case 3:
			total = n1 * n2;
			System.out.println("resposta = " + total);
			break;
		
		case 4:
			total = n1 / n2;
			System.out.println("Total: R$ "+ total);
			break;
			
			
		default:

			System.out.println("Opção inválida");

		}

	}

}
