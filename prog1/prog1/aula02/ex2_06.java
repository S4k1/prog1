import java.util.Scanner;


public class Ex2_06 {
	
	public static void main (String args[]) {
	
	Scanner sc = new Scanner(System.in);
	int i, p;
	
	System.out.print("introduza um número inteiro:");
	i=sc.nextInt();
	System.out.printf("\n");
	p=i%2;
	
	if (p==1) {
	   System.out.printf("O número introduzido é impar.");
	}	else {  
	   System.out.printf("O número introduzido é par.");
	}
  }
}
