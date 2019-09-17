import java.util.Scanner;

public class Ex3_01 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		double n;
		int i;
		i=0;
		
		System.out.print("Introduza um número:");
		n=sc.nextDouble();

		while (n>0){ 
			i= i+1;
			System.out.print("Introduza outro número:");
		    n=sc.nextDouble();

			
			}
			
			System.out.printf("Foram escritos %d numeros antes de %2.2f.", i, n);
		
		
		
	}
}



