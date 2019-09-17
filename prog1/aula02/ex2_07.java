import java.util.Scanner;


public class Ex2_07 {
	
	public static void main (String args[]) {
	
	Scanner sc = new Scanner(System.in);
	int a, b, c;
	
	System.out.print(" introduza um número inteiro:");
	a=sc.nextInt();
	System.out.print("\n introduza outro número inteiro:");
	b=sc.nextInt();
	System.out.print("\n introduza outro número inteiro:");
	c=sc.nextInt();
	System.out.printf("\n");
	
	if (a>c && a>b) {
	   System.out.printf("%2d é o maior.", a);
	}	else if (b>c) {  
	   System.out.printf("%2d é o maior.", b);
	}else{
	System.out.printf("%2d é o maior.", c);
	}
  }
}
