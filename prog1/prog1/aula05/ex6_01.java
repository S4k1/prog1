import java.util.Scanner;

public class Ex6_01 {
	
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);	
		int [] n;
		int nu;
		
		//leitura e validação do numero de itens
		do{
			System.out.print("\n introduza o número total de itens da lista:");
			nu =sc.nextInt();
		 }while (nu<1);
		n = new int [nu];
		
		//leitura da lista
		for (int i=0; i<nu; i++) {
			System.out.printf("\n \nintroduza o %dº item da lista:", i+1);
			n[i]=sc.nextInt();	
		}
		
		//impressão dos valores na ordem inversa
		for (int i=nu-1; i>-1; i--){
			System.out.printf("%d; ", n[i]);
		}
	}
}

