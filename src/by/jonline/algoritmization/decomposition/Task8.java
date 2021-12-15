package by.jonline.algoritmization.decomposition;

import java.util.Scanner;

// 8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. 
// Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива 
// с номерами от k до m.

public class Task8 {

	public static void main(String[] args) {

		int[] numbers = { 2, 4, 2, 3, 1, 7, 9 };
		int k;
		int m;

		k = enterLowerBound(numbers);
		
		// значение m может быть >= n
		m = enterUpperBound(numbers, k);

		System.out.println("sum = " + sum(numbers, k, m));

	}

	public static int sum(int[] numbers, int k, int m) {

		int sum = 0;
		int count = 0;

		for (int i = k; i <= m && count < 3; i++) {
			sum += numbers[i];
			count++;
		}

		return sum;
	}

	public static int enterLowerBound(int[] numbers) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int value;

		System.out.println("Введите натуральное положительное число");

		do {
			System.out.print("k >> ");

			while (!sc.hasNextInt()) {
				System.out.println("Введите натуральное положительное число");
				System.out.print("k >> ");
				sc.next();
			}
			value = sc.nextInt();

			if (value < 0) {
				System.out.println("Нижняя граница k должна быть положительной");
			} else if (value >= numbers.length - 3) {
				System.out.println("Нижняя граница k превышает допустимое значение");
			}

		} while (value < 0 || value >= numbers.length - 3);

		return value;
	}

	public static int enterUpperBound(int[] numbers, int k) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int value;

		System.out.println("Введите натуральное положительное число");

		do {
			System.out.print("m >> ");

			while (!sc.hasNextInt()) {
				System.out.println("Введите натуральное положительное число");
				System.out.print("m >> ");
				sc.next();
			}
			value = sc.nextInt();

			if (value < 0) {
				System.out.println("Верхняя граница m должна быть положительной");
			} else if (value >= numbers.length) {
				System.out.println("Верхняя граница m превышает допустимое значение");
			} else if (value < k) {
				System.out.println("Значение верхней границы должно быть больше значения верхней границы");
			}

		} while (value < 0 || value >= numbers.length || value < k);

		return value;
	}

}
