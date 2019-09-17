import java.lang.Math; 
import java.util.Scanner;


public class Ex5_04{
  public static void main (String args[]) {
   
    Scanner sc = new Scanner(System.in);
    
    int m;
    
    //validação da entrada
    do{
      System.out.print("introduza um número entre 1 e 10: ");
      m=sc.nextInt();
      System.out.print("\n");
    }while(m<1 || m>10);
    
    //Impressão dos resultados entre M e 1
    for (int u=m; u>0; u--){
    System.out.printf("%d!= %d \n", u, f(u));
    }
    
  }
  
  //função factorial
  public static int f (int n){
  int a;
  a=1;
  for (int i=1; i<=n; i++){
        a=a*(i);
        }
        return a;
  }
  
  
}
