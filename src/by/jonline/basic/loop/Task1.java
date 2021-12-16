package by.jonline.basic.loop;

import java.util.Scanner;

// 1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
// все числа от 1 до введенного пользователем числа.

public class Task1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int number;
		int sum = 0;
		
		do {
			System.out.println("Введите целое положительное число");
			System.out.print(">> ");
			
			while (!sc.hasNextInt()) {
				System.out.println("Это не число");
				System.out.print(">> ");
				sc.next();
			}
			number = sc.nextInt();
			
		} while (number <= 0);
		
		for (int i = 1; i < number; i++) {
			sum += i;
		}
		
		System.out.println("sum = " + sum);
	}

}
