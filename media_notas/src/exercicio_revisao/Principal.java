package exercicio_revisao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		
		System.out.println("Digite a 1ª nota:");
		String nota1_str = entrada.next();
		System.out.println("Digite a 2ª nota:");
		String nota2_str = entrada.next();
		System.out.println("Digite a 3ª nota:");
		String nota3_str = entrada.next();
		
		double nota1 = Double.parseDouble(nota1_str);
		double nota2 = Double.parseDouble(nota2_str);
		double nota3 = Double.parseDouble(nota3_str);
		
		double media = (nota1 + nota2 + nota3)/3;
		
		if(media > 70 ) {
			System.out.println("Aprovado. Média final = " + media);
		}
		else {
			System.out.println("Reprovado. Média final = " + media);
		}
		
	}

}
