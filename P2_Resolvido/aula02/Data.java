import static java.lang.System.*;
import java.util.Calendar;

public class Data {
  private int dia, mes, ano;

  /** Inicia esta data com o dia de hoje. */
  public Data() {
    Calendar today = Calendar.getInstance();

    dia = today.get(Calendar.DAY_OF_MONTH);
    mes = today.get(Calendar.MONTH) + 1;
    ano = today.get(Calendar.YEAR);
  }

  /** Inicia a data a partir do dia, mes e ano dados. */
  public Data(int dia2, int mes2, int ano2) {
	dia=dia2;
	mes=mes2;
	ano=ano2;
  }

  /** Devolve esta data segundo a norma ISO 8601. */
  public String toString() {
    return String.format("%04d-%02d-%02d", ano, mes, dia);
  }

  /** Indica se ano é bissexto. */
  public static boolean bissexto(int ano) {
    return ano%4 == 0 && ano%100 != 0 || ano%400 == 0;
  }

  // Crie métodos para obter o dia, mes e ano da data.
  //...
  public int dia () {
	  return dia;
  }
  
  public int mes () {
	  return mes;
  }
  
  public int ano () {
	  return ano;
  }
  
  
  /** Dimensões dos meses num ano comum. */
  private static final
  int[] diasMesComum = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  
  /** Devolve o número de dias do mês dado. */
  public static int diasDoMes(int mes, int ano) {
    if (bissexto(ano) & mes==2){
		return 29;
	}else{
		return diasMesComum[mes-1];
	}
	
	
  }
static String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
	
  /** Devolve o mes da data por extenso. */ 
  public String mesExtenso() {
	
    return meses[mes-1];
   
  }


  /** Devolve esta data por extenso. */
  public String extenso() {
	
    String s = dia + " de " + mesExtenso() + " de " + ano;
    return s;
  }

  /** Indica se um terno (dia, mes, ano) forma uma data válida. */
  public static boolean dataValida(int dia, int mes, int ano) {
    boolean d=false, m=false;
    if (dia<=diasDoMes(mes, ano) & dia>0){
		d = true;
	}
	
	if (mes<13 & mes>0){
		m = true;
	}
	
	if (m==true && d==true){
		return true;
	}else
	{
		return false;
	}
	
	}


  public void seguinte() {
    if (dia == diasDoMes(mes, ano) & mes==12){
		dia = 1;
		mes = 1;
		ano = ano + 1;
	}else if (dia == diasDoMes(mes, ano)){
		dia = 1;
		mes = mes + 1;
	}else{
		dia = dia + 1;
	}
	
	
	
  }


}

