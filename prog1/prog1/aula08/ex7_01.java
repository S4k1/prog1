import java.util.*;
import java.io.*;
public class Ex7_01 {
	 
	public static void main (String args[]) throws IOException{
		Scanner sc = new Scanner(System.in);
		String s;
		
		
		
		System.out.print("\n\nIntroduza o nome ou Diretorio do ficheiro:");
		s = sc.nextLine();
		File fin = new File (s);
		Scanner scf = new Scanner(fin);
		
		if (!fin.exists()){
			System.out.print("Erro: Ficheiro inexistente!");
		}else if (!fin.isFile()){
			System.out.print("Erro: o documento não é um ficheiro!");
		}else if (!fin.canRead()){
			System.out.print("Erro: impossivel ler o ficheiro!");
		}
		while (scf.hasNextLine()){
				String r = scf.nextLine();
				System.out.println(r);
			};
		
	}
}


