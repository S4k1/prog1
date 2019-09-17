import java.util.Scanner;

public class Ex2_02 {
	
	public static void main (String args[]) {
	
	Scanner sc = new Scanner(System.in);
	double n1, n2;
	
	System.out.print("\n introduza o um número:");
	n1=sc.nextDouble();
	System.out.print("\n introduza o outro número:");
	n2=sc.nextDouble();
	
	if (n1==n2) {
		System.out.print("\n Os valores introduzidos são iguais. \n");
		
		} else if (n1>n2) {
			System.out.printf("\n %2.2f é o maior. \n", n1);
	        }
	else System.out.printf("\n %2.2f é o maior. \n", n2);         

	
	
	
	}
}

