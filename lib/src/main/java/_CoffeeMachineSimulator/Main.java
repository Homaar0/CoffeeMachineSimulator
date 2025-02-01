package _CoffeeMachineSimulator;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CoffeeMachine machine = new CoffeeMachine();
		machine.printState();
		System.out.println("\nWrite action (buy, fill, take):");
		String input = scanner.nextLine();
		if (input.equals("buy")) {
			machine.buy();
		} else if (input.equals("fill")) {
			machine.fill();
		} else if (input.equals("take")) {
			machine.take();
		} else {
			System.out.println("");
		}
		machine.printState();
		scanner.close();
	}

}
