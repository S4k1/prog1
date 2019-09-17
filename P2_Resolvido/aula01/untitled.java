import java.util.Scanner;
 


public class untitled {
	
	public static void main (String args[]) {
		String s = "333 - 33";
		Scanner sc = new Scanner(s);
		Double f;
		String c;
		
		
		f=sc.nextDouble();
		System.out.printf("%2.2f \n", f);
		
		c=sc.next();
		System.out.printf("%s \n", c);
		
		f=sc.nextDouble();
		System.out.printf("%2.2f \n", f);
	}
}

