package pt.ua.prog2;
public class Contacto {
  
  public Contacto (String nome, String telefone, String email) {
	  n = nome;
	  tele = telefone;
	  mail = email;
  }
  
  public Contacto (String nome, String telefone) {
	  n = nome;
	  tele = telefone;
  }
  
  public String nome () {
	  return n.toUpperCase();  
  }
  
  public String telefone () {
	  return tele;  
  }
  
  public String email () {
	  return mail;  
  }
  
  private String n;
  private String tele;
  private String mail;
}
