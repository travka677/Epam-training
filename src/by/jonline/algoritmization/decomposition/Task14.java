package by.jonline.algoritmization.decomposition;

import java.util.Arrays;

// 14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, 
// возведенная в степень n, равна самому числу. 
// Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.

public class Task14 {

	public static void main(String[] args) {
		
		// упростить?
		int k = 370;
		
		if (k > 0) {
			System.out.println(Arrays.toString(isArmstrongNumber(k)));
		} else {
			System.out.println("Некорректные данные");
		}

	}

	public static int[] isArmstrongNumber(int k) {

		int[] numbers = new int[length(k)];
		int sum = 0;
		int index = 0;

		for (int i = 1; i <= k; i++) {

			int degree = countDigits(i);
			
			for (int j = i; j > 0; j /= 10) {
				sum += Math.pow((j % 10), degree);
			}
			if (sum == i) {
				numbers[index++] = i;
			}
			sum = 0;
		}

		return numbers;
	}

	public static int countDigits(int n) {
		
		int count = 0;
		
		for (int i = n; i > 0; i /= 10) {
			count++;
		}
		
		return count;
	}
	
	public static int length(int k) {

		int sum = 0;
		int length = 0;

		for (int i = 1; i <= k; i++) {

			int degree = countDigits(i);
			
			for (int j = i; j > 0; j /= 10) {
				sum += Math.pow((j % 10), degree);
			}
			if (sum == i) {
				length++;
			}
			sum = 0;
		}

		return length;
	}

}
