package manipulação_string;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome_completo = "Sheyla Cantalupo";
		String primeiro = nome_completo.substring(0, nome_completo.indexOf(" "));
		String ultimo = nome_completo.substring(nome_completo.lastIndexOf(" ")+1);
		System.out.println(primeiro);
		System.out.print(ultimo);
	}

}
