package by.jonline.algoritmization.part_2;

// 10. Найти положительные элементы главной диагонали квадратной матрицы.

public class Task10 {

	public static void main(String[] args) {
		
		int[][] matrix = { { 3, 4, 6, 2 }, 
		           		   { 7, 0, 2, 0 }, 
		           		   { 9, 5, -8, 0 },
		           		   { 0, 1, 0, 1}  };
		
		int[] numbers = mainDiagonalPositiveElemets(matrix);
		
		print(numbers);
		
	} 
	
	public static int[] mainDiagonalPositiveElemets(int[][] matrix) {
		
		int length = length(matrix);
		int[] numbers = new int[length];
		
		int index = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			if (i < matrix[i].length && matrix[i][i] > 0) {
				numbers[index++] = matrix[i][i];
			}
		}
		
		return numbers;
	}
	
	public static void print(int[] numbers) {
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				System.out.print(numbers[i] + " ");
			}
		}
	}
	
	public static int length(int[][] matrix) {
		
		int length = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			if (i < matrix[i].length) {
				length++;
			}
		}
		
		return length;
	}

}
