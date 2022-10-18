import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(System.in);
		
		File arquivo = new File("extensao.txt");
		
		String escolha;
		
		// boolean existe = arquivo.exists();
		
		if (!arquivo.exists()){
            arquivo.createNewFile(); 
        }
				
		do {
			
			System.out.println("1- Iserir nome no arquivo 2- Exibir todos os nomes do arquivo 3- Apagar todo arquivo");
			
			escolha = entrada.nextLine();
			
			switch (escolha) {

			case "1":
				      
				FileWriter fileWriter = new FileWriter(arquivo, true);
				BufferedWriter escrever = new BufferedWriter(fileWriter);
				 
	            System.out.println("Texto: ");
	            
	            for (int i = 0; i<2; i++){
	            	String nova_linha = entrada.nextLine();
	            	escrever.append( nova_linha+ "\n"); 
	            }
	                 
	            escrever.close();			
	            break;		
					
			case "2":
				
				FileReader fileReader = new FileReader(arquivo);
	            BufferedReader ler = new BufferedReader(fileReader); 
				
	            String conteudo; 
	            while (ler.ready()){
	                conteudo = ler.readLine();
	                System.out.println(conteudo);
	            }
	            ler.close();
	            break;
							
			case "3":
				arquivo.delete();
				System.out.println("* Arquivo deletado *.");
				break;
			
			case "4":
				System.out.println("Programa encerado!");
				break;

			default:
				System.out.println("Opção inválida");
			
			}
		}while (!escolha.equals("4"));
		
        entrada.close();				
																		                        
	} 	       	        	                       
}


