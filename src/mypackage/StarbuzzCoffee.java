package mypackage;
import java.text.NumberFormat;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		Beverage beverage = new Expresso();
		System.out.println(beverage.getDescription()
				+ "\n	" + beverage.cost());
		
		beverage.setSize("large");
		beverage = new Soy(beverage);
		
		System.out.println("\n	Size and condiment added \n");
		
		System.out.println(beverage.getDescription()
				+ "\n Size: " + beverage.getSize()
				+ "\n	" + beverage.cost());
		
		System.out.println("\n	New Beverage \n");
		
		Beverage beverage2 = new Expresso();
		System.out.println(beverage2.getDescription()
				+ "\n	" + nf.format(beverage2.cost()));
		
		beverage2.setSize("small");
		
		beverage2 = new Soy(beverage2);
		beverage2 = new Whip(beverage2);
		
		System.out.println("\n\n	Size and condiment added \n\n");
		
		System.out.println(beverage2.getDescription()
				+ "\n Size: " + beverage2.getSize()
				+ "\n	" + nf.format(beverage2.cost()));
	}

	
	
	
	
	
	
}
