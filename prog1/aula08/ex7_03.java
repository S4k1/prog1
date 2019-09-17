import java.util.Scanner;
import java.io.*;

public class Ex7_03 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) throws IOException{

		int select;
		int [] sequencia;
		sequencia = new int [50];
		
		do{
			do{
			select=menu();
			}while((select>10 || select<1) && select!=10);
			
			switch (select)
			{
				case 1: sequencia = ler_sequencia(sequencia);
					break;
				
				case 2: imprimir_array(sequencia);
					break;
				
				case 3: System.out.printf("O valor máximo é %2d",calcular_maximo(sequencia));
					break;
					
				case 4: System.out.printf("O valor mínimo é %2d",calcular_minimo(sequencia));
					break;
					
				case 5: System.out.printf("O valor médio é %2d",calcular_media(sequencia));
					break;
					
				case 6: validar_paridade(sequencia);
					break; 
				
				case 7: ler_ficheiro();
					break;
				
				case 8:
					break;
				
				case 9:
					break;
				
					
			}
			
			
			
			
		} while (select!=10);
		
		
	}
	
	//Menu principal
	public static int menu (){
		Scanner sc = new Scanner(System.in);
		int s;
		System.out.println("\n\n");
		System.out.println(" 1 - Ler a sequência");
		System.out.println(" 2 - Escrever a sequência");
		System.out.println(" 3 - Calcular o máximo da sequência");
		System.out.println(" 4 - Calcular o mínimo da sequência");
		System.out.println(" 5 - Calcular a média da sequência");
		System.out.println(" 6 - Detetar se é uma sequência só constituída por números pares");
		System.out.println(" 7 - Ler a sequência de números de um ficheiro de texto");
		System.out.println(" 8 - Adicionar números à sequência existente");
		System.out.println(" 9 - Gravar a sequência atual num ficheiro");
		System.out.println("10 - Terminar o programa");
		System.out.print("\nOpção ->");
		s = sc.nextInt();
		if (s>10 || s<1)
		{
			System.out.print("Erro: Selecione um dos itens do menu");
		}
		
		return s;
		}
	
	//leitura da squencia
	public	static	int[] ler_sequencia (int []sequencia) {
		Scanner sc = new Scanner(System.in);
		int n, i=0;
		
		do{
			
			System.out.print("introduza o valor do item");
			n=sc.nextInt();
			if (n!=0){
				sequencia[i]=n;
				i++;
			}
			
		} while (n!=0);
		
		return sequencia;
	}	
	
	//Impressão da sequencia
	public	static	void imprimir_array (int []sequencia) {
		int n=0;
		for (int i = 0; i < sequencia.length; i++)
		{
			
			if (sequencia[i]!=0){
				System.out.printf("\n %d", sequencia[i]);
			}
			
			 
		}
		
	}
	
	//Calcular máximo
	public	static	int calcular_maximo (int []sequencia) {
		int max=sequencia[1];
		for (int i = 0; i <sequencia.length ; i++){
			if (sequencia[i]>max && sequencia[i]!=0){
				max=sequencia[i];
			}
		}
		
		
		return max;
	}
	
	//Calcular mínimo
	public	static	int calcular_minimo (int []sequencia) {
		int min=sequencia[1];
		for (int i = 0; i <sequencia.length ; i++){
			if (sequencia[i]<min && sequencia[i]!=0){
				min=sequencia[i];
			}
		}
		
		
		return min;
	}
	
	
	//Calcular média
	public	static	int calcular_media (int []sequencia) {
		int media, soma=0, itens=0;
		for (int i = 0; i < sequencia.length; i++)
		{
			if (sequencia[i]!=0){
				soma = soma + sequencia[i];
				itens++;
			}
		}
		media = soma/itens;
		return media;
	}
	
	//Validar paridade
	public	static	void validar_paridade (int []sequencia) {
		int n=0;
		for (int i = 0; i <sequencia.length ; i++){
			if (sequencia[i]%2!=0 && sequencia[i]!=0){
				n=1;
			}
		}
		if (n==1){
			System.out.print("A sequência não é par.");
		}else {System.out.print("A sequência não é impar.");}
		
		}	
	 
	 public static void ler_ficheiro () throws IOException{
		String s;
		
		System.out.print("\n\nIntroduza o nome ou Diretorio do ficheiro:");
		s = sc.nextLine();
		File fin = new File (s);
		Scanner scf = new Scanner(fin);	
		
		while (scf.hasNextLine()){
			String r = scf.nextLine();
			System.out.println(r);
		};
		scf.close();
		 
	 }
}
