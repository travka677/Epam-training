package by.jonline.algoritmization.part_2;

// 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task1 {

	public static void main(String[] args) {
		int[][] matrix = { { 23, 8, 11, 8, 5 }, 
						   { 31, 1, 44, 3, 1 }, 
						   { 14, 3, 83, 1, 1 }, 
						   { 16, 4, 11, 3, 1 } };

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j += 2) {
				if (matrix[0][j] > matrix[matrix.length - 1][j]) {
					System.out.print(matrix[i][j] + " ");
				}

			}
			System.out.println();
		}
	}

}
