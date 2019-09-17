import java.io.*;
import java.util.*;
import static java.lang.System.*;
public class copyfile {
	
	public static void main (String args[]) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		
		//inicialização de variaveis
		File of = new File ("default");
		File cf = new File ("default");
		Scanner scf = new Scanner("default");
		char s = 's';
		
		//erro falta de argumentos
		try{
			of = new File (args[0]);
			cf = new File (args[1]);
		}
		catch (ArrayIndexOutOfBoundsException e1){
			System.out.println("Não existem argumentos");
			exit(1);
		}
		
		
		//erro de ficheiro inexistente
		try{
			scf = new Scanner(of);
			
		}
		catch (FileNotFoundException e2){
			System.out.printf("%s não existe \n \n", args[0]);
			exit(2);
		}
		
		
		
		
		//verificação de subscrição de ficheros
		if (cf.exists()){
			System.out.printf("Já existe um ficheiro com o nome %s \n deseja subscerver? \n [s(sim)/n(não)]\n", args[1]);
			do{
				s = sc.next().charAt(0);;
				if (s!='s' && s!='n'){
					System.out.println("resposta invalida!");
				}
				
				
				
			} while (s!='s' && s!='n');
			
		}
		
		if (s == 'n'){
			exit(3);
			
		}
		
		
		
		
		//escrita de ficheiro
		PrintWriter copy = new PrintWriter (cf);
		
		while (scf.hasNextLine())
		{
			copy.println(scf.nextLine());
		}
		
		System.out.println("Ficheiro copiado com sucesso");
		
		scf.close();
		copy.close();
		
	}
	
}

