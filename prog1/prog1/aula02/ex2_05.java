
import java.util.Scanner;


public class Ex2_05 {
	
	public static void main (String args[]) {
	
	Scanner sc = new Scanner(System.in);
	double xp1, yp1, xp2, yp2, xp3, yp3, xp4, yp4;
	double a, b, c, d, h1, h2, e, f;
	double x, y, z, w;
	
	
	//Instrucões
	System.out.print("Coloque os pontos de forma consecutiva, na forma (x,y) \n pressionando enter após cada componente.\n");
	
	//p1
	System.out.print("\n introduza as coordenadas do 1º ponto:\n");
	System.out.print("x=");
	xp1=sc.nextDouble();
	System.out.print("y=");
	yp1=sc.nextDouble();
	//p2
	System.out.print("\n introduza as coordenadas do 2º ponto:\n");
	System.out.print("x=");
	xp2=sc.nextDouble();
	System.out.print("y=");
	yp2=sc.nextDouble();
	//p3
	System.out.print("\n introduza as coordenadas do 3º ponto:\n");
	System.out.print("x=");
	xp3=sc.nextDouble();
	System.out.print("y=");
	yp3=sc.nextDouble();
	//p3
	System.out.print("\n introduza as coordenadas do 4º ponto:\n");
	System.out.print("x=");
	xp4=sc.nextDouble();
	System.out.print("y=");
	yp4=sc.nextDouble();
	 System.out.print("\n \n \n");
		                              //Método
	//Sendo P1, P2, P3 e P4 lados consecutivos de um quadrado, respetivamente,
	//Admitindo que P1 é o vertice oposto de P3, e
	//sendo uma circunferência c de centro P1 e raio r1 (P1 a P2), então uma
	//circunferência a com o mesmo centro mas de raio r2 (P1 a P4) terá o raio de mesmo comprimento,
	//Pois r1 e r2 terão o comprimento dos lados.
	//O mesmo sucederá se, considerando o mesmo problema, P1 for substituido por P3.
	//Assim basta considerar os valores dos raios para se verificar se os seus comprimentos correspondem.
	//Por fim apenas se necessita verificar se as diagonais correspondem
	//ao calculado atravez do teorema de Pitágoras. 
	//Se o teorema de pitagoras não se aplicar então não existem ângulos retos.
	//Se os lados não são iguais ou não existem ângulos retos, a condição de quadrado não se verifica.
	
	//declives
	//w=(xp4-xp1)/(yp4-yp1);
	//x=(xp2-xp1)/(yp2-yp1);
	//y=(xp3-xp2)/(yp3-yp2);
	//z=(xp4-xp3)/(yp4-yp3);
	
	//Valor do quadrado dos raios
	a=Math.pow(xp2-xp1,2)+Math.pow(yp2-yp1,2);
	d=Math.pow(xp4-xp1,2)+Math.pow(yp4-yp1,2);
	b=Math.pow(xp2-xp3,2)+Math.pow(yp2-yp3,2);
	c=Math.pow(xp4-xp3,2)+Math.pow(yp4-yp3,2);
	
	//Valor das diagonais
	h1=Math.sqrt(d+a);
	h2=Math.sqrt(c+b);
	e= Math.sqrt(Math.pow(xp3-xp1,2)+Math.pow(yp3-yp1,2));
	f= Math.sqrt(Math.pow(xp4-xp2,2)+Math.pow(yp4-yp2,2));
	
	//Analise de dados
	
	//System.out.printf("Erro: introduzio as coordenadas de uma reta. %2.2f", e);
	//if (x==y) {
	//		if(z==w){
	//		 System.out.print("Erro: introduzio as coordenadas de uma reta. \n");
	//}else {
	// System.out.print("Erro: introduzio as coordenadas de é um triangulo. \n");
	//}
	//}
	
	
	if (a==c && b==d && h1==h2 && f==h1 && e==h2) {
		
		System.out.print("O polígono é um quadrado.");
		System.out.print("\n ............. \n");
		
		}else {
			System.out.print("O não polígono é um quadrado. \n");
			}
		
		}
		
	
	}

		
	
