package switch_case;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int escolha = entrada.nextInt();

		switch (escolha) {

		case 1:
			System.out.println("Pizza");
			break;

		case 2:
			System.out.println("Hambúrguer");
			break;

		case 3:
			System.out.println("Refrigenrante");
			break;

		case 4:
			System.out.println("Batata frita");
			break;

		default:
			System.out.println("Opção inválida");

		}

	}

}
