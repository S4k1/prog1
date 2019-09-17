import java.lang.System.*;
import p2utils.*;
import java.io.*;
import java.util.*;


public class Autentic {
	static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) throws IOException {
		
		boolean b = false;
		String u = "", p = "";
		KeyValueList<String> login = new KeyValueList<>();
		
		File f = new File(args[0]);
		Scanner scf = new Scanner(f);
		
		while (scf.hasNext()){
			login.set(scf.next(), scf.next());
		}
		scf.close();
		
		
		do{
			System.out.print("user : ");
			u = sc.next();
			System.out.print("pass : ");
			p = sc.next();
			
			if (login.contains(u) && login.get(u).equals(p)){
				b = true;
			}else{
				b = false;
			}
			
			
			if(b){
				System.out.println("auntenticated");
				System.out.println();
			}else{
				System.out.println("login failed");
				System.out.println();
			}
		
		} while (!u.equals("00.00"));

		  
	}
	
}

