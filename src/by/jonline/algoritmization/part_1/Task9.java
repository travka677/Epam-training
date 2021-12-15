package by.jonline.algoritmization.part_1;

// 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
// Если таких чисел несколько, то определить наименьшее из них.

public class Task9 {

	public static void main(String[] args) {

		int[] numbers = { 3, 3, 5, 2, 2, 10, 10, 2, 6, 6, 6, 10 };
		
		int[] sortedNumbers = sorted(numbers);
		int[][] countedNumbers = countedNumbers(sortedNumbers);
		int maxAmount = maxAmount(countedNumbers);
		int[] mostCommonNumbers = mostCommonNumbers(maxAmount, countedNumbers);
	
		int min = min(mostCommonNumbers);
		
		System.out.println("min = " + min);
		
	}

	public static int[] sorted(int[] numbers) {
		boolean isSorted = false;

		while (!isSorted) {
			isSorted = true;

			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) {
					int temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					isSorted = false;
				}

			}

		}

		return numbers;
	}
	
	public static int maxAmount (int[][] numbers) {
		
		int max = numbers[0][1];
		
		for (int i = 1; i < numbers.length; i ++) {
			if (numbers[i][1] > max) {
				max = numbers[i][1];
			}
		}
		
		return max;
	}

	public static int length(int amount, int[][] numbers) {
		
		int length = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i][1] == amount) {
				length++;
			}
		}
		
		return length;
	}
	
	public static int[] mostCommonNumbers(int amount, int[][] numbers) {
		
		int[] mostCommonNumbers = new int[length(amount, numbers)];
		int k = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i][1] == amount) {
				mostCommonNumbers[k] = numbers[i][0];
				k++;
			}
		}
		
		return mostCommonNumbers;
	}
	
	public static int min (int[] numbers) {
		
		int min = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		
		return min;
	}
	
	public static int[][] countedNumbers(int[] numbers) {

		int[][] countedNumbers = new int[numbers.length][2];

		int count = 1;
		int k = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			count = 1;
			int number = numbers[i];
			countedNumbers[k][0] = number;
			
			while (i < numbers.length) {
				if (i == numbers.length - 1) {
					break;
				}
				if (number == numbers[i + 1]) {
					count++;
					i++;
				} else 
					break;
			}
			countedNumbers[k][1] = count;
			k++;
		}

		return countedNumbers;

	}

}
