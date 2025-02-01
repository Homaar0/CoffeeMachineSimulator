package _CoffeeMachineSimulator;

import java.util.Scanner;

public class Main {
	private static final int water = 200;
	private static final int coffeeBeans = 15;
	private static final int milk = 50;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write how many cups of coffee you will need: ");
		int cups = scanner.nextInt();
		System.out.println("For " + cups + " cups of coffee you will need:");
		System.out.println(water * cups + " ml of water");
		System.out.println(milk * cups + " ml of milk");
		System.out.println(coffeeBeans * cups + " g of coffee beans");
		scanner.close();
	}

}
