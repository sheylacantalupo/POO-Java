package aula_5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
	
		
		System.out.println("Qual a sua idade?");
		int idade = entrada.nextInt();
		
		
		if (idade >= 18) {
			System.out.println("Parabéns, você pode ser preso");
			
		}
		else {
			System.out.println("Não pode");
			
		}
		

	}

}
