package by.jonline.algoritmization.part_2;

// 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task15 {

	public static void main(String[] args) {
		
		int[][] matrix = { { 3, 4, 6, 2 }, 
						   { 7, 0, 2, 0 }, 
						   { 9, 5, 8, 1 },
						   { 0, 1, 0, 1 }, 
						   { 3, 1, 7, 4 } };
		
		System.out.println("Исходная матрица");
		Task4.print(matrix);
		
		int max = max(matrix);
		changeMatrix(matrix, max);
		
		System.out.println("\nИзмененная матрица");
		Task4.print(matrix);
	}
	
	public static int max(int[][] matrix) {
		
		int max = matrix[0][0];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
		}
		
		return max;
	}
	
	public static void changeMatrix(int[][] matrix, int n) {
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] % 2 != 0) {
					matrix[i][j] = n;
				}
			}
		}
	}

}
