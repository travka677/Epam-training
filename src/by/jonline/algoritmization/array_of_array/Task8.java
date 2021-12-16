package by.jonline.algoritmization.array_of_array;

import java.util.Scanner;

// 8. В числовой матрице поменять местами два столбца любых столбца, т. е. 
// все элементы одного столбца поставить на соответствующие им позиции другого, 
// а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.

public class Task8 {

	public static void main(String[] args) {

		// для удовлетворения условия задачи, кол-во эл-в в строке должно быть одинаковым
		
		int[][] matrix = { { 3, 4, 6 }, 
				           { 7, 1, 2 }, 
				           { 9, 5, 8 },
				           { 4, 4, 5 } };

		int n1;
		int n2;

		n1 = enterFromConsole("n1 >> ", matrix[0].length);
		n2 = enterFromConsole("n2 >> ", matrix[0].length);

		Task4.print(matrix);
		
		changeMatrix(matrix, n1, n2);
		
		System.out.println();
		Task4.print(matrix);
	}

	public static void changeMatrix(int[][] matrix, int n1, int n2) {

		if (n1 == n2) {
			return;
		}
		
		for (int i = 0; i < matrix.length; i++) {
			int temp = matrix[i][n1];
			matrix[i][n1] = matrix[i][n2];
			matrix[i][n2] = temp;
		}
		
	}

	public static int enterFromConsole(String message, int k) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int value;

		System.out.println("Введите столбец матрицы: ");

		do {
			System.out.print(message);

			while (!sc.hasNextInt()) {
				System.out.println("Введите целое натуральное число");
				System.out.print(message);
				sc.next();
			}
			value = sc.nextInt();

			if (value < 0) {
				System.out.println("Значение n должно быть больше положительным");
			} else if (value >= k) {
				System.out.println("Значение n превышает допустимое значение");
			}

		} while (value < 0 || value >= k);

		return value;

	}
}
