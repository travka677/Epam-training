package by.jonline.algoritmization.part_2;

// 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task12 {

	public static void main(String[] args) {
		
		// решение без лямбд
		
		int[][] matrix = { { 3, 4, 6, 2 }, 
        		   		   { 7, 0, 2, 0 }, 
        		   		   { 9, 5, 8, 0 },
        		   		   { 0, 1, 0, 1} };
		
		System.out.println("Исходная матрица");
		Task4.print(matrix);
		
		System.out.println("\nСтроки, отсортированные по возрастанию");
		sortRowAscending(matrix);
		Task4.print(matrix);
		
		System.out.println("\nСтроки, отсортированные по убыванию");
		sortRowDescending(matrix);
		Task4.print(matrix);
	}
	
	public static void sortAscending(int[] array) {
		
		boolean isSorted = false;
		
		while (!isSorted) {
			isSorted = true;
			
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					isSorted = false;
				}
			}
		}
		
	}
	
	public static void sortDescending(int[] array) {
		
		boolean isSorted = false;
		
		while (!isSorted) {
			isSorted = true;
			
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] < array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					isSorted = false;
				}
			}
		}
		
	}
	
	public static void sortRowAscending(int[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			sortAscending(matrix[i]);
		}
	}
	
	public static void sortRowDescending(int[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			sortDescending(matrix[i]);
		}
	}

}
