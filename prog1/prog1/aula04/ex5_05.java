import java.util.Scanner;

public class Ex5_05 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		char d, e;
		int b, h;
		d=('*');
		e=(' ');
		//Leitura e validação dos dados
		do{
			System.out.print("Introduza o comprimento da base:");
			b=sc.nextInt();
			System.out.print("Introduza a altura:");
			h=sc.nextInt();
		}while(b<=0 || h<=0);
		
		
		
		//construção do rectangulo
		System.out.print("\n");
		print(b,d);
		System.out.print("\n");
		
		for (int i=0; i<h-2; i++){
			print(1,d);
			print(b-2,e);
			
			//exeção para base=1
			if (b!=1){
				print(1,d);
			}
			System.out.print("\n");
		}
		
		//exeção para altura=1
		if (h!=1){
			print(b,d);
		}
		
		int nota = (int) (21*Math.random());
	    System.out.printf("%2d", nota);
	}
	
	//Criação da função printNtimes
	public static void print (int c, char a) {
		for (int i=c; i>0; i--){
			System.out.print(a);
		}
	}
	
	
}
