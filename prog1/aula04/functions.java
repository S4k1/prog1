/**
 * Function - Define several functions, and test them.
 * 
 * Nesta classe deve definir novas funções e testá-las na função main.
 * 
 * 
 **/
 
public class Functions {
	
	public static void main (String args[]) {
		// Testar função sqr:
		System.out.printf("sqr(%f) = %f\n", 10.1, sqr(10.1));
		System.out.printf("sqr(%f) = %f\n", -2.0, sqr(-2.0));
	
		// Invoque as funções pedidas no enunciado para as testar:
		// Por exemplo, para testar func f (problema 5.2):
		System.out.printf("f(%d) = %f\n", 5, f(5));

		// Testar as restantes funções desenvolvidas
		System.out.printf("max(%f,%f) = %f\n", 3.1, 5.2, max(3.1, 5.2));
		System.out.printf("max(%d,%d) = %d\n", 3, 2, max(3, 2));
		System.out.printf("p(x)=%dx³+%dx²+%dx+%d -) p(%d)=%f\n", 5, 9, 3, 6, 6, p(5, 9, 3, 6, 6));
		//int ano = getIntPos("Ano? ");
		//System.out.printf("ano = %d\n", ano);
	
	}
	
	/**
	 * sqr - calcula o quadrado de um número (real).
	 * (A classe Math tem uma função para a raiz quadrada, sqrt,
	 * mas falta-lhe uma para o quadrado: sqr colmata essa lacuna!)
	 **/
	public static double sqr(double x) {
		double y;	// variavel para resultado
		y = x*x;	// calculo do resultado a partir dos dados
		return y;	// devolver o resultado
	}
	
	// Defina as funções pedidas no enunciado:
	
	    //fução f
	    public static double f (int x) {
		double r;
		r=1/(1+sqr(x));
		return r;
		}
		
		//funções max
		public static double max (double x, double y){
			double m;
			m=0;
			if (x<y){
				m=y;
			}else  {
				m=x;
			}
			return m;
		}
			
			public static int max (int x, int y){
			int m;
			m=0;
			if (x<y){
				m=y;
			}else if (x>y) {
				m=x;
			}
			return m;
		}
		
		//função p
		public static double p(double a, double b, double c, double d, double x){
			double r;
			r=a*Math.pow(x,3)+b*Math.pow(x,2)+c*x+d;
			return r;
			
		}
}
