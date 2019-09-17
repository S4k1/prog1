import java.util.Scanner;

public class Ex5_03 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, m, d;
		String ms;
		
		
		//Loop de Validação
		do{
			System.out.print("\nintroduza o mês:");
			m=sc.nextInt();
			System.out.print("introduza o ano:");
			a=sc.nextInt();
			
			//menssagem de erro
			if (val(a,m)==false){
				System.out.print("\nos valores têm de ser positivos\ne o mês tem de estar no intervalo 1 a 12\n\n");
			}
			
		}while(val(a,m)==false);
		
		
		//Quantidade de dias por mês
		if(m==2){
			if(bis(a)==true){
				ms="29";
			}else{ms="28";}
		}else if(m==4 || m==6 || m==9 || m==11){
			ms="30";
		}else {ms="31";}
		
		//Imperssão dos dados no terminal 
		System.out.println();
		System.out.printf("O mês %d de %d tem ", m, a);
		System.out.print(ms);
		System.out.print(" dias.");
	}
	
	
	//Validação do ano e mês 
	public static boolean val (int a, int m) {
		if (a>=1 && m>=1 && m<=12){
			return true;
		}else {return false;}
	}
	
	//Validação do ano bissexto 
	public static boolean bis (int a){
		if (a%400==0) {
			return true;
		}else if (a%100==0){
			return false;
		}else if (a%4==0) {
			return true;
		}else {
			return false;
		}
	} 
}

