import static java.lang.System.*;
import java.util.Scanner;

public class TestComplex {
  // Exemplo simples de utilização da class Complex
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int c=0;
   double im=0, re=0;
   String sim, sre;
   
   c=args.length;
   System.out.printf("%d", c);
   if (c==2){
	   sim = args[1];
	   
	   } else if (c==1){
		 sre = args[0];
	     re = Double.parseDouble(sre);
	     System.out.print("/n introduza a parte imaginária:");
		 im = sc.nextDouble();  
	   }else{
	   
			   System.out.print("/n introduza a parte real:");
			   re = sc.nextDouble();
			   System.out.print("/n introduza a parte imaginária:");
			   im = sc.nextDouble();  
		   }

		
		Complex a = new Complex(im, re);
   // Vamos usar métodos do objeto a
		out.println("(" + a.real() + " + " + a.imag() + "i)");
		out.println("  parte real = " + a.real());
		out.println("  parte imaginaria = " + a.imag());
		out.println("  modulo = " + a.abs());
		out.printf("  argumento =  %2.2f\n", a.arg());
  }

}
