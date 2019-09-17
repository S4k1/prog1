import java.util.Scanner;

public class Ex3_02 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		double n, r;
		System.out.print("Introduza um número:");
		n=sc.nextDouble();
		r=1;
		
		if (n!=0) {
			
			while (n!=0){
		    r=r*n;
		    System.out.print("Introduza outro número:");
		    n=sc.nextDouble();
		    }
			
			}else{
				r=0;
				}
			
		
		System.out.printf("%2.2f", r);
		
		
	}
}

