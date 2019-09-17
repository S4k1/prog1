import java.util.Scanner;

public class A90513 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int [] list, dif;
		int n;
		
		//validação e leitura
		do{
			System.out.print("Quantos números pertende inserir?");
			n = sc.nextInt();
			
		} while (n<1);
		
		
		
		
		if (n==1){
			System.out.print("A média das diferenças é inexistente");
		}else{
		
		double med;	
		
		list = ler(n);
			
		// diferenças do array
		dif=diferencaArray(list);
		
		// média de um array
		med = mediaArray(dif);
		
		System.out.printf("A média das diferenças é %2.2f \n", med);	
		}
		
		
		
		
		
		
	}
	
	//leitura de um array
	public static int [] ler (int comp) {
		Scanner sc = new Scanner(System.in);
	
		int [] list = new int [comp];
		
		for (int i = 0; i < comp; i++){
			System.out.printf("Introduza o valor %d:", i+1);
			list[i] = sc.nextInt();
		}
		
		return list;
	}
	
	//indentificção e reunião de todas as diferenças de um array
	public static int [] diferencaArray (int [] array){
		int [] dif=new int [array.length-1];
		for (int i = 0; i < array.length-1; i++){
			dif[i]=array[i]-array[i+1];
			}
		return dif;
	}
	
	//Calculo da média de um array
	public static double mediaArray (int [] array){
		int s = 0;
		double media;
		for (int i = 0; i < array.length; i++){
			s = s + array[i];
		}
		
		media= (double) s/(array.length+1);
		
		return media;
	}
}
