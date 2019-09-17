import static java.lang.System.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import p2utils.KeyValueList;

public class CountWords
{

  public static void main(String[] args) throws IOException {
    KeyValueList<Integer> counts = new KeyValueList<>();
	
	// Processa cada ficheiro
    for (int a = 0; a < args.length; a++) { 
      File fin = new File(args[a]);
      
      //verifica a integridade do ficheiro
      if (fin.exists() && fin.canRead()) {
        Scanner scf = new Scanner(fin);
        
        // Processa cada linha
        while (scf.hasNext()) { 
          
          String w = scf.next();
          
          if (!counts.contains(w)){
			  counts.set(w, 1);
		  
		  }else{
			  counts.set(w, counts.get(w) + 1);
		  } 
        }
        scf.close();
      
      }else {
        err.println("ERRO: Nao foi possivel ler do ficheiro "+args[a]);
      }
    }
    out.println(counts.toString("Results:\n", ";\n", "\nEnd"));
    out.println(counts.toString()); // mesma lista, outro formato
    /*mostFrequent(counts);*/
  }

  // Find and print the key with most occurrences
  // and its relative frequency.
  static void mostFrequent(KeyValueList<Integer> counts) {

  }
}

