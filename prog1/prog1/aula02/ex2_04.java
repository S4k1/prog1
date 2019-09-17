import java.util.Scanner;


public class Ex2_04 {
	
	public static void main (String args[]) {
	
	Scanner sc = new Scanner(System.in);
	int a, m;
	int d;
	
	
	System.out.print("\n introduza o numero do mês:");
	m=sc.nextInt();
	
	if (m>13 && m>1) {System.out.print(" \n ERRO: nº de mês > 12");}
	
	else {
	
	System.out.print(" introduza o ano:");
	a=sc.nextInt();

	if ((m ==4||m ==6||m ==9||m ==11)) {
		d=30;
		}else if(m==2) {
			if (a%400==0) { 
				d=29;
				}else if (a%100==0){
					d=28;
					}else if (a%4==0) {
					d=29;
					}else {
					d=28;
					}
			}else {
				d=31;
			}
			
		System.out.printf("\n O mês %2d do ano %2d tem %2d dias. \n \n", m, a, d);
}
}
}
		
	


