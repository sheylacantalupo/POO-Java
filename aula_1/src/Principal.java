import java.util.Scanner;
//import  java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
//	    System.out.println("Hello Word");
//		String nome;
//		nome = "Maria";
//		String filme = "titanic";
//		String novo_nome = entrada.nextLine();
//		LocalDate data = LocalDate.now();
//		int ano = data.getYear();
//		int idade = ano - entrada.nextInt();
//		System.out.println("Boa noite " + novo_nome + ".\nSua idade é " + idade + " anos!");
		System.out.println("Digite um número:");
		int n1 = entrada.nextInt();
		System.out.println("Agora, digite um nome:");
		entrada.nextLine();
		String nome = entrada.nextLine();
		System.out.println("O número digitado foi " + n1 + " e o nome foi " + nome);		
		entrada.close();

	}
	
	public static void go() {
		System.out.println("Entrei no método go");
		
	}

}
