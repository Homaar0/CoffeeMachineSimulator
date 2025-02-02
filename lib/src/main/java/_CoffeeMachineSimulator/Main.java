package _CoffeeMachineSimulator;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CoffeeMachine machine = new CoffeeMachine();
		boolean work = true;
		while (work) {
			if (!machine.isBuyingDirtyCoffee()) {
				System.out.println("\nWrite action (buy, fill, take, clean, remaining, exit): ");
			}
		
			String input = scanner.nextLine();
			if (input.equals("buy")) {
				machine.buy();
			} else if (input.equals("fill")) {
				machine.fill();
			} else if (input.equals("take")) {
				machine.take();
			} else if (input.equals("remaining")) {
				machine.printState();
			} else if (input.equals("clean")) {
				machine.clean();
			} else if (input.equals("exit")) {
				work = false;
			} else {
				System.out.println("");
			}
		}
		scanner.close();
	}

}
