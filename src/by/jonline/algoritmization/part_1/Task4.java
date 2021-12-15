package by.jonline.algoritmization.part_1;

// 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class Task4 {

	public static void main(String[] args) {
		double[] numbers = {0, -3, 3.45, 0, 7.65, -99, 45.9, 6, -7.34, 111.1};
		
		double max = numbers[0];
		double min = numbers[0];
		int indexMax = 0;
		int indexMin = 0;
		
		System.out.print("Исходная последовательность: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "  ");
		} 
		
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
				indexMax = i;
			} 
		}
		
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
				indexMin = i;
			}
		}
		
		
		numbers[indexMin] = max;
		numbers[indexMax] = min;
		
		System.out.print("\nКонечная последовательность: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "  ");
		}

	}

}
