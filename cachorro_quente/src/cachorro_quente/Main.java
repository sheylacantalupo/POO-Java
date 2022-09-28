package cachorro_quente;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Escolha uma opção: 0/1 ");
		int comida = entrada.nextInt();
		System.out.println("Escolha quantidade: ");
		int quantidade = entrada.nextInt();
		
		double total;

		switch (comida) {

		case 0:
			total = quantidade * 1.5;
			System.out.println("Cachorro-quente");
			System.out.println("Total: R$ " + total );
			break;

		case 1:
			total = quantidade * 2.0;
			System.out.println("Refrigerante");
			System.out.println("Total: R$ "+ total);
			break;
			
			
		default:

			System.out.println("Opção inválida");

		}

	}

}
