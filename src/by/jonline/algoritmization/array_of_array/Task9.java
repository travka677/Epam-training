package by.jonline.algoritmization.array_of_array;

import java.util.Arrays;

//  9. Задана матрица неотрицательных чисел. 
// Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму.

public class Task9 {

	public static void main(String[] args) {
		
		int[][] matrix = { { 3, 4, 6 }, 
		                   { 0, 1, 2, 4, 2 }, 
		                   { 9, 5, 8, 4, 6 },
		                   { 4, 4, 5, 1 } };
		
		int[] sums = countSums(matrix);
		int column = columnWithMaxSum(sums);
		
		System.out.println(Arrays.toString(sums));
		System.out.println(column);

	}
	
	public static int[] countSums(int[][] matrix) {
		
		int length = maxRowLength(matrix);
		int[] sums = new int[length];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sums[j] += matrix[i][j];
			}
		}
		
		return sums;
	}
	
	public static int columnWithMaxSum(int[] array) {
		
		int max = array[0];
		int index = 0;
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				index = i;
			}
		}
		
		return index;
	}
	
	public static int maxRowLength(int[][] matrix) {
		
		int max = matrix[0].length;
		
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i].length > max) {
				max = matrix[i].length;
			}
		}
		
		return max;
	}

}
