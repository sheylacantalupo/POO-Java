package sorteiro_numeros;

public class Sorteio {

	public static void main(String[] args) {
		
		
//		Este exemplo retorna um número entre dois valores definidos. O valor retornado será maior ou igual a min, e menor que max
		
		int[] numeros = new int[6];
		
		int i = 0;
		while(i<10) {
			
			for (int cont = 0; cont < 6; cont++) {
				
				int max = 1;
				int min = 60;
				numeros[cont] = (int)(Math.random() * (max - min) + min);			
				
			}
			
			i++;
			
			for (int cont = 0; cont < 6; cont++) {
				
				System.out.print(numeros[cont]);
				if (cont < 5) {
					
					System.out.print("-");
				}
			}
			
			System.out.print("\n");					
		}
		
		
		
		
		
	}

}
