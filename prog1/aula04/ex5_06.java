import java.util.Scanner;

public class Ex5_06{
	
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int a =val("Introduza um número entre 0 e 100:");
		
		
		System.out.print("\n------------------");
		System.out.printf("\n| Tabuada dos %2d |", a);
		System.out.print("\n------------------");
		for (int i=1; i<=10; i++){
			System.out.printf("\n| %2d x %2d |  %3d |", a, i, a*i);
		}
		System.out.print("\n------------------");
		
	}
	
	//função de leitura e validação
	public static int val (String msg){
		Scanner sc=new Scanner(System.in);
		int a;
		do{
			System.out.print(msg);
			a=sc.nextInt();
		}while(a<0 || a>99);
		return a;
	}
}

