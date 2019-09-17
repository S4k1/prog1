/* Este programa gera uma chave (5 números entre 1 e 50 e duas estrelas entre
 * 1 e 9) para um concurso do euromilhões e mostra a chave ordenada no ecrã.
 * De seguida, o programa lê um ficheiro de apostas (cada linha corresponde a
 * uma aposta: 5 números + 2 estrelas) e armazena as apostas num array 
 * multidimensional com 7 colunas. O número de linhas é igual ao número de 
 * apostas no ficheiro.
 * No final, apresenta os resultados no ecrã no seguinte formato:
 * 
  		Chave:  8 10 38 41 49 +  6  7
		Apostas:
		1:  5  9 12 22 41 +  1  3 (1,0)
		2:  2  4  6  8 10 +  2  4 (2,0)
		3:  5 10 20 30 40 +  7  9 (1,1)
		O número de totalistas foi 0
 * 
 * O para de valores entre parentesis representa o apuramento do resultado,
 * i.e., numeros certos e estrelas certas.
 * 
 * Complete o programa.
 * */

import java.util.Scanner;
import java.io.*;
public class ApostasLimpo {
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args) throws IOException {
		int [] chave = new int[7];
		int [][] apostas;
		int totalistas;
		
		sortearChave(chave, 0, 5, 50);	// sortear cinco números entre 1 e 50
		sortearChave(chave, 5, 7, 9);	// sortear duas estrelas entre 1 e 9
		ordenar(chave, 0, 5);			// ordenar os cinco numeros
		ordenar(chave, 5, 7);			// ordenar as duas estrelas

		System.out.print("Chave:");
		imprimir(chave);
		System.out.println();

		apostas = lerApostas("apostas.txt");	// ler apostas do ficheiro
		totalistas = apurarResultado(chave, apostas);
		System.out.printf("O número de totalistas foi %d\n", totalistas);
	}
	
	/* Sortear números aleatórios: a chave não deve ter valores duplicados.
	 * Preencher os elementos do array chave desde a posição 'primeiro'
	 * (inclusive) até à posição último (exclusive).
	 * Os valores gerados devem ser números inteiros entre 1 e N.
	 * */
	static void sortearChave(int [] chave, int primeiro, int ultimo, int N) {
		for (int i = primeiro; i < ultimo ; i++){
		chave[i] = (int)(Math.random()*N)+1;	
		}
	}
	
	static boolean validar (int [] chave, int primeiro, int ultimo){
		for (int i = primeiro; i < ultimo ; i++){
			for (int u = primeiro; u < i+1 ; u++){
				if (chave[i] == chave[u]){
					return false;
				}
			}	
		}
		return true;
	}
	
	static void imprimir(int [] chave) {
		int i;
		for(i=0; i<5;i++)
			System.out.printf("%3d", chave[i]);
		System.out.print(" +");
		for(i=5; i<7;i++)
			System.out.printf("%3d", chave[i]);		
	}
	
	static int[][] lerApostas(String nomeFicheiro) throws IOException{
		int n;
		String s;
		int [] x = new int [contarLinhas(nomeFicheiro)];
		int nApostas = contarLinhas(nomeFicheiro);
		int [][] apostas = new int [nApostas][7];
		
			Scanner scf = new Scanner(nomeFicheiro);
			while(scf.hasNextLine()) {
				s=scf.nextLine();
				String [] y = s.split("[ \t]");
				
				for (int i = 0; i < y.length; i++){
					x[i] = Integer.parseInt(y[i]);
				}
				
				
			}
			scf.close();
		
		return apostas;
	}
	
	static int contarLinhas(String nomeFicheiro) throws IOException{
		File f = new File(nomeFicheiro);
		int n=0;
		if(f.exists() && f.isFile() && f.canRead()) {
			Scanner scf = new Scanner(f);
			while(scf.hasNextLine()) {
				n++;
				scf.nextLine();
			}
			scf.close();
		}
		return n;
	}
	

	
	static int apurarResultado(int [] chave, int [] [] apostas) {
		return 0;
	}

	/* ordenar um array 's' desde a posição inicio (inclusive) até à posição
	 * fim (exclusive).
	 * Escolher o algoritmo de ordenação que desejar.
	 * */ 
	static void ordenar(int [] s, int inicio, int fim) {
		int r=0, c=0, c1=0;
		do{
			c=c1;
				for (int i = inicio; i < fim-1; i++){
				if (s[i]>s[i+1]){
					s[i]=r;
					s[i]=s[i+1];
					s[i+1]=r;
					c=c+1;
					}
				} 
		}while (c!=c1);
		
	}
	
	static boolean acertou (int numero, int [] chave, int inicio, int fim) {
		while(inicio < fim && numero > chave[inicio])
			inicio++;
		if(inicio == fim) return false;
		else if (numero == chave[inicio]) return true;
		else return false;
	}
}
