package by.jonline.algoritmization.array_of_array;


//  11. Матрицу 10x20 заполнить случайными числами от 0 до 15. 
// Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.

public class Task11 {

	public static void main(String[] args) {
		
		int m = 10;
		int n = 20;
		int number = 5;
		
		int[][] matrix = createMatrix(m, n);
		print(matrix);
		
		System.out.println();
		printSomeRow(number, matrix);
	}
	
	public static void printSomeRow(int n, int[][] matrix) {
		
		int count = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == n) {
					count++;
				}
			}
			if (count >= 3) {
				System.out.print(i + " ");
			}
			count = 0;
		}
	}
	
	public static int[][] createMatrix(int m, int n) {
		
		int[][] matrix = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (int)(Math.random() * 16);
			}
		}
		
		return matrix;
	}
	
	public static void print(int[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%-2d  ", matrix[i][j]);
			}
			System.out.println();
		}
	}

}
