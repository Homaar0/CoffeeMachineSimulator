package _CoffeeMachineSimulator;

public class Espresso {
	private final int waterNeeded = 250;
	private final int coffeeBeansNeeded = 16;
	private final int milkNeeded = 0;
	private final int price = 4;
	
	int getWaterNeeded() {
		return this.waterNeeded;
	}
	
	int getCoffeeBeansNeeded() {
		return this.coffeeBeansNeeded;
	}
	
	int getMilkNeeded() {
		return this.milkNeeded;
	}
	
	int getPrice() {
		return this.price;
	}

}
