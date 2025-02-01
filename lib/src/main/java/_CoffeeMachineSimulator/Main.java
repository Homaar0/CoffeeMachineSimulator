package _CoffeeMachineSimulator;

import java.util.Scanner;

public class Main {
	private static final int waterNeeded = 200;
	private static final int coffeeBeansNeeded = 15;
	private static final int milkNeeded = 50;
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write how many ml of water the coffee machine has:");
		int water = scanner.nextInt();
		int waterCups = water / waterNeeded;
		System.out.println("Write how many ml of milk the coffee machine has:");
		int milk = scanner.nextInt();
		int milkCups = milk / milkNeeded;
		System.out.println("Write how many grams of coffee beans the coffee machine has:");
		int coffeeBeans = scanner.nextInt();
		int coffeeBeansCups = coffeeBeans / coffeeBeansNeeded;
		System.out.println("Write how many cups of coffee you will need: ");
		int cups = scanner.nextInt();
		int canMakeCups = Math.min(waterCups, milkCups);
		canMakeCups = Math.min(canMakeCups, coffeeBeansCups);
		if (cups == canMakeCups) {
			System.out.println("Yes, I can make that amount of coffee");
		} else if (cups > canMakeCups) {
			System.out.println("No, I can make only " + canMakeCups + " cup(s) of coffee");
		} else {
			System.out.println("Yes, I can make that amount of coffee (and even " + (canMakeCups - cups) + " more than that)");
		}

		scanner.close();
	}

}
