package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.set_id(1);
		product.set_name("Laptop");
		product.set_description("Monster Laptop");
		product.set_price(15000);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);

	}

}
