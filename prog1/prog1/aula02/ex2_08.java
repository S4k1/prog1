import java.util.Scanner;


public class Ex2_08 {
	
	public static void main (String args[]) {
	
	Scanner sc = new Scanner(System.in);
	int a, b, c;
	int f, d, e;
	System.out.print(" introduza um número inteiro:");
	a=sc.nextInt();
	System.out.print("\n introduza outro número inteiro:");
	b=sc.nextInt();
	System.out.print("\n introduza outro número inteiro:");
	c=sc.nextInt();
	System.out.printf("\n");
	d=0;
	e=0;
	f=0;
	
	if (a!=b && a!=c && b!=c) {
	if (a<b && a<c) {
	   
	   if (b<c) {
		   d=a;
	       e=b;
	       f=c;
	       }
	   else {
		   d=a;
		   e=c;
		   f=b;
	   } 
   }else if (a>b && b<c) {
		if (a<c){
			   d=b;
	           e=a;
        	   f=c;
			   }
		   else {
		       d=b;
    	       e=c;
    	       f=a;
    	       }
    }else if (a>c && b>c) {
		if (a<b){
			   d=c;
	           e=a;
        	   f=b;
			   }
		   else {
			   d=c;
			   e=b;
			   f=a;
			   
			   }
		}
	System.out.printf("\n %2d  %2d  %2d", d, e, f);
}

else {System.out.print("ERRO: existem valores coincidentes!");}
	
}
}
	

