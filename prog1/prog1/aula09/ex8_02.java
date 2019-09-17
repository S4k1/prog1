import java.util.Scanner;


public class Ex8_02 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
		ponto[] p =new ponto[400];
		
		double ds=0, dmax=0;
		int n=lerPontos(p), pmf=0; 
		String mf;
		
		for(int i=0; i<n; i++){
			
			ds = ds + distancia(i, p);
			if (dmax<distancia(i, p)){
				dmax=distancia(i, p);
				pmf=i+1;
			}
		}
		
		System.out.printf("A soma das distancias à origem dos %d pontos é %2.2f %n",n ,ds);
		System.out.printf("Ponto mais afastado da origem:");
		imprimirPonto(pmf, p);
	}
	
	//Leitura de pontos
	public static int lerPontos (ponto po[]) {
		
		int c=0;
		for (int i = 0; i < po.length; i++){
			po[i] = new ponto();
			System.out.printf("introduza a abcissa do ponto %d:", i+1);
			po[i].x=sc.nextDouble();
			System.out.printf("introduza a ordenada do ponto %d:", i+1);
			po[i].y=sc.nextDouble();
			
			
			if (po[i].x == 0 && po[i].y == 0){
				c=i-1;
			break;}
		}
		return c;
	}
	
	//Calculo da distancia dos pontos à origem
	public static double distancia (int i, ponto po[]){
		double d;
			d=Math.sqrt(Math.pow(po[i].x,2)+Math.pow(po[i].y,2));
	return d;
	}
	
	//Impressão de pontos
	public static void imprimirPonto (int i, ponto po[]){
			System.out.printf("(%2.2f , %2.2f)", po[i].x, po[i].y);
		
	} 
}


class ponto {
	double x, y;
}

