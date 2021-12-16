package by.jonline.algoritmization.array;

// 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task1 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int k = 3;
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			int n = (int)(Math.random() * 100);
			a[i] = n;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % k == 0) {
				sum += a[i];
			}
		}
		
		System.out.println("sum = " + sum);

	}

}
