import java.util.Scanner;

public class Ex8_01 {
  static final Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    
    Hora inicio;  // tem de definir o novo tipo Hora!
    Hora fim;
    
    //hora de início
    inicio = new Hora();
    inicio.h = 9;
    inicio.m = 23;
    inicio.s = 5;
    
    //informação da hora de inicio
    System.out.print("\nComeçou às ");
    printHora(inicio);  
    System.out.println(".");
    
    System.out.println("Quando termina?");
    fim = lerHora();  
    System.out.print("Início: ");
    printHora(inicio);
    System.out.print(" Fim: ");
    printHora(fim);
	System.out.println();
  }
	
	//imprimir hora
	public static void printHora (Hora horario) {
		System.out.printf("%02d:%02d:%02d", horario.h, horario.m, horario.s);
		
	}
  
  //Leitura da hora
  public static Hora lerHora () {
	int limSup, limInf=0;
	Hora x;
	x = new Hora();
	
	limSup=24;
	
	//validação de dados
	do{
		System.out.print("introduza a hora:");
		x.h=sc.nextInt();
	} while (x.h>limSup || x.h<limInf);
	
	limSup=60;
	do{
		System.out.print("introduza os minutos:");
		x.m=sc.nextInt();
	} while (x.m>limSup || x.m<limInf);
	
	do{
		System.out.print("introduza os segundos:");
		x.s=sc.nextInt();
	} while (x.s>limSup || x.s<limInf);
	
	
	//retorno da class de hora final
	return x;
  }
}

//definição da class hora
class Hora {
	int h, m, s;
}

