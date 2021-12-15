package by.jonline.algoritmization.part_2;

import java.util.Scanner;

// 4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task4 {
	
	public static void main(String[] args) {
		
		int n;
		
		n = enterFromConsole("n >> ");
		 
		int[][] matrix = createMatrix(n);
		
		print(matrix);
	}
	
	public static int[][] createMatrix(int n) {
		
		int[][] matrix = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			int number;
			
			if (i % 2 == 0) {
				number = 1;
				for (int j = 0; j < n; j++) {
					matrix[i][j] = number++;
				}
			} else {
				number = n;
				for (int j = 0 ; j < n; j++) {
					matrix[i][j] = number--;
				}
			}
		}
		
		return matrix;
	}
	
	public static void print(int[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			} 
			System.out.println();
		}
	}
	
	public static int enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int value;
		
		System.out.println("Введите порядок матрицы (n > 3, n - четное): ");
		
		do {
			System.out.print(message);
			
			while (!sc.hasNextInt()) {
				System.out.println("Введите целое натуральное число");
				System.out.print(message);
				sc.next();
			}
			value = sc.nextInt();
			
			if (value < 4) {
				System.out.println("Значение n должно быть больше 3");
			} else if (value % 2 != 0) {
				System.out.println("Значение n должно быть четным");
			}
			
		} while (value < 4 || value % 2 != 0);
		
		return value;
		
	}

}
