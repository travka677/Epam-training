package by.jonline.algoritmization.part_1;

// 3. Дан массив действительных чисел, размерность которого N. 
// Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

public class Task3 {

	public static void main(String[] args) {
		double[] numbers = {0, -3, 3.45, 0, 0, -99, 45.9, 6, -7.34, 1};
		
		int countZero = 0;
		int countNeg = 0;
		int countPos = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				countZero++;
			} else if (numbers[i] > 0) {
				countPos++;
			} else {
				countNeg++;
			}
		}
		
		System.out.println("Количество нулей - " + countZero);
		System.out.println("Количество положительных - " + countPos);
		System.out.println("Количество отрицательных - " + countNeg);

	}

}
