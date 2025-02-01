package _CoffeeMachineSimulator;

import java.util.Scanner;

public class CoffeeMachine {
	private int water;
	private int milk;
	private int coffeeBeans;
	private int disposableCups;
	private int money;
	
	CoffeeMachine() {
		this.water = 400;
		this.milk = 540;
		this.coffeeBeans = 120;
		this.disposableCups = 9;
		this.money = 550;
	}
	
	void printState() {
		System.out.println("\nThe coffee machine has:");
		System.out.println(this.water + " ml of water");
		System.out.println(this.milk + " ml of milk");
		System.out.println(this.coffeeBeans + " g of coffee beans");
		System.out.println(this.disposableCups + " disposable cups");
		System.out.println("$" + this.money + " of money");
	}
	
	void take() {
		System.out.println("I gave you $" + this.money);
		this.money = 0;
	}
	
	void fill() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write how many ml of water you want to add:");
		this.water += sc.nextInt();
		System.out.println("Write how many ml of milk you want to add:");
		this.milk += sc.nextInt();
		System.out.println("Write how many grams of coffee beans you want to add: ");
		this.coffeeBeans += sc.nextInt();
		System.out.println("Write how many disposable cups you want to add: ");
		this.disposableCups += sc.nextInt();
		
	}
	
	void buy() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
		
		String input = scanner.nextLine();
		if (input.equals("back")) {
			
		} else if (input.matches("\\d")) {
			int control = Integer.parseInt(input);
			switch (control) {
			case 1: Espresso espresso = new Espresso();
					if (this.water >= espresso.getWaterNeeded() && this.milk >= espresso.getMilkNeeded() &&
							this.coffeeBeans >= espresso.getCoffeeBeansNeeded() && this.disposableCups >= 1) {
						this.water -= espresso.getWaterNeeded();
						this.milk -= espresso.getMilkNeeded();
						this.coffeeBeans -= espresso.getCoffeeBeansNeeded();
						this.disposableCups--;
						this.money += espresso.getPrice();
						System.out.println("I have enough resources, making you a coffee!");
					} else if (this.water < espresso.getWaterNeeded()) {
						System.out.println("Sorry, not enough water!");
					} else if (this.coffeeBeans < espresso.getCoffeeBeansNeeded()) {
						System.out.println("Sorry, not enough coffee beans!");
					} else if (this.disposableCups < 1) {
						System.out.println("Sorry, not enough disposable cups!");
					} else {
						
					}
					
					break;
			case 2: Latte latte = new Latte();
					if (this.water >= latte.getWaterNeeded() && this.milk >= latte.getMilkNeeded() &&
							this.coffeeBeans >= latte.getCoffeeBeansNeeded() && this.disposableCups >= 1) {
						this.water -= latte.getWaterNeeded();
						this.milk -= latte.getMilkNeeded();
						this.coffeeBeans -= latte.getCoffeeBeansNeeded();
						this.disposableCups--;
						this.money += latte.getPrice();
						System.out.println("I have enough resources, making you a coffee!");
					} else if (this.water < latte.getWaterNeeded()) {
						System.out.println("Sorry, not enough water!");
					} else if (this.coffeeBeans < latte.getCoffeeBeansNeeded()) {
						System.out.println("Sorry, not enough coffee beans!");
					} else if (this.disposableCups < 1) {
						System.out.println("Sorry, not enough disposable cups!");
					} else {
						System.out.println("Sorry, not enough milk!");
					}
					
					break;		
			case 3: Cappuccino cappuccino = new Cappuccino();
					if (this.water >= cappuccino.getWaterNeeded() && this.milk >= cappuccino.getMilkNeeded() &&
							this.coffeeBeans >= cappuccino.getCoffeeBeansNeeded() && this.disposableCups >= 1) {
						this.water -= cappuccino.getWaterNeeded();
						this.milk -= cappuccino.getMilkNeeded();
						this.coffeeBeans -= cappuccino.getCoffeeBeansNeeded();
						this.disposableCups--;
						this.money += cappuccino.getPrice();
						System.out.println("I have enough resources, making you a coffee!");
					} else if (this.water < cappuccino.getWaterNeeded()) {
						System.out.println("Sorry, not enough water!");
					} else if (this.coffeeBeans < cappuccino.getCoffeeBeansNeeded()) {
						System.out.println("Sorry, not enough coffee beans!");
					} else if (this.disposableCups < 1) {
						System.out.println("Sorry, not enough disposable cups!");
					} else {
						System.out.println("Sorry, not enough milk!");
					}
					
					break;	
			default: System.out.println("");			
		}
		} else {
			System.out.println("");
		}
		
		
	}

}
