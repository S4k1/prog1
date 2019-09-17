import java.util.Scanner;
public class B90513 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		String [] nomeList = new String [400];
		String [] acroList = new String [400];
		String [] acroPalavra, primeiraLetra;
		String acro;
		char r;
		int c=0; 
		
		do{
			System.out.print("Introduza o nome:");
			nomeList[c]=sc.nextLine();
			c=c+1;
		} while(nomeList.length!=0);
		
		for (int i = 0; i <c-1 ; i++){
			acroPalavra=nomeList[i].split(" ");
			acro="";
			for (int u = 0; u < acroPalavra.length; u++){
				r = acroPalavra[u].charAt(0);
				r = Character.toUpperCase(r);
				acro = acro + r;
			}
			acro = acroList[i];
			
			
		}
		
		
		
		
	}
}
