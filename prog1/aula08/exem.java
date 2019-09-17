import java.util.Scanner;
import java.io.*;


public class Exem {
	
	public static void main (String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		File fin = new File ("abc.txt");
		Scanner scf = new Scanner(fin);
		int cont=0;

		
		if (!fin.exists()){
			System.out.print("Erro: Ficheiro inexistente!");
		}else if (!fin.isFile()){
			System.out.print("Erro: o documento não é um ficheiro!");
		}else if (!fin.canRead()){
			System.out.print("Erro: impossivel ler o ficheiro!");
		}else
		{
			
			while (scf.hasNextLine()){
				String s = scf.nextLine();
				System.out.print(s);
				cont++;
			}
			System.out.print("\n O ficheiro tem "+cont+" linhas. \n");
			
		}
		
		
		
		
		
	}
}

