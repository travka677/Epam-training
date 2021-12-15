package by.jonline.algoritmization.part_2;

import java.util.Scanner;

// 7. Сформировать квадратную матрицу порядка N по правилу:

public class Task7 {
	
	public static void main(String[] args) {
		
		int n;
		
		n = enterFromConsole("n >> ");
		double[][] matrix = createMatrix(n);
		
		print(matrix);
		
		int k = countPositive(matrix);
		System.out.println();
		System.out.println("Кол-во положительных элементов " + k);
	}
	
	public static int countPositive(double[][] matrix) {
		
		int count = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > 0) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static double[][] createMatrix(int n) {
		
		double[][] matrix = new double[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = Math.sin((i*i - j*j) / n);
			}
		}
		
		return matrix;
	}
	
	public static void print(double[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 0) {
					System.out.printf("%.2f ", matrix[i][j]);
				} else {
					System.out.printf(" %.2f ", matrix[i][j]);
				}
			}
			System.out.println();
		}
	}
	
	public static int enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int value;
		
		System.out.println("Введите порядок матрицы: ");
		
		do {
			System.out.print(message);
			
			while (!sc.hasNextInt()) {
				System.out.println("Введите целое натуральное число");
				System.out.print(message);
				sc.next();
			}
			value = sc.nextInt();
			
			if (value <= 0) {
				System.out.println("Значение n должно быть больше 0");
			} 
			
		} while (value <= 0);
		
		return value;
		
	}
}
