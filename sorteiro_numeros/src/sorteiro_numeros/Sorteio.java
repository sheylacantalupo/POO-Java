package sorteiro_numeros;

public class Sorteio {

	public static void main(String[] args) {
		
		
//		Este exemplo retorna um número entre dois valores definidos. O valor retornado será maior ou igual a min, e menor que max
		
		for (int cont = 0; cont < 6; cont++) {
			int max = 1;
			int min = 60;
			int x = (int)(Math.random() * (max - min) + min);
			
			System.out.println(x);
		}
		
		
		
	}

}
