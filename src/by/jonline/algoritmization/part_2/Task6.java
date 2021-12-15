package by.jonline.algoritmization.part_2;

// 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task6 {

	public static void main(String[] args) {

		int n;

		// Метод ввода с консоли и метод печати матрицы из задания 4 будут также
		// использоваться для 5 и 6 задания

		n = Task4.enterFromConsole("n >> ");
		int[][] matrix = createMatrix(n);
		
		Task4.print(matrix);

	}
	
	public static int[][] createMatrix(int n) {
		
		int[][] matrix = new int[n][n] ;
		
		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < n - i; j++) {
				matrix[i][j] = 1;
			}
		}
		
		for (int i = n / 2; i < n; i++) {
			for (int j = n - i - 1; j < i + 1; j++) {
				matrix[i][j] = 1;
			}
		}
		
		return matrix;
	}

}
