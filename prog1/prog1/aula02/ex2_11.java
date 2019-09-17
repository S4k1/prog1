import java.util.Scanner;
import java.util.Locale;


public class Ex2_11 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int t;
		double a, b, c, d;
		double r1, r2, i1, i2;
	t=0;
	
	System.out.print("\n Introduza a, b e c da equação (esta deve de estar na forma canónica)");
	System.out.print("\n \n introduza o valor de a:");
	a = sc.nextDouble();
	System.out.print(" introduza o valor de b:");
	b = sc.nextDouble();
	System.out.print(" introduza o valor de c:");
	c= sc.nextDouble();
    
    d= Math.pow(b,2)-(4*a*c);
	
	if (a==0 && b==0){System.out.print("ERRO");
		
		}else if ((a==0 || b==0) && c==0){System.out.print("x=0");
		
		}else if(a!=0) {
	if (b!=0) {
	if (d>=0) {
		r1=((-b) + Math.sqrt(d))/(2*a);
		r2=((-b) - Math.sqrt(d))/(2*a);
		System.out.printf("\n \n x=%2.3f V x=%2.3f", r1, r2);
		}else if (d<0){
			d=d*(-1);
			r1=(-b)/(2*a);
			i1= (Math.sqrt(d))/(2*a);
			i2= (-1)*(Math.sqrt(d))/(2*a);
			System.out.printf("\n \n x=%2.3f+%2.3fi V x=%2.3f%2.3fi", r1, i1, r1, i2);
			}	
		}else if (b==0){
		        if (d>0) { 
					r1=(Math.sqrt(d))/(2*a);
		            r2=(-1)*(Math.sqrt(d))/(2*a);
		            System.out.printf("\n \n x=%2.3f V x=%2.3f", r1, r2);
		            }
		            else if (d<0) {
						d=d*(-1);
						i1= (Math.sqrt(d))/(2*a);
						i2= (-1)*(Math.sqrt(d))/(2*a);
						System.out.printf("\n \n x=%2.3fi V x=%2.3fi", i1, i2);
						}
						}	
	}else if (a==0 && b!=0 && c!=0){
		r1=(-c)/b;
		System.out.printf("\n \n x=%2.3f", r1);
		System.out.print("\n ATENÇÃO: esta é uma equação de 1º grau.");
		}else if (b==0 && c!=0){
		            if (a*c<0) { 
					r1=Math.sqrt(-c/a);
		            System.out.printf("\n \n x=%2.3f", r1);
		            }
		            else if (a*c>0) {
						i1=Math.sqrt(c/a);
		                System.out.printf("\n \n x=%2.3fi", i1);
					}else if (a==0) {
						r1=0;
		            System.out.printf("\n \n x=%2.3f", r1);
					}
		}else {
		System.out.print("ERRO");
		}
 }
}

