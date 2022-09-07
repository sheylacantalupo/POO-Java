package salário;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o nome do funcinário?");
		String nome = entrada.next();
		
		System.out.println("Qual o valor da hora trabalhada?");
		String vh = entrada.next();
		
		System.out.println("Quantas horas trabalhou esse mês?");
		String hm = entrada.next();
		
	
		double valor_hora = Double.parseDouble(vh);
		double horas_trabalhadas = Double.parseDouble(hm);
		
		double salario = horas_trabalhadas * valor_hora;
		
		System.out.println("Funcionário: " + nome + "\n");
		System.out.println("Valor da hora: " + valor_hora + " | " + "Horas trabalhadas:" + horas_trabalhadas + " | \nTotal a receber: R$" + salario );
		
		
		
		
		

	}

}
