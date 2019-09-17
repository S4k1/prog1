import java.util.Scanner;
import java.io.*;
public class Ex7_02 {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException{
		if(args.length < 1) {
			System.out.println("Erro: nº de parâmetros inválido");
			System.exit(1);
		}
		File f = new File(args[0]);
		if(!(f.exists() && f.isFile() && f.canRead())){
			System.out.println("Erro no acesso ao ficheiro");
			System.exit(2);			
		}
		double [] x = new double[100];
		int n = 0;
		Scanner scf = new Scanner(f);
		while(scf.hasNextDouble() && n<x.length) {
			//System.out.println(scf.nextLine());
			x[n++] = scf.nextDouble();
		}
		scf.close();
		
		// imprime
		for(int i=0; i < n; i++)
			System.out.println(x[i]);
	}
}

