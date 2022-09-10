package mypackage;

public class Mocha extends CondimentDecorator {

	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getSize() {
		return beverage.getSize();
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	public double cost() {
		if (beverage.getSize().equalsIgnoreCase("large")) {
			return .25 + beverage.cost();
		} else if (beverage.getSize().equalsIgnoreCase("small")) {
			return .15 + beverage.cost();
		} else {
			return .20 + beverage.cost();
		}
	}

}
