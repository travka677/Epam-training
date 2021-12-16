package by.jonline.algoritmization.array_of_array;

// 5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task5 {

	public static void main(String[] args) {
		
		int n;
		
		// Метод ввода с консоли и метод печати матрицы из задания 4 будут также использоваться для 5 и 6 задания
		
		n = Task4.enterFromConsole("n >> ");
		int[][] matrix = createMatrix(n);
		
		Task4.print(matrix);
		
	}
	
	public static int[][] createMatrix(int n) {
		
		int[][] matrix = new int[n][n];
		int count = n;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < count; j++) {
				matrix[i][j] = i + 1;
			}
			count--;
		}
		
		return matrix;
	}

}
