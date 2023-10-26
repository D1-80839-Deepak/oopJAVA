package com.app.fruits.tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruits;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {

	public static void main(String[] args) {
		int size;
		int choice;
		String color = null;
		double weight = 0.0;
		String name = null;
		boolean isFresh = true;

		int index = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Fruit Basket :");
		size = sc.nextInt();

		if (size <= 0) {
			System.out.println("Fruit Basket size should minimum of 1");
		} else {
			Fruits basket[] = new Fruits[size];

			do {
				System.out.println();
				System.out.println("================================================");
				System.out.println("1. Add Mango");
				System.out.println("2. Add Orange");
				System.out.println("3. Add Apple");
				System.out.println("4. Display names of all fruits in the basket");
				System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket");
				System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket");
				System.out.println("7. Mark a fruit as stale");
				System.out.println("8. Mark all sour fruits stale");
				System.out.println("0. Exit");
				System.out.println();
				System.out.print("Enter choice");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println();
					System.out.println("================================================");
					if (index < size) {
						System.out.print("Enter Color - ");
						color = sc.next();
						System.out.print("Enter Weight - ");
						weight = sc.nextDouble();
						System.out.print("Enter Name - ");
						name = sc.next();
						System.out.print("Is fruit staled (true or false) - ");
						isFresh = sc.nextBoolean();
						basket[index] = new Mango(color, weight, name, isFresh);
						index++;
					} else {
						System.out.println("Basket is full");
					}
					break;
				case 2:
					System.out.println();
					System.out.println("================================================");
					if (index < size) {
						System.out.print("Enter Color - ");
						color = sc.next();
						System.out.print("Enter Weight - ");
						weight = sc.nextDouble();
						System.out.print("Enter Name - ");
						name = sc.next();
						System.out.print("Is fruit staled (true or false) - ");
						isFresh = sc.nextBoolean();
						basket[index] = new Orange(color, weight, name, isFresh);
						index++;
					} else {
						System.out.println("-----Basket is full-----");
					}
					break;
				case 3:
					System.out.println();
					System.out.println("================================================");
					if (index < size) {
						System.out.print("Enter Color - ");
						color = sc.next();
						System.out.print("Enter Weight - ");
						weight = sc.nextDouble();
						System.out.print("Enter Name - ");
						name = sc.next();
						System.out.print("Is fruit staled (true or false) - ");
						isFresh = sc.nextBoolean();
						basket[index] = new Apple(color, weight, name, isFresh);
						index++;
					} else {
						System.out.println("-----Basket is full-----");
					}
					break;
				case 4:
					System.out.println();
					System.out.println("================================================");
					System.out.println("-----Your Basket has-----");
					for (Fruits fruits : basket) {
						if (fruits != null)
							if (fruits.getName() != null) {
								System.out.println(fruits.getName());
							}
					}
					break;
				case 5:
					System.out.println();
					System.out.println("================================================");
					System.out.println("-----Your Basket has-----");
					for (Fruits fruits : basket) {
						if (fruits != null) {
							System.out.println(fruits);
							System.out.println("It tastes " + fruits.test());
						}
					}
					break;
				case 6:
					System.out.println();
					System.out.println("================================================");
					for (int i = 0; i < index; i++) {
						if (basket[i].isFresh() == false) {
							System.out.println(basket[i].getName());
						}
					}
					break;
				case 7:
					System.out.print("-----Enter the number of fruit mark to be staled-----");
					int ind = new Scanner(System.in).nextInt();
					if (ind <= index) {
						basket[ind].setFresh(false);
					}
					break;
				case 8:
					System.out.println();
					System.out.println("================================================");
					for(Fruits fruits : basket) {
						if(fruits != null) {
							fruits.setFresh(false);
						}
					}
					break;

				default:
					System.out.println("------Value mismatch-----");
					break;
				}

			} while (choice != 0);

		}
	}
}
