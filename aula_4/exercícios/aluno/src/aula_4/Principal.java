package aula_4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		String nota1 = entrada.next();
		
		System.out.println("Digite a primeiro nota:");
		String nota2 = entrada.next();
		
		System.out.println("Digite a primeiro nota:");
		String nota3 = entrada.next();
		
		double n1 = Double.parseDouble(nota1);
		double n2 = Double.parseDouble(nota2);
		double n3 = Double.parseDouble(nota3);
		
		double media = (n1 + n3 + n3) ;
		
		
		System.out.println("Média = " + media);
		
		

	}

}
