package aula_3;

import java.util.Locale;
import java.util.Scanner;

public class Info {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite eu peso:");
		double peso = entrada.nextDouble();
		
		System.out.println("Agora, digite sua altura:");
		double altura = entrada.nextDouble();
		
		entrada.nextLine();
		
		System.out.println("Peso: "+ peso + "| Altura: " +altura);	
		
		double soma = peso + altura;
		double diferenca= peso - altura;
		
		System.out.println("A soma dos números é: " + soma);
		
		System.out.println("A diferença dos números é: " + diferenca);	
		
		

	}
}
