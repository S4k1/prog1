import java.util.Scanner;

public class Ex1_html {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n, r, s;
		r=0;
		s=0;
		
		//análise e leitura de entradas
		do{
			System.out.print("\nIntroduza um número inteiro:");
			n=sc.nextInt();
			System.out.print("----------------------------------");
			if(n<=0){
			System.out.print("\no valor necessita ser positivo");	
				}
		}while (n<=0);
	System.out.print("\n----------------------------------\n");
		
		//análise de divisores
		System.out.printf("\n \n lista de divisores de %2d:", n);
		for(int i=1; i<n; i++){
			r=n%i;
			if(r==0){
				System.out.printf("\n -) %2d", i);
				s=s+i;
			}
		}
		
		//tipo de número	
		if (s>n){
			System.out.printf("\n\n%2d é um numero abumdante", n);
		}else if (s<n){
			System.out.printf("\n\n%2d é um numero deficiente", n);
		}else {
			System.out.printf("\n\n%2d é um numero perfeito", n);
		}
	
	
	
	}
}

