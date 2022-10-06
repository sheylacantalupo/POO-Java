package estrutura_repeticao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);


		int a=0;
		double media;
		
		for (int i=0; i<10; i++) {
			
			System.out.print("Digite um número: ");
			a += entrada.nextInt();
        	
        }  
		
		media= a/10.0;
		
		System.out.print("Média dos números= " + media);
		
		
		

	}

}
