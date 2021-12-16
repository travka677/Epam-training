package by.jonline.algoritmization.array;

// 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом. 
// Подсчитать количество замен.

public class Task2 {

	public static void main(String[] args) {
		double[] numbers = {12, 3.56, 0, 200, -87, -24.44, 9, 1, 1};
		double z = 1.0;
		
		
		System.out.print("Исходная последовательность: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "  ");
		}
		
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > z) {
				++count;
				numbers[i] = z;
			}
		}
		
		System.out.print("\nКонечная последовательность: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "  ");
		}
		
		System.out.println("\nКоличество замен: " + count);

	}

}
