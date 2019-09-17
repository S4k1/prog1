import java.util.Scanner;

public class Ex2_01 {
	
	public static void main (String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	double tp1, tp2, api, ep;
	double nf; 
	
	System.out.print(" introduza nota TP1:");
	tp1=sc.nextDouble();
	
	System.out.print("\n introduza nota TP2:");
	tp2=sc.nextDouble();
	
	System.out.print("\n introduza nota API:");
	api=sc.nextDouble();
	
	System.out.print("\n introduza nota EP:");
	ep=sc.nextDouble();
	
	//operacao
	
	nf= (10*(tp1+tp2) + api*30 + ep*50)/100;
	
	System.out.printf("\n A nota final, de acordo com os dados introduzidos é %2.2f \n \n", nf);
	
	}
}

