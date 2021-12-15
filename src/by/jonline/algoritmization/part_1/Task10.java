package by.jonline.algoritmization.part_1;

import java.util.Arrays;

// 10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями). 
// Примечание. Дополнительный массив не использовать.

public class Task10 {

	public static void main(String[] args) {
		
		int[] numbers = { 2, 9, 10, 5 ,6, 10, 7, 21, 3, 44, 12 };

		secondElementToZero(numbers);
		
		System.out.println(Arrays.toString(numbers));
		
		System.out.println(Arrays.toString((compress(numbers))));
		
	
	}
	
	public static int[] compress(int[] numbers) {
		
		int n;
		
		n = (numbers.length % 2 == 0) ? (numbers.length / 2) : (numbers.length / 2 + 1);
		
		for (int i = 1; i < n; i++) {
			numbers[i] = numbers[2 * i];
			numbers[2 * i] = 0;
		}
		
		return numbers;
	}
	
	public static void secondElementToZero(int[] numbers) {
		
		for (int i = 1; i < numbers.length; i += 2) {
			numbers[i] = 0;
		}
	}
}

