package by.jonline.algoritmization.array_of_array;

import java.util.Scanner;

//  14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, 
// причем в каждом столбце число единиц равно номеру столбца.

public class Task14 {

	public static void main(String[] args) {
		
		// длина строки(n) не должна быть больше, чем длина матрицы + 1 (если отсчет идет с 0)
		int m;
		int n;
		
		m = enterFromConsole("m >> ");
		n = enterFromConsole("n >> ", m);
		
		int[][] matrix = createMatrix(m, n);
		Task4.print(matrix);
	}
	
	public static int[][] createMatrix(int m, int n) {
		
		int[][] matrix = new int[m][n];
		
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; ) {
				
				int k = (int)(Math.random() * m);
				
				if (matrix[k][i] == 0) {
					matrix[k][i] = 1;
					j++;
				}
			}
		}
		
		return matrix;
	}
	
	public static int enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int value;

		System.out.println("Введите кол-во столбцов матрицы: ");

		do {
			System.out.print(message);

			while (!sc.hasNextInt()) {
				System.out.println("Введите целое натуральное число");
				System.out.print(message);
				sc.next();
			}
			value = sc.nextInt();

			if (value < 1) {
				System.out.println("Значение n должно быть больше 0");
			}

		} while (value < 1);

		return value;

	}
	
	public static int enterFromConsole(String message, int m) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int value;

		System.out.println("Введите кол-во строк матрицы: ");

		do {
			System.out.print(message);

			while (!sc.hasNextInt()) {
				System.out.println("Введите целое натуральное число");
				System.out.print(message);
				sc.next();
			}
			value = sc.nextInt();

			if (value < 1) {
				System.out.println("Значение n должно быть больше 0");
			} else if (value > m + 1) {
				System.out.println("n превышает допустимое значение");
			}

		} while (value < 1 || value > m + 1);

		return value;

	}

}
