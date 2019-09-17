import java.util.Scanner;
import java.util.Locale;

public class Ex2_09 {
	
	public static void main (String args[]) {
	
	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
	int r;
	double f, c;
	
	System.out.print("\n 1: converão de ºF para ºC \n 0: converão de ºC para ºF");
	System.out.print("\n \n introduza 0 ou 1 :");
	r=sc.nextInt();

	if (r==1) {
	   System.out.print("\n introduza a temperatu em ºC:");
	   c=sc.nextDouble();
	   f=1.8*c+32;
	   System.out.printf("\n %2.2f ºC corresponde a %2.2f ºF.", c, f);
	}	else if (r==0) {  
	   System.out.print("\n introduza a temperatu em ºF:");
	   f=sc.nextDouble();
	   c=(f-32)/1.8;
	   System.out.printf("\n %2.2f ºF corresponde a %2.2f ºC.", f, c);;
	}else{
	System.out.print("ERRO");
	}
  }
}

