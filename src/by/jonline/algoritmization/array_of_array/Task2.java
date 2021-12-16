package by.jonline.algoritmization.array_of_array;

// 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task2 {

	public static void main(String[] args) {
		int[][] matrix = { { 23, 8, 11, 8 }, 
				   		   { 31, 1, 44, 3 }, 
				   		   { 14, 3, 83, 1 }, 
				   		   { 16, 4, 11, 3 } };
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == j) {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}


	}

}
