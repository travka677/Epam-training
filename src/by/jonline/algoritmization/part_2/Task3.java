package by.jonline.algoritmization.part_2;

import java.util.Scanner;

// 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task3 {

	public static void main(String[] args) {
		int[][] matrix = { { 23 }, 
						   { 31, 1, 44 }, 
						   { 14, 3, 83, 0, 7 }, 
						   { 16, 4, 11, 9 } };

		int k;
		int p;

		System.out.println("Введите номер строки");
		k = enterFromConsole("k >> ", matrix.length - 1);

		printRow(matrix, k);

		System.out.println();

		System.out.println("Введите номер столбца");
		p = enterFromConsole("p >> ", maxRowLength(matrix)-1);

		printColumn(matrix, p);

	}

	public static int enterFromConsole(String message, int length) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int value;

		
		do {
			System.out.print(message);

			while (!sc.hasNextInt()) {
				System.out.print(message);
				sc.next();
			}

			value = sc.nextInt();

		} while (value < 0 || value > length);

		return value;
	}

	public static int maxRowLength(int[][] matrix) {
		int max = 0;

		for (int i = 0; i < matrix.length; i++) {

			int j = 0;
			while (j < matrix[i].length) {
				j++;
			}
			
			if (j > max) {
				max = j;
			}
		}
		
		return max;
	}

	public static void printRow(int[][] matrix, int k) {
		for (int i = 0; i < matrix[k].length; i++) {
			System.out.print(matrix[k][i] + " ");
		}
	}

	public static void printColumn(int[][] matrix, int p) {
		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {
				if (j == p) {
					System.out.println(matrix[i][j]);
				}
			}
		}
	}

}
