package by.jonline.algoritmization.decomposition;

// 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Task2 {

	public static void main(String[] args) {
		
		int[] numbers = { 4, 28, 12, 8 };

		if (numbers.length >= 2 && isPositive(numbers)) {
			System.out.println("НОД = " + gcf(numbers));
		} else {
			System.out.println("Error");
		}

	}

	public static int gcf(int[] numbers) {
		
		int max;

		max = Task1.gcf(numbers[0], numbers[1]);

		for (int i = 2; i < numbers.length; i++) {
			max = Task1.gcf(max, numbers[i]);
		}

		return max;
	}

	public static boolean isPositive(int[] numbers) {
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				return false;
			}
		}

		return true;
	}

}
