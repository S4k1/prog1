import static java.lang.System.*;
import data.*;

public class TestData3 {

  public static void main(String[] args) {
    
    out.println(Data.diasDoMes(1, 2000)); // should work
    out.println(Data.diasDoMes(12, 2000)); // should work
    
    // Descomente cada uma das instruções abaixo e volte a testar
    
    
    
    
    Data d = new Data(29, 2, 2000); // should work
    // check it:
    assert d.dia()==29 && d.mes()==2 && d.ano()==2000;
    
    // Descomente cada uma das instruções abaixo e volte a tes

    
    // Testar seguinte():
    Data today = new Data();
    d = new Data();
    out.println(d);
    // avança 400 anos, dia-a-dia:
    for (int n = 0; n < 400*365+100*1-3; n++) {
      d.seguinte();
    }
    out.println(d);
    assert d.dia() == today.dia();
    assert d.mes() == today.mes();
    assert d.ano() == today.ano()+400;  //exactly 400 years from now!
    
    out.println("Class Data passed all tests.");
  }

  // Check if program is being run with -ea, exit if not.
  static {  // A static block. Cool!
    boolean ea = false;
    assert ea = true; // assert with a side-effect, on purpose!
    if (!ea) {
      err.println("This program must be run with -ea!");
      exit(1);
    }
  }


}
