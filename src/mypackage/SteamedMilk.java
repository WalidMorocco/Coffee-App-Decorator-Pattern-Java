package mypackage;

public class SteamedMilk extends CondimentDecorator {

	Beverage beverage;

	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getSize() {
		return beverage.getSize();
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Steamed Milk";
	}

	public double cost() {
		if (beverage.getSize().equalsIgnoreCase("large")) {
			return .15 + beverage.cost();
		} else if (beverage.getSize().equalsIgnoreCase("small")) {
			return .05 + beverage.cost();
		} else {
			return .10 + beverage.cost();
		}
	}

}
