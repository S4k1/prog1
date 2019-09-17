import java.util.Scanner;

public class Ex8_01 {
  static final Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    
    Hora inicio;  // tem de definir o novo tipo Hora!
    Hora fim;
    
    inicio = new Hora();
    inicio.h = 9;
    inicio.m = 23;
    inicio.s = 5;
    
    System.out.print("Começou às ");
    printHora(inicio);  // crie esta função!
    System.out.println(".");
    System.out.println("Quando termina?");
    fim = lerHora();  // crie esta função!
    System.out.print("Início: ");
    printHora(inicio);
    System.out.print(" Fim: ");
    printHora(fim);
  }
  public static void printHora (hora inicio) {
	system.ou.printf("%2d:%2d:%2d", inicio.h, incio.m, inicio.s);
	
  }
  
  public static void lerHora () {
	  
  }
}

class Hora {
	int h, m, s;
	
	
}

/**
EXEMPLO do pretendido:
$ java TestaHora
Começou às 09:23:05.
Quando termina?
horas? 11
minutos? 72
minutos? 7
segundos? 2
Início: 09:23:05 Fim: 11:07:02.
**/
