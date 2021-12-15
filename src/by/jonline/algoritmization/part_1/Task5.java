package by.jonline.algoritmization.part_1;

// 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class Task5 {

	public static void main(String[] args) {
		int[] numbers = {3, 2, 1, 4, 7, 6, 11};
		
		for (int i = 0; i < numbers.length; i++) {
			// если i - это индекс, начинающийся с 0
			if (numbers[i] > i) {
				System.out.println(numbers[i]);
			}
		}

	}

}
