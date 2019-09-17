import java.util.Scanner;

public class Ex1_10
{
  public static void main(String[] args)
  
 { Scanner sc = new Scanner(System.in);
   double tc;     
   double tf;
   System.out.print("Temperatura em Cº: ");
    tc = sc.nextDouble();
    tf= 1.8*tc+32;
    System.out.printf("Temperatura em Fº: %3.1f\n", tf);
  
  
  }
}
