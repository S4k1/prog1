import java.util.Scanner;
 
public class Ex01_2 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		double nf=0, na;
		
		
		
		
		System.out.print("\n Nota do teste Teórico-Prático:");
		na=nota();
		
		nf = nf + 0.2*na;
		
		System.out.print("\n Nota do Teste 1:");
		na=nota();
		
		nf = nf + 0.15*na;
		
		System.out.print("\n Nota do Teste 2:");
		na=nota();
		
		nf = nf + 0.15*na;
		
		System.out.print("\n Nota do Exame Final:");
		na=nota();
		
		nf = nf + 0.5*na;
		
		System.out.printf("\n Nota Final: %2.2f \n", nf);
	}
	
	static double nota () {
		Scanner sc = new Scanner(System.in);
		double n;
		n=sc.nextDouble();
		
		while (n<0 || n>20)
		{
			System.out.print("\n Erro (0>Nota ou Nota>20) \n Reintroduza a nota:");
			n=sc.nextDouble();
		
		} 
		
		return n;
		
	}

}

