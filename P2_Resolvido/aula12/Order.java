
class Order {

  public final String clientName;
  public final String prodName;
  public final int quantity;

  Order(String client, String prod, int quant) {
    prodName = prod;
    clientName = client;
    quantity = quant;
  }

  public String toString() {
    return String.format("Order(%s, %s, %d)", clientName, prodName, quantity);
  }
  
  public int quantity(){
	return quantity;
  }
  
  public String prodName(){
	return prodName;
  }
  
  public String clientName(){
	return clientName;
  }
}
