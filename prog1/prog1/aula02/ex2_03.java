import java.util.Scanner;


public class Ex2_03 {
	
	public static void main (String args[]) {
	
	Scanner sc = new Scanner(System.in);
	double i;
	
	System.out.print("\n introduza a idade:");
	i=sc.nextDouble();
	
	if (i<=0) {
	   System.out.print("\n ERRO: Idade inferior a zero \n");
	}	else if (i<6) {  
	   System.out.print("\n Entrada gratuita \n");
	}	else if (i>=6 && i<=12) {
	   System.out.print("\n Bilhete de criança \n");
	}	else if (i>=13 && i<=65) {
	   System.out.print("\n Bilhete comum \n");
	}	else {
		System.out.print("\n Bilhete de 3ª idade \n");
	}
  }
}
