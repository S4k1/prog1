import java.io.*;
import p2utils.*;

public class FilterLines {
	
	public static void main (String args[]) throws IOException {
		
		LinkedList <String> small = new LinkedList <Strings>;
		LinkedList <String> med = new LinkedList <Strings>;
		LinkedList <String> big = new LinkedList <Strings>;
		String s = "";
		File f = new File (args[0]);
		Scanner scf = new Scanner(f);
		
		while (f.hasNextLine()){
			s = scf.nextLine;
			if (s.length() < 20){
				small.addFirst(s);
			}else if (s.length() => 20 && s.length <= 40){
				med.addFirst(s);
			}else if (s.length() > 40){
				big.addFirst(s);
			}
			
			small.first()
			
			
			
			
		}
		
		
		
	}
}

