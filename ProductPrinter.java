
public class ProductPrinter {

	public static void main(String[] args) {
		
		Product toaster = new Product("Toaster", 29.95);
		Product game = new Product("Atlas", 59.99);
		System.out.println(toaster.getName() + " costs: " + toaster.getPrice() + "\n" + game.getName() + " Costs: " + game.getPrice());
		toaster.reducePrice(5);
		game.reducePrice(5);
		System.out.println(toaster.getName() + " costs: " + toaster.getPrice() + "\n" + game.getName() + " Costs: " + game.getPrice());
		
	}
}
