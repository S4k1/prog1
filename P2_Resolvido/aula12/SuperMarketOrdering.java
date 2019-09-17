import p2utils.*;


public class SuperMarketOrdering {
		private Queue<Order> Fila = new Queue<>();
		private KeyValueList<Integer> ProdList= new KeyValueList<>();
		private int numOrders;
	
	public SuperMarketOrdering () {}
	
	public SuperMarketOrdering (Order o) {enterOrder(o);}
	
	
	//encomnda
	public void enterOrder(Order o){
		//inserção de encomenda na lista 
		Fila.in(o);
		
		//inicialização de variaveis
		int quant = 0;
		
		//verificação de produtos semelhantes
		if (ProdList.contains(o.prodName())){
			
		//quantidade total de produto pedida
			quant = ProdList.get(o.prodName()) + o.quantity();
		}else{
			quant = o.quantity();
		}
		
		//atualização de dicionario geral de encomendas
		ProdList.set(o.prodName(), quant);
		numOrders = numOrders + o.quantity(); 
	}
	
	//entrega
	public Order serveOrder(){
		
		//inicialização de variaveis
		Order o = Fila.peek();
		int quant = 0;
		
		
		//verificação de quantidade removida
		if (ProdList.get(o.prodName()) - o.quantity() == 0){
			//remoção total
			ProdList.remove(o.prodName());
		
		}else{
			//quantidade total de produto restante
			quant = ProdList.get(o.prodName()) - o.quantity();
			ProdList.set(o.prodName(), quant);
		}
		
		//remoção de encomenda da lista 
		Fila.out();
		numOrders = numOrders - o.quantity();
		return o;
	}
	
	
	public int querry(Order o){ return ProdList.get(o.prodName()); }
	
	public void displayOrders(){ System.out.printf(Fila.toString()); }
	
	public int numOrders(){ return numOrders; }
	
	
}

