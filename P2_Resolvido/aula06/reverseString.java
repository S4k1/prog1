import static java.lang.System.*;

public class reverseString {
  
  
  public static void main(String[] args) {
    
    String s = invString(args[0], args[0].length());
    out.println(s);
  }

  /** Regista as N primeiras strings da string, de forma inversa. */
  public static String invString(String s, int n) {
    String inv = "";
    if (n > 0){
		inv = s.charAt(n- 1) + invString(s, n-1);
		
	}
	
	return inv;
  }

}

