import data.*;

public class Tarefa {
	private Data inicio;
	private Data fim;
	private String desc;
		
	public Tarefa (Data i, Data f, String d) {
		assert i.compareTo(f) < 1 : "A data inicial é posterior à final";
		assert d != "" : "Não existe descrição"; 
		inicio=i;
		fim=f;
		desc=d;
	}
	

}

