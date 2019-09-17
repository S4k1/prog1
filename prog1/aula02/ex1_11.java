import java.util.Scanner;

public class Ex1_11
{
  public static void main(String[] args)
  
 { Scanner sc = new Scanner(System.in);
   double d;     
   double e;
   double c;
   System.out.print("Montante em dolares: ");
    d = sc.nextDouble();
   System.out.print("Taxa de converção: ");
    c = sc.nextDouble();
    e = d*c;
    System.out.printf(" %4.2f$ equivalem a %4.2f€.\n", d, e);
  
  
  }
}
