import java.util.Scanner;

public class Ex6_02 {
	
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);	
		int [] n, po;
		int nu, u, i, p, ca, cb;
		i=0;
		ca=0;
		cb=0;
		n = new int [100];
		po = new int [100];
		
		//leitura e validação do numero de itens
		do{

			u=1;
			System.out.print("\n introduza 100 ou um numero menor que zero para terminar");
			System.out.print("\n introduza o  %2dº número da lista:");
			nu =sc.nextInt();
			if(nu!=100 && nu>=0){
				n[i]=nu;
				i=1000;
			}
			i++;
			u=u+1;
		 }while (i<100 && n[i-1]>=0);
		 
		 
		 System.out.print("\n introduza o valor a procurar:");
		 p=sc.nextInt();
		 for (int o=0; o<n.length; i++){
			 if (n[o]==p) {
			 	 o=po[ca];
			 	 ca++;	 
			 }
		 }
		
		System.out.printf("\n Foram encontrados %d resultados", ca);
		System.out.print("nas posições:");
		
		 for (int o=0; o<po.length; i++){
			 System.out.printf("%d",po[o]);	 
			 }
	

}
}

