package mypackage;

public class Soy extends CondimentDecorator {

	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getSize() {
		return beverage.getSize();
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		if (beverage.getSize().equalsIgnoreCase("large")) {
			return .20 + beverage.cost();
		} else if (beverage.getSize().equalsIgnoreCase("small")) {
			return .10 + beverage.cost();
		} else {
			return .15 + beverage.cost();
		}
	}

}
