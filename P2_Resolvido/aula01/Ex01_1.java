import java.util.Scanner;

public class Ex01_1 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		
		// informaçao em bruto
		String info, sn1, sn2;
		
		//numero
		double op=0, n1, n2, chave=0;
		
		//contador de operçoes
		int c;
		
		//operaçoes
		boolean add, sub, tim, div, verify;
		char atual;
		
		System.out.print("introduza uma conta simples (+, x, :, -) :");
		
		info = sc.nextLine();
		
		//inicializaçao de variaveis
		verify = false;
		add = false;
		sub = false;
		tim = false;
		div = false;
		sn1 = "";
		sn2 = "";
		c=0;
		
		
		for (int i = 0; i < info.length(); i++)
		{
			atual = info.charAt(i);
			
			//reconhecimento de operador
			switch (atual)
			{
				case '+': chave=1;
				verify=true;
				add = true;
				c++;
				break;
				
				case 'x': chave=2;
				verify=true;
				tim = true;
				c++;
				break;
				 
				 case '*': chave=2;
				verify=true;
				tim = true;
				c++; 
				break;
				
				case '-': chave=3;
				verify=true;
				sub=true;
				c++;
				break;
				
				case ':': chave=4;
				verify=true;
				div = true;
				c++;
				break;
				
				case '/': chave=4;
				verify=true;
				div = true;
				c++;
				break;
				
				default:
					
			}
			
			//resgisto do primeiro numero
			if (verify==false)
			{
				atual = info.charAt(i);
				
				sn1= sn1 + atual;
			}
			
			//resgisto do segundo numero
			if (verify)
			{
				if (atual<info.length())
				{
					atual = info.charAt(i+1);
				}
				
				
				sn2 = sn2 + atual;
			}
			
		}
		
		
		
		if (verify==false)
		{
			System.out.print("Não foram encontrados operadores validos. \n");
		}else if (c>1)
		{
			System.out.print("Sintaxe não válida. \n"); 
		}else{
			n1 = Double.parseDouble(sn1);
			n2 = Double.parseDouble(sn2);
			
			if (add)
			{
				op= n1+n2;
			}else if (sub)
			{
				op = n1-n2;
			}else if (tim)
			{
				op=n1*n2;
			}else if (div)
			{
				op=n1/n2;
			}
			
			System.out.printf("%2.2f \n \n", op);
			
			
		}
		
		
	}
	
	
}

