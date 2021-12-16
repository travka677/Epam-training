package by.jonline.algoritmization.array_of_array;

// 13. Отсортрировать столбцы матрицы по возрастанию и убыванию значений эементов.

public class Task13 {

	public static void main(String[] args) {
		
		int[][] matrix = { { 3, 4, 6, 2 }, 
						   { 7, 0, 2, 0 }, 
						   { 9, 5, 8, 0 },
						   { 0, 1, 0, 1 }, 
						   { 3, 7, 7, 4 } };
		
		System.out.println("Исходная матрица");
		Task4.print(matrix);
		
		System.out.println("\nСтолбцы, отсортированные по возрастанию");
		sortColumnsAscending(matrix);
		Task4.print(matrix);
		
		System.out.println("\nСтолбцы, отсортированные по убыванию");
		sortColumnsDescending(matrix);
		Task4.print(matrix);
	}
	
	public static void sortColumnsAscending(int[][] matrix) {
		
		boolean isSorted = false;
		
		for (int i = 0; i < matrix[i].length; i++) {
			
			while (!isSorted) {
				isSorted = true;
				
				for (int j = 0; j < matrix.length - 1; j++) {
					if (matrix[j][i] > matrix[j + 1][i]) {
						int temp = matrix[j][i];
						matrix[j][i] = matrix[j + 1][i];
						matrix[j + 1][i] = temp;
						isSorted = false;
					}
				}
			}
			isSorted = false;
			
		}
		
	}
	
	public static void sortColumnsDescending(int[][] matrix) {
		
		boolean isSorted = false;
		
		for (int i = 0; i < matrix[i].length; i++) {
			
			while (!isSorted) {
				isSorted = true;
				
				for (int j = 0; j < matrix.length - 1; j++) {
					if (matrix[j][i] < matrix[j + 1][i]) {
						int temp = matrix[j][i];
						matrix[j][i] = matrix[j + 1][i];
						matrix[j + 1][i] = temp;
						isSorted = false;
					}
				}
			}
			isSorted = false;
			
		}
		
	}


}
