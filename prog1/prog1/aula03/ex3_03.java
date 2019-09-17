import java.util.Scanner;
public class Ex3_03 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		double max, min, med, nf, ni, n, s; 
		int i;
		
		System.out.print("Introduza um numero:");
		n = sc.nextDouble();
		nf=n;
		
		do{ 
			i=i+1;
			ni=n;
			System.out.print("Introduza outro número:");
			n = sc.nextDouble();
			if(ni>n){
			max=ni;
			}else{max=n;}
			if(ni<n){
			min=ni;
			}else{min=n;}	
			s=ni+n;
			med= s/i;	
			
			}while(n!=nf);
			
			
		
	
	
	
	
	}
}
